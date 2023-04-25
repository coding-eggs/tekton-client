package cn.codegg.tekton.v1.task;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1TaskRun {

    @ApiModelProperty(value = "apiVersion", notes = "tekton.dev/v1", example = "tekton.dev/v1beta1",position = 0)
    private String apiVersion = "tekton.dev/v1";

    @ApiModelProperty(value = "kind" ,example = "TaskRun",position = 1)
    private String kind = "TaskRun";

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1TaskRunSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1TaskRunStatus status;

}
