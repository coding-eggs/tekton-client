package org.k8s.tekton.v1.task;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.k8s.tekton.v1beta1.task.V1Beta1TaskRunSpec;
import org.k8s.tekton.v1beta1.task.V1Beta1TaskRunStatus;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1TaskRun {

    @ApiModelProperty(value = "apiVersion", notes = "tekton.dev/v1", example = "tekton.dev/v1beta1",position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind" ,example = "TaskRun",position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1TaskRunSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1TaskRunStatus status;

}
