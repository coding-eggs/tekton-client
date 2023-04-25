package cn.codegg.tekton.v1alpha1.trigger;

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

    @ApiModelProperty(value = "github webhook 拦截器", position = 4)
    private V1Alpha1GitHubInterceptor github;

    @ApiModelProperty(value = "gitlab webhook 拦截器",position = 5)
    private V1Alpha1GitLabInterceptor gitlab;

    @ApiModelProperty(value = "cel webhook 拦截器", position = 6)
    private V1Alpha1CELInterceptor cel;

    @ApiModelProperty(value = "bitbucket webhook 拦截器", position = 7)
    private V1Alpha1BitbucketInterceptor bitbucket;

}
