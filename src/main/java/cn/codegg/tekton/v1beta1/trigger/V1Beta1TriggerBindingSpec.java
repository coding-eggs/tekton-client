package cn.codegg.tekton.v1beta1.trigger;

import cn.codegg.tekton.common.Param;
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
public class V1Beta1TriggerBindingSpec {

    @ApiModelProperty(value = "params", position = 0)
    private List<Param> params;

}
