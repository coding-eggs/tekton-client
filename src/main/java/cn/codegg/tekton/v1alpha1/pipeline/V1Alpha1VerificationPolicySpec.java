package cn.codegg.tekton.v1alpha1.pipeline;

import io.kubernetes.client.openapi.models.V1SecretReference;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class V1Alpha1VerificationPolicySpec {

    @ApiModelProperty(value = "patterns Regex 过滤 resources", position = 0)
    private List<ResourcePattern> resources;

    @ApiModelProperty(value = "权威机构定义验证签名的规则", position = 1)
    private List<Authority> authorities;

    @ApiModelProperty(value = "模式控制失败的策略是使taskrun/pipelinerun失败，还是只记录强制执行的警告-如果验证失败，则使taskrun/pipelinerun失效（默认值）warn-如果验证成功，则不使taskrun/paipelinerun故障，但记录警告", position = 2)
    private String modeType;



    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ResourcePattern {

        private String pattern;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Authority {

        @ApiModelProperty(value = "patterns Regex 过滤 resources", position = 0)
        private String name;

        @ApiModelProperty(value = "密钥包含用于验证资源的公钥。" , position = 1)
        private KeyRef key;

    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class KeyRef {

        @ApiModelProperty(value = "secretRef", position = 0)
        private V1SecretReference secretRef;

        @ApiModelProperty(value = "数据包含内联公钥。", position = 1)
        private String data;

        @ApiModelProperty(value = "KMS包含公钥的KMS url支持的格式因所使用的KMS系统而异。KMS url的一个示例可能是：gcpkms://projects/[PROJECT]/locations/[LOCATION]>/keyRings/[KEYRING]/cryptoKeys/[KEY]/crypto KeyVersions/[KEY_VERSION]有关更多示例，请参阅https://docs.sigstore.dev/cosign/kms_support.请注意，目前还不支持KMS。")
        private String kms;

        @ApiModelProperty(value = "如果未显式设置算法，则HashAlgorithm始终默认为sha256")
        private String hashAlgorithm;

    }

}
