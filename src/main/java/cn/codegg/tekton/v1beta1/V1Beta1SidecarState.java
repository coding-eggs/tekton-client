package cn.codegg.tekton.v1beta1;


import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1SidecarState extends V1ContainerState {


    @ApiModelProperty(value = "step name", position = 3)
    private String name;

    @ApiModelProperty(value = "step container",position = 4)
    private String container;

    @ApiModelProperty(value = "镜像id", position = 5)
    private String imageID;

}
