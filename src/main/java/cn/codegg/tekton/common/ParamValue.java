package cn.codegg.tekton.common;

import cn.codegg.tekton.v1.task.V1TaskRef;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonAdapter(ParamValue.ParamValueAdapter.class)
public class ParamValue {

    @ApiModelProperty(value = "type: array; object; string", position = 0)
    private String type;

    @ApiModelProperty(value = "stringVal", position = 1)
    private String stringVal;

    @ApiModelProperty(value = "arrayVal", position = 2)
    private List<String> arrayVal;

    @ApiModelProperty(value = "ObjectVal", position = 3)
    private Map<String,String> objectVal;

    public ParamValue(String stringVal) {
        this.type = "string";
        this.stringVal = stringVal;
    }

    public ParamValue(List<String> arrayVal) {
        this.type = "array";
        this.arrayVal = arrayVal;
    }

    public ParamValue(Map<String, String> objectVal) {
        this.type = "object";
        this.objectVal = objectVal;
    }


    public static class ParamValueAdapter extends TypeAdapter<ParamValue> {
        @Override
        public void write(JsonWriter jsonWriter, ParamValue paramValue) throws IOException {
            if ("string".equals(paramValue.type)) {
                jsonWriter.value(paramValue.getStringVal());
            }else if ("object".equals(paramValue.type)) {
                if (paramValue.getObjectVal() == null) {
                    jsonWriter.beginObject().endObject();
                }else {
                    jsonWriter.jsonValue(new Gson().toJson(paramValue.getObjectVal()));
                }
            }else {
                if (paramValue.getArrayVal() == null || paramValue.getArrayVal().size() == 0) {
                    jsonWriter.beginArray().endArray();
                }else {
                    jsonWriter.jsonValue(new Gson().toJson(paramValue.getArrayVal()));
                }
            }
        }

        @Override
        public ParamValue read(JsonReader jsonReader) throws IOException {
            final JsonToken nextToken = jsonReader.peek();
            if (nextToken == JsonToken.STRING) {
                return new ParamValue(jsonReader.nextString());
            }else if (nextToken == JsonToken.BEGIN_OBJECT) {
                TypeAdapter<Map<String, String>> typeAdapter = new Gson().getAdapter(new TypeToken<>() {});
                Map<String, String> result = typeAdapter.read(jsonReader);
                return new ParamValue(result);
            }else {
                TypeAdapter<List<String>> typeAdapter = new Gson().getAdapter(new TypeToken<>() {});
                List<String> result = typeAdapter.read(jsonReader);
                return new ParamValue(result);
            }
        }
    }

}
