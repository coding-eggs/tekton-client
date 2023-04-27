package cn.codegg.tekton.v1beta1.trigger;

import com.google.gson.JsonObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1InterceptorParams {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "value", position = 1)
    private JsonObject value;

}
