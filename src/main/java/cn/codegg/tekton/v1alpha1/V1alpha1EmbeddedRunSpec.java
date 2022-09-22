package cn.codegg.tekton.v1alpha1;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1alpha1EmbeddedRunSpec {

    @ApiModelProperty(value = "metadata", position = 0)
    private V1alpha1PipelineTaskMetadata metadata;

    @ApiModelProperty(value = "spec", position = 1)
    private Object spec;

}
