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
public class V1Alpha1EmbeddedRunSpec {

    @ApiModelProperty(value = "metadata", position = 0)
    private V1Alpha1PipelineTaskMetadata metadata;

    @ApiModelProperty(value = "spec", position = 1)
    private Object spec;

}
