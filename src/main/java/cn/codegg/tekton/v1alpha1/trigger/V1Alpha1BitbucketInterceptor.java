package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * webhook 拦截和预处理事件
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class V1Alpha1BitbucketInterceptor {


    @ApiModelProperty(value = "密钥", position = 0)
    private V1Alpha1SecretRef secretRef;

    @ApiModelProperty(value = "事件类型", position = 1)
    private List<String> eventTypes;

}
