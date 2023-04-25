package cn.codegg.tekton.v1alpha1.trigger;

import cn.codegg.tekton.v1alpha1.V1Alpha1RunParam;
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
public class V1Alpha1TriggerBindingSpec {

    @ApiModelProperty(value = "params", position = 0)
    private List<V1Alpha1RunParam<?>> params;

}
