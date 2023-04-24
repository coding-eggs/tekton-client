package cn.codegg.tekton.v1alpha1.trigger;

import cn.codegg.tekton.common.Param;
import cn.codegg.tekton.common.URL;
import io.kubernetes.client.openapi.models.V1ObjectReference;
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
public class V1Alpha1WebhookInterceptor {

    @ApiModelProperty(value = "ObjectRef 是对将解析为集群 DNS 名称以用作 EventInterceptor 的对象的引用。可以指定 objectRef 或 url", position = 0)
    private V1ObjectReference objectRef;

    @ApiModelProperty(value = "Url", position = 1)
    private URL url;

    @ApiModelProperty(value = "header", position = 2)
    private List<Param> header;

}
