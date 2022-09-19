package org.k8s.tekton.v1.pipeline;


import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.k8s.tekton.v1beta1.pipeline.V1Beta1PipelineSpec;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Pipeline {

    @ApiModelProperty(value = "apiVersion", example = "tekton.dev/v1",position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind", example = "Pipeline", position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1PipelineSpec spec;


}
