package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.common.Param;
import cn.codegg.tekton.v1beta1.V1Beta1WorkspaceBinding;
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
public class V1Beta1CustomRunSpec {

    @ApiModelProperty(value = "task 引用", position = 0)
    private V1Beta1TaskRef customRef;

    @ApiModelProperty(value = "允许嵌入自定义任务定义", position = 1)
    private V1Beta1EmbeddedCustomRunSpec customSpec;

    @ApiModelProperty(value = "custom run 需要的参数", notes = "与task中的param配合使用，这里给task中的param赋值" ,position = 2)
    private List<Param> params;

    @ApiModelProperty(value = "定义用户可以提供的任务运行规范状态", position = 3)
    private String status;

    @ApiModelProperty(value = "为 custom run 定义人类可读的状态消息", example = "custom run cancelled as the PipelineRun it belongs to has been cancelled.",position = 4)
    private String statusMessage;

    @ApiModelProperty(value = "重试次数", position = 5)
    private Integer retries;

    @ApiModelProperty(value = "service account",position = 6)
    private String serviceAccountName;

    @ApiModelProperty(value = "超时时间", example = "120s",position = 7)
    private String timeout;

    @ApiModelProperty(value = "task 中使用的  workspace列表", position = 8)
    private List<V1Beta1WorkspaceBinding> workspaces;


}
