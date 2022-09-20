package org.k8s.tekton.v1alpha1;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class V1alpha1RunParam<T> {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "参数值", position = 1)
    private T value;


}
