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

    @ApiModelProperty(value = "serviceAccountName", position = 0)
    private String serviceAccountName;

    @ApiModelProperty(value = "trigger 列表", position = 1)
    private List<V1Alpha1EventListenerTrigger> triggers;

    @ApiModelProperty(value = "命名空间选择器", position = 3)
    private V1Alpha1NamespaceSelector namespaceSelector;

    @ApiModelProperty(value = "标签选择器", position = 4)
    private V1LabelSelector labelSelector;

    @ApiModelProperty(value = "resources", position = 5)
    private V1Alpha1Resources resources;

}
