package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.v1beta1.*;
import io.kubernetes.client.openapi.models.V1Volume;
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
public class V1Beta1TaskSpec {

    @ApiModelProperty(value = "Resources 是运行 task 的输入和输出资源资源的列表在 TaskRuns 中表示为与 PipelineResources 实例的绑定。", position = 0)
    private V1Beta1TaskResources resources;

    @ApiModelProperty(value = "params 参数", notes = "task 所需要的入参，参数必须作为 TaskRuns 中的输入提供，除非它们声明了默认值", position = 1)
    private List<V1Beta1ParamSpec> params;

    @ApiModelProperty(value = "DisplayName是可用于填充UI的任务的面向用户的名称", position = 2)
    private String displayName;

    @ApiModelProperty(value = "描述task的功能" ,position = 2)
    private String description;

    @ApiModelProperty(value = "task的步骤" ,notes = "每个步骤按顺序执行，并且可以挂载目录到/workspace" ,position = 3)
    private List<V1Beta1Step> steps;

    @ApiModelProperty(value = "卷",notes = "挂在到task中step的 volume 集合" ,position = 4)
    private List<V1Volume> volumes;

    @ApiModelProperty(value = "step步骤模板",notes = "StepTemplate 可用作任务内所有步骤容器的基础，以便步骤继承基础容器上的设置",position = 5)
    private V1Beta1StepTemplate stepTemplate;

    @ApiModelProperty(value = "task 的 sidecar", notes = "Sidecar 与 Task 的 step 容器一起运行。它们在步骤开始之前开始，在步骤完成之后结束" ,position = 6)
    private List<V1Beta1Sidecar> sidecars;

    @ApiModelProperty(value = "该任务的所有workspace 声明" ,position = 7)
    private List<V1Beta1WorkspaceDeclaration> workspaces;

    @ApiModelProperty(value = "step 结果输出", notes = "结果是此任务可以输出的值" ,position = 8)
    private List<V1Beta1TaskResult> results;


}
