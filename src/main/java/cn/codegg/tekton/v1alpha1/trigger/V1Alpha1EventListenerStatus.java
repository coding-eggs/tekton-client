package cn.codegg.tekton.v1alpha1.trigger;

import cn.codegg.tekton.v1alpha1.V1Alpha1Addressable;
import cn.codegg.tekton.v1alpha1.V1Alpha1EventListenerConfig;
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1EventListenerStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<V1Condition> conditions;

    @ApiModelProperty(value = "annotations", notes = "//批注是资源的附加状态字段，用于保存" +
            "//附加状态以及向用户传达更多信息。这是" +
            "//大致类似于任何k8s资源上的注释，只是协调器在传达" +
            "//向外提供更丰富的信息")
    private Map<String, String> annotations;

    @ApiModelProperty(value = "地址是单个可寻址地址")
    private V1Alpha1Addressable address;

    @ApiModelProperty(value = "Addresses是不同协议（HTTP和HTTPS）的地址列表")
    private List<V1Alpha1Addressable> addresses;

    @ApiModelProperty(value = "配置存储EventListener服务的配置")
    private V1Alpha1EventListenerConfig configuration;

}
