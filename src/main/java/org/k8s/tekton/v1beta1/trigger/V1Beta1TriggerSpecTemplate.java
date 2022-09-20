package org.k8s.tekton.v1beta1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TriggerSpecTemplate {

    @ApiModelProperty(value = "ref", position = 0)
    private String ref;

    @ApiModelProperty(value = "apiVersion", position = 1)
    private String apiVersion;

    @ApiModelProperty(value = "spec", position = 2)
    private V1Beta1TriggerTemplateSpec spec;

}
