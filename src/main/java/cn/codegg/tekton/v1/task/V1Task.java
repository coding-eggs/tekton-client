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
public class V1Task {

    @ApiModelProperty(value = "apiVersion",notes = "tekton.dev/v1", example = "tekton.dev/v1beta1",position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind",notes = "Task", example = "Task",position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata",notes = "kubernetes 对象 metadata",position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec",notes = "task 的 详细设置参数等",position = 3)
    private V1TaskSpec spec;

}
