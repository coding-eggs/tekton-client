package cn.codegg.tekton.v1alpha1.trigger;

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
public class V1Alpha1EventListenerTriggerSelector {

    @ApiModelProperty(value = "namespace 选择器", position = 0)
    private List<V1Alpha1NamespaceSelector> namespaceSelector;

    @ApiModelProperty(value = "标签选择器", position = 1)
    private V1LabelSelector labelSelector;

}
