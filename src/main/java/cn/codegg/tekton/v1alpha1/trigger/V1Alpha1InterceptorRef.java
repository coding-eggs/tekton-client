package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class V1Alpha1InterceptorRef {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "kind", notes = "InterceptorKind 表示拦截器的类型，命名空间或集群范围。ClusterInterceptor ;NamespacedInterceptor ", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", position = 2)
    private String apiVersion;

}
