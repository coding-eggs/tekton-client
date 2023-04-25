package cn.codegg.tekton.v1alpha1.pipeline;


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
public class V1Alpha1PipelineResource {


    @ApiModelProperty(value = "apiVersion", example = "V1alpha1PipelineResourceSpec", position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind", example = "PipelineResource", position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Alpha1PipelineResourceSpec spec;

}
