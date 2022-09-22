package cn.codegg.tekton.v1beta1.pipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1PipelineDeclaredResource {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "type", position = 1)
    private String type;

    @ApiModelProperty(value = "optional", position = 2)
    private Boolean optional;

}
