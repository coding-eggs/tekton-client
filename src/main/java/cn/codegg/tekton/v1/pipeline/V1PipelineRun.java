package cn.codegg.tekton.v1.pipeline;


import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1PipelineRun {

    @ApiModelProperty(value = "apiVersion", example = "tekton.dev/v1", position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind", example = "PipelineRun" ,position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1PipelineRunSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1PipelineRunStatus status;

}
