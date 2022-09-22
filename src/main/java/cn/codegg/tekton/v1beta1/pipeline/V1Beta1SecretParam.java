package cn.codegg.tekton.v1beta1.pipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1SecretParam {

    @ApiModelProperty(value = "字段名称", position = 0)
    private String fieldName;

    @ApiModelProperty(value = "secret key", position = 1)
    private String secretKey;

    @ApiModelProperty(value = "secret name", position = 2)
    private String secretName;

}
