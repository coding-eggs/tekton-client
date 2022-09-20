package org.k8s.tekton.v1alpha1;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1alpha1ResourceParam {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "value", position = 1)
    private String value;

}
