package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class V1Alpha1SecretRef {

    @ApiModelProperty(value = "secret key", position = 0)
    private String secretKey;

    @ApiModelProperty(value = "secret 名称", position = 1)
    private String secretName;
}
