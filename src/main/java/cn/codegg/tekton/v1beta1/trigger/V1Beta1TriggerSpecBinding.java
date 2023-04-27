package cn.codegg.tekton.v1beta1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TriggerSpecBinding {

    @ApiModelProperty(value = "Name 是绑定参数的name 与 Ref 互斥", position = 0)
    private String name;

    @ApiModelProperty(value = "Value 是绑定参数的", position = 1)
    private String value;

    @ApiModelProperty(value = "Ref 是对 TriggerBinding 类型的引用。与名称互斥",  position = 2)
    private String ref;

    @ApiModelProperty(value = "kind", notes = "ClusterTriggerBinding ; TriggerBinding", position = 3)
    private String kind;

    @ApiModelProperty(value = "apiVersion", position = 4)
    private String apiVersion;

}
