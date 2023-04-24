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
public class V1Alpha1TriggerTemplateSpec {

    @ApiModelProperty(value = "params", position = 0)
    private List<V1Alpha1ParamSpec> params;

    @ApiModelProperty(value = "resourcetemplates", position = 1)
    private List<V1Alpha1TriggerResourceTemplate> resourcetemplates;

}
