package cn.codegg.tekton.v1beta1.pipeline;


import cn.codegg.tekton.common.Param;
import cn.codegg.tekton.v1beta1.V1Beta1WhenExpression;
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1PipelineRunStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<V1Condition> conditions;

    @ApiModelProperty(value = "annotations", notes = "//批注是资源的附加状态字段，用于保存" +
            "//附加状态以及向用户传达更多信息。这是" +
            "//大致类似于任何k8s资源上的注释，只是协调器在传达" +
            "//向外提供更丰富的信息")
    private Map<String, String> annotations;


    @ApiModelProperty(value = "pipeline run 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "pipeline run 完成时间", position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "由 pipeline task的容器写出的结果列表", position = 3)
    private List<Param> pipelineResults;

    @ApiModelProperty(value = "PipelineRunSpec 包含用于实例化运行的确切规范",position = 4)
    private List<V1Beta1PipelineSpec> pipelineSpec;

    @ApiModelProperty(value = "用于描述由于当 When Expressions 结果为 False 而被跳过的 task", position = 5)
    private List<SkippedTask> skippedTasks;

    @ApiModelProperty(value = "用于指向此 PipelineRun 中各个 TaskRuns 和 Runs 的状态",position = 6)
    private List<ChildStatusReference> childReferences;

    @ApiModelProperty(value = "finally task 启动时间", position = 7)
    private OffsetDateTime finallyStartTime;




    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SkippedTask {

        @ApiModelProperty(value = "name", position = 0)
        private String name;

        @ApiModelProperty(value = "跳过原因", position = 1)
        private String reason;

        @ApiModelProperty(value = "when expressions 列表", position = 2)
        private List<V1Beta1WhenExpression> whenExpressions;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ChildStatusReference {

        @ApiModelProperty(value = "name", position = 0)
        private String name;

        @ApiModelProperty(value = "pipeline task name", position = 1)
        private String pipelineTaskName;

        @ApiModelProperty(value = "when expressions 列表" , position = 2)
        private List<V1Beta1WhenExpression> whenExpressions;
    }
}

