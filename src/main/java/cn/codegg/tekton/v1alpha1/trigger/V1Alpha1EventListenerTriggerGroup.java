package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * EventListenerTriggerGroup 定义了一组共享一组通用拦截器的触发器
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1EventListenerTriggerGroup {

    @ApiModelProperty(value = "name" , position = 0)
    private String name;

    @ApiModelProperty(value = "拦截器列表", position = 1)
    private List<V1Alpha1TriggerInterceptor> interceptors;

    @ApiModelProperty(value = "trigger 选择器", position = 2)
    private V1Alpha1EventListenerTriggerSelector triggerSelector;

}
