package cn.codegg.tekton.v1beta1.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskResult {

    @ApiModelProperty(value = "result name" ,position = 0)
    private String name;

    @ApiModelProperty(value = "type", notes = "string 后续可能会支持数组 array" ,position = 1)
    private String type;

    @ApiModelProperty(value = "Properties 是支持键值对结果的 JSON Schema 属性" ,position = 2)
    private Map<String,String> properties;

    @ApiModelProperty(value = "result 描述" ,position = 3)
    private String description;

}
