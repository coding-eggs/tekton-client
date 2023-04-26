package cn.codegg.tekton.v1.pipeline;


import cn.codegg.tekton.common.Condition;
import cn.codegg.tekton.common.Param;
import cn.codegg.tekton.v1.V1Provenance;
import cn.codegg.tekton.v1.V1WhenExpression;
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
public class V1PipelineRunStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<Condition> conditions;

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
    private List<Param> results;

    @ApiModelProperty(value = "PipelineRunSpec 包含用于实例化运行的确切规范",position = 4)
    private V1PipelineSpec pipelineSpec;

    @ApiModelProperty(value = "用于描述由于当 When Expressions 结果为 False 而被跳过的 task", position = 5)
    private List<SkippedTask> skippedTasks;

    @ApiModelProperty(value = "用于指向此 PipelineRun 中各个 TaskRuns 和 Runs 的状态",position = 6)
    private List<ChildStatusReference> childReferences;

    @ApiModelProperty(value = "finally task 启动时间", position = 7)
    private OffsetDateTime finallyStartTime;

    @ApiModelProperty(value = "Provence包含一些关于软件工件是如何构建的关键认证元数据（什么源、什么输入/输出等）", position = 8)
    private V1Provenance provenance;

    @ApiModelProperty(value = "SpanContext包含跟踪跨度上下文字段", position = 9)
    private Map<String, String > spanContext;






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
        private List<V1WhenExpression> whenExpressions;

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
        private List<V1WhenExpression> whenExpressions;
    }
}

