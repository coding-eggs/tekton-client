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
public class V1Beta1TriggerInterceptor {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "interceptor 的引用", position = 1)
    private V1Beta1InterceptorRef ref;

    @ApiModelProperty(value = "参数列表", position = 2)
    private List<V1Beta1InterceptorParams> params;

    @ApiModelProperty(value = "Webhook Interceptor 是指一种老式的 webhook 拦截器服务", position = 3)
    private V1Beta1WebhookInterceptor webhook;


}
