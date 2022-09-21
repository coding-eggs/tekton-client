package org.k8s.tekton.v1beta1.trigger;

import io.kubernetes.client.openapi.models.V1ObjectReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.k8s.tekton.common.Param;
import org.k8s.tekton.common.URL;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1WebhookInterceptor {

    @ApiModelProperty(value = "ObjectRef 是对将解析为集群 DNS 名称以用作 EventInterceptor 的对象的引用。可以指定 objectRef 或 url", position = 0)
    private V1ObjectReference objectRef;

    @ApiModelProperty(value = "Url", position = 1)
    private URL url;

    @ApiModelProperty(value = "header", position = 2)
    private List<Param> header;

}
