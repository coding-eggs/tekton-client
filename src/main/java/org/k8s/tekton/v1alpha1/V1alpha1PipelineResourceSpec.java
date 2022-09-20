package org.k8s.tekton.v1alpha1;

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
public class V1alpha1PipelineResourceSpec {


    @ApiModelProperty(value = "description", position = 0)
    private String description;

    @ApiModelProperty(value = "type", position = 1)
    private String type;

    @ApiModelProperty(value = "params", position = 2)
    private List<V1alpha1ResourceParam> params;

    @ApiModelProperty(value = "secrets", position = 3)
    private List<V1alpha1SecretParam> secrets;


}
