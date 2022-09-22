package cn.codegg.tekton.v1.task;

import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1.V1Override;
import cn.codegg.tekton.v1.V1PodTemplate;
import cn.codegg.tekton.v1.V1RunParam;
import cn.codegg.tekton.v1.V1WorkspaceBinding;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1TaskRunSpec {


    @ApiModelProperty(value = "debug", notes = "为特定的 TaskRun 定义断点配置",position = 0)
    private TaskRunDebug debug;

    @ApiModelProperty(value = "taskrun 需要的参数", notes = "与task中的param配合使用，这里给task中的param赋值" ,position = 1)
    private List<V1RunParam<?>> params;

    @ApiModelProperty(value = "service account",position = 3)
    private String serviceAccountName;

    @ApiModelProperty(value = "task 引用", position = 4)
    private V1TaskRef taskRef;

    @ApiModelProperty(value = "task 配置，一般和他taskRef选择一个进行使用，使用taskSpec不需要使用taskRef", position = 5)
    private V1TaskSpec taskSpec;

    @ApiModelProperty(value = "定义用户可以提供的任务运行规范状态", position = 6)
    private String status;

    @ApiModelProperty(value = "为 TaskRun 定义人类可读的状态消息", example = "TaskRun cancelled as the PipelineRun it belongs to has been cancelled.",position = 7)
    private String statusMessage;

    @ApiModelProperty(value = "超时时间", example = "120s",position = 8)
    private String timeout;

    @ApiModelProperty(value = "PodTemplate 保存 pod 特定的配置",position = 9)
    private V1PodTemplate podTemplate;

    @ApiModelProperty(value = "task 中使用的  workspace列表", position = 10)
    private List<V1WorkspaceBinding> workspaces;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的步骤", position = 11)
    private List<V1Override> stepOverrides;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的 Sidecar", position = 12)
    private List<V1Override> sidecarOverrides;

    @ApiModelProperty(value = "taskrun 的资源配额", position = 13)
    private V1ResourceRequirements computeResources;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRunDebug {

        @ApiModelProperty(value = "断点")
        private List<String> breakpoint;

    }


}
