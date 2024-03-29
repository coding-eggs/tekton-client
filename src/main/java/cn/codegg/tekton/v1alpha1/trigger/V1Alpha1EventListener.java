package cn.codegg.tekton.v1alpha1.trigger;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class V1Alpha1EventListener {

    @ApiModelProperty(value = "apiVersion", position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind", position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Alpha1EventListenerSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1Alpha1EventListenerStatus status;

}
