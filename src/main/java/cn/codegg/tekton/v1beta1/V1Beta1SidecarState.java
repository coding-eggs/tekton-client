package cn.codegg.tekton.v1beta1;


import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1SidecarState {

    @SerializedName("running")
    private V1ContainerStateRunning running;
    public static final String SERIALIZED_NAME_TERMINATED = "terminated";
    @SerializedName("terminated")
    private V1ContainerStateTerminated terminated;
    public static final String SERIALIZED_NAME_WAITING = "waiting";
    @SerializedName("waiting")
    private V1ContainerStateWaiting waiting;

    @ApiModelProperty(value = "step name", position = 3)
    private String name;

    @ApiModelProperty(value = "step container",position = 4)
    private String container;

    @ApiModelProperty(value = "镜像id", position = 5)
    private String imageID;

}
