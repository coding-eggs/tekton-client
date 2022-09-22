package cn.codegg.tekton.v1beta1.trigger;

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
public class V1Beta1EventListenerTrigger {


    @ApiModelProperty(value = "trigger binding列表" ,position = 0)
    private List<V1Beta1TriggerSpecBinding> bindings;

    @ApiModelProperty(value = "trigger 模板", position = 1)
    private V1Beta1TriggerSpecTemplate template;

    @ApiModelProperty(value = "trigger 引用", position = 2)
    private String triggerRef;

    @ApiModelProperty(value = "name", position = 3)
    private String name;

    @ApiModelProperty(value = "拦截器列表", position = 4)
    private List<V1Beta1TriggerInterceptor> interceptors;

    @ApiModelProperty(value = "service account name", position = 5)
    private String serviceAccountName;


}
