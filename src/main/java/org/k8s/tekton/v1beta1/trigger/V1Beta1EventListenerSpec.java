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

    private List<V1Beta1EventListenerTriggerGroup> triggerGroups;

    private V1Beta1NamespaceSelector namespaceSelector;

    private V1LabelSelector labelSelector;

    private V1Beta1Resources resources;

    private String cloudEventURI;

}
