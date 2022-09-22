package cn.codegg.tekton.v1beta1.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1beta1.pipeline.V1Beta1PipelineTaskMetadata;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1EmbeddedCustomRunSpec {

    @ApiModelProperty(value = "metadata", position = 0)
    private V1Beta1PipelineTaskMetadata metadata;

    @ApiModelProperty(value = "spec",position = 1)
    private Object spec;

}
