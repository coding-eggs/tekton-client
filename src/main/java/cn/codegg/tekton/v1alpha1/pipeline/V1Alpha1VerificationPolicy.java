package cn.codegg.tekton.v1alpha1.pipeline;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * VerificationPolicy定义了验证Tekton资源的规则。
 * VerificationPolicy可以配置从资源到公钥列表的映射，因此在验证资源时，我们可以使用相应的公钥
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class V1Alpha1VerificationPolicy {


    @ApiModelProperty(value = "apiVersion", position = 0)
    private String apiVersion = "tekton.dev/v1alpha1";

    @ApiModelProperty(value = "kind", position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Alpha1VerificationPolicySpec spec;

    @Deprecated
    @ApiModelProperty(value = "status", position = 4)
    private Object status;

}
