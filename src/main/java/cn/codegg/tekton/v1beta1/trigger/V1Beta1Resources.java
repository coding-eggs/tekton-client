package cn.codegg.tekton.v1beta1.trigger;

import io.kubernetes.client.proto.Runtime;
import io.kubernetes.client.proto.V1;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bouncycastle.asn1.dvcs.ServiceType;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1Resources {

    @ApiModelProperty(value = "kubernetesResource", position = 0)
    private KubernetesResource kubernetesResource;

    @ApiModelProperty(value = "customResource", position = 1)
    private Runtime.RawExtension customResource;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class KubernetesResource {

        @ApiModelProperty(value = "replicas", position = 0)
        private Integer replicas;

        @ApiModelProperty(value = "serviceType", position = 1)
        private String serviceType;

        @ApiModelProperty(value = "service port", position = 2)
        private Integer servicePort;

        @ApiModelProperty(value = "spec", position = 3)
        private WithPodSpec spec;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class WithPodSpec {
        private V1.PodTemplateSpec template;
    }


}
