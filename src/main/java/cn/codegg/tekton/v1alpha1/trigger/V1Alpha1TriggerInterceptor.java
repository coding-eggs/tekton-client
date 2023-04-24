package cn.codegg.tekton.v1alpha1.trigger;

import cn.codegg.tekton.v1beta1.trigger.V1Beta1InterceptorParams;
import cn.codegg.tekton.v1beta1.trigger.V1Beta1InterceptorRef;
import cn.codegg.tekton.v1beta1.trigger.V1Beta1WebhookInterceptor;
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
public class V1Alpha1TriggerInterceptor {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "interceptor 的引用", position = 1)
    private V1Alpha1InterceptorRef ref;

    @ApiModelProperty(value = "参数列表", position = 2)
    private List<V1Alpha1InterceptorParams> params;

    @ApiModelProperty(value = "Webhook Interceptor 是指一种老式的 webhook 拦截器服务", position = 3)
    private V1Alpha1WebhookInterceptor webhook;


}
