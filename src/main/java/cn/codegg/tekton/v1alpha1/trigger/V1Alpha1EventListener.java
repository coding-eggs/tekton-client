package cn.codegg.tekton.v1alpha1.trigger;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class V1Alpha1EventListener {

    private String apiVersion;

    private String kind;

    private V1ObjectMeta metadata;

    private V1Alpha1EventListenerSpec spec;

    private Object status;

}
