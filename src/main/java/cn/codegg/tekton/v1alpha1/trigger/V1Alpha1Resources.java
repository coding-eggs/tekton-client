package cn.codegg.tekton.v1alpha1.trigger;

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
public class V1Alpha1Resources {

    @ApiModelProperty(value = "kubernetesResource", position = 0)
    private KubernetesResource kubernetesResource;

    @ApiModelProperty(value = "customResource", position = 1)
    private Object customResource;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class KubernetesResource {

        @ApiModelProperty(value = "replicas", position = 0)
        private Integer replicas;

        private ServiceType serviceType;

        @ApiModelProperty(value = "service port", position = 2)
        private Integer servicePort;

    }


}
