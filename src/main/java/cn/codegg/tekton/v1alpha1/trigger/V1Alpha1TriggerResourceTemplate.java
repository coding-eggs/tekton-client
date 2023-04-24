package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1TriggerResourceTemplate {

    @ApiModelProperty(value = "RawExtension", position = 0)
    private Object RawExtension;

}
