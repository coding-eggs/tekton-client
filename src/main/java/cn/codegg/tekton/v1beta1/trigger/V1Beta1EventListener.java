package cn.codegg.tekton.v1beta1.trigger;

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
public class V1Beta1EventListener {

    @ApiModelProperty(value = "apiVersion", position = 0)
    private String apiVersion = "triggers.tekton.dev/v1beta1";

    @ApiModelProperty(value = "kind", position = 1)
    private String kind = "EventListener";

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Beta1EventListenerSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private Object status;

}
