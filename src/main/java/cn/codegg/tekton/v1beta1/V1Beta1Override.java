package cn.codegg.tekton.v1beta1;


import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1Override {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "资源配额", position = 1)
    private V1ResourceRequirements resources;

}
