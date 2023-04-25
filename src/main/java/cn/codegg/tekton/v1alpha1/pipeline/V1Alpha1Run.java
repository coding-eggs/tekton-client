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
public class V1Alpha1Run {

    @ApiModelProperty(value = "apiVersion", notes = "tekton.dev/v1alpha1", example = "tekton.dev/v1alpha1",position = 0)
    private String apiVersion = "tekton.dev/v1alpha1";

    @ApiModelProperty(value = "kind" ,example = "Run",position = 1)
    private String kind = "Run";

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Alpha1RunSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1Alpha1RunStatus status;


}
