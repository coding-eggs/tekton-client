package cn.codegg.tekton.v1beta1.trigger;

import io.kubernetes.client.proto.Runtime;
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
public class V1Beta1TriggerTemplateSpec {

    @ApiModelProperty(value = "params", position = 0)
    private List<V1Beta1ParamSpec> params;

    @ApiModelProperty(value = "resourcetemplates", position = 1)
    private List<Runtime.RawExtension> resourcetemplates;

}
