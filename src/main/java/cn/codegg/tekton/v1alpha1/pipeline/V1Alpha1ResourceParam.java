package cn.codegg.tekton.v1alpha1.pipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1ResourceParam {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "value", position = 1)
    private String value;

}
