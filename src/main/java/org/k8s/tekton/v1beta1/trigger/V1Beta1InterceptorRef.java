package org.k8s.tekton.v1beta1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class V1Beta1InterceptorRef {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "kind", notes = "InterceptorKind 表示拦截器的类型，命名空间或集群范围。目前只有ClusterInterceptor，所以唯一有效的值是默认值", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", position = 2)
    private String apiVersion;

}
