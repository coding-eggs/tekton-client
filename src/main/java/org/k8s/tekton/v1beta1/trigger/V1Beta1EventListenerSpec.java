package org.k8s.tekton.v1beta1.trigger;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1EventListenerSpec {

    @ApiModelProperty(value = "serviceAccountName", position = 0)
    private String serviceAccountName;

    @ApiModelProperty(value = "trigger 列表", position = 1)
    private List<V1Beta1EventListenerTrigger> triggers;

    @ApiModelProperty(value = "trigger list 允许集中处理拦截器链", position = 2)
    private List<V1Beta1EventListenerTriggerGroup> triggerGroups;

    @ApiModelProperty(value = "命名空间选择器", position = 3)
    private V1Beta1NamespaceSelector namespaceSelector;

    @ApiModelProperty(value = "标签选择器", position = 4)
    private V1LabelSelector labelSelector;

    @ApiModelProperty(value = "resources", position = 5)
    private V1Beta1Resources resources;

    @ApiModelProperty(value = "cloudEventURI", position = 6)
    private String cloudEventURI;

}
