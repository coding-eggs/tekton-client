package cn.codegg.tekton.v1alpha1.trigger;

import io.kubernetes.client.openapi.models.V1LabelSelector;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class V1Alpha1EventListenerSpec {

    private String serviceAccountName;

    private List<V1Alpha1EventListenerTrigger> triggers;

    private List<V1Alpha1EventListenerTriggerGroup> triggerGroups;

    private V1Alpha1NamespaceSelector namespaceSelector;

    private V1LabelSelector labelSelector;

    @ApiModelProperty(value = "resources", position = 5)
    private V1Alpha1Resources resources;

    @ApiModelProperty(value = "cloudEventURI", position = 6)
    private String cloudEventURI;


}
