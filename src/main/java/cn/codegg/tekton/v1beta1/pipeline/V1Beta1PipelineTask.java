package cn.codegg.tekton.v1beta1.pipeline;


import cn.codegg.tekton.common.Matrix;
import cn.codegg.tekton.common.Param;
import cn.codegg.tekton.v1beta1.*;
import io.kubernetes.client.openapi.models.V1Volume;
import io.kubernetes.client.proto.Runtime;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1beta1.task.V1Beta1TaskRef;
import cn.codegg.tekton.v1beta1.task.V1Beta1TaskResult;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1PipelineTask {

    @ApiModelProperty(value = "pipeline Task name", position = 0)
    private String name;

    @ApiModelProperty(value = "ui展示 name" ,position = 1)
    private String displayName;

    @ApiModelProperty(value = "描述" , position = 1)
    private String description;

    @ApiModelProperty(value = "引用已存在的 task" , position = 1)
    private V1Beta1TaskRef taskRef;

    @ApiModelProperty(value = "pipeline 创建 task 配置", position = 2)
    private EmbeddedTask taskSpec;

    @ApiModelProperty(value = "任务需要为 true 的 when 表达式列表", position = 3)
    private List<V1Beta1WhenExpression> when;

    @ApiModelProperty(value = "重试次数", position = 4)
    private Integer retries;

    @ApiModelProperty(value = "RunAfter 是在此任务执行之前应执行的 PipelineTask 名称列表", position = 5)
    private List<String> runAfter;

    @Deprecated
    @ApiModelProperty(value = "resources", notes = "不推荐：未使用，仅为向后兼容而保留", position = 5)
    private V1Beta1PipelineTaskResources resources;

    @ApiModelProperty(value = "声明传递给此任务的参数" , position = 6)
    private List<Param> params;

    @ApiModelProperty(value = "声明任务展开的参数", position = 7)
    private List<Matrix> matrix;

    @ApiModelProperty(value = "WorkspacePipelineTaskBinding 描述了传递到管道的workspace应如何映射到任务声明的workspace。", position = 8)
    private List<WorkspacePipelineTaskBinding> workspaces;

    @ApiModelProperty(value = "超时时间" ,position = 9)
    private String timeout;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class EmbeddedTask {

        @ApiModelProperty(value = "自定义任务的规范", position = 0)
        private Runtime.RawExtension spec;

        @ApiModelProperty(value = "metadata", position = 1)
        private V1Beta1PipelineTaskMetadata metadata;

        @ApiModelProperty(value = "task 参数列表", position = 2)
        private List<V1Beta1ParamSpec> params;

        @ApiModelProperty(value = "任务描述", position = 3)
        private String description;

        @ApiModelProperty(value = "任务步骤", position = 4)
        private List<V1Beta1Step> steps;

        @ApiModelProperty(value = "卷",notes = "挂在到task中step的 volume 集合" ,position = 5)
        private List<V1Volume> volumes;

        @ApiModelProperty(value = "step步骤模板",notes = "StepTemplate 可用作任务内所有步骤容器的基础，以便步骤继承基础容器上的设置",position = 6)
        private V1Beta1StepTemplate stepTemplate;

        @ApiModelProperty(value = "task 的 sidecar", notes = "Sidecar 与 Task 的 step 容器一起运行。它们在步骤开始之前开始，在步骤完成之后结束" ,position = 7)
        private List<V1Beta1Sidecar> sidecars;

        @ApiModelProperty(value = "该任务的所有workspace 声明" ,position = 8)
        private List<V1Beta1WorkspaceDeclaration> workspaces;

        @ApiModelProperty(value = "step 结果输出", notes = "结果是此任务可以输出的值" ,position = 9)
        private List<V1Beta1TaskResult> results;

    }



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
    public static class WorkspacePipelineTaskBinding {

        @ApiModelProperty(value = "这里的 name 对应的是 task 中 workspace 中的 name" ,position = 0)
        private String name;

        @ApiModelProperty(value = "这里的 workspace 对应的是 pipelinerun 中的 workspace", position = 1)
        private String workspace;

        @ApiModelProperty(value = "挂在到 task 中的具体文件。可选", position = 2)
        private String subPath;

    }

}