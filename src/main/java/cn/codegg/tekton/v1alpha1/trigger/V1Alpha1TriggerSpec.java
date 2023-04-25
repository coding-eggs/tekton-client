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
public class V1Alpha1TriggerSpec {

    @ApiModelProperty(value = "trigger binding", position = 0)
    private List<V1Alpha1TriggerSpecBinding> bindings;

    @ApiModelProperty(value = "trigger template ", position = 1)
    private V1Alpha1TriggerSpecTemplate template;

    @ApiModelProperty(value = "name", position = 2)
    private String name;

    @ApiModelProperty(value = "拦截器集合", position = 3)
    private List<V1Alpha1TriggerInterceptor> interceptors;

    @ApiModelProperty(value = "service account" , position = 4)
    private String serviceAccountName;

}
