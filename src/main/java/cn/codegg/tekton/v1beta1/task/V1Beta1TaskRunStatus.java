package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.common.Condition;
import cn.codegg.tekton.common.Status;
import cn.codegg.tekton.v1beta1.V1Beta1Provenance;
import cn.codegg.tekton.v1beta1.V1Beta1SidecarState;
import cn.codegg.tekton.v1beta1.pipeline.V1Beta1PipelineResourceResult;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskRunStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<Condition> conditions;

    @ApiModelProperty(value = "annotations", notes = "//批注是资源的附加状态字段，用于保存" +
            "//附加状态以及向用户传达更多信息。这是" +
            "//大致类似于任何k8s资源上的注释，只是协调器在传达" +
            "//向外提供更丰富的信息")
    private Map<String, String> annotations;

    @ApiModelProperty(value = "pod 名称", position = 1)
    private String podName;

    @ApiModelProperty(value = "task 实际启动时间", position = 2)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "task 结束时间",position = 3)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "task step 状态列表",position = 4)
    private List<StepState> steps;

    @Deprecated
    @ApiModelProperty(value = "描述通过 CloudEventResource 请求的每个云事件的状态", position = 5)
    private List<V1Beta1CloudEventDelivery> cloudEvents;

    @ApiModelProperty(value = "task run 的历史记录", position = 6)
    private List<V1Beta1TaskRunStatus> retriesStatus;

    @ApiModelProperty(value = "在 taskRun 期间构建的 Resources 的结果。目前包括构建容器镜像的摘要", position = 7)
    private List<V1Beta1PipelineResourceResult> resourceResult;

    @ApiModelProperty(value = "task container 输出的结果列表", position = 8)
    private List<V1Beta1TaskRunResult> taskRunResults;

    @ApiModelProperty(value = "sidecar 的状态记录", position = 9)
    private List<V1Beta1SidecarState> sidecars;

    @ApiModelProperty(value = "taskrun 中 task 的 spec", position = 10)
    private V1Beta1TaskSpec taskSpec;

    @ApiModelProperty(value = "（可选）Provence包含一些关于软件工件是如何构建的关键认证元数据（什么源、什么输入/输出等）")
    private V1Beta1Provenance provenance;

    @ApiModelProperty(value = "SpanContext包含跟踪跨度上下文字段", position = 12)
    private Map<String, String> spanContext;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class StepState {

        /**
         * 容器三种状态
         */
        @ApiModelProperty(value = "running 状态", position = 0)
        private V1ContainerStateRunning running;

        @ApiModelProperty(value = "terminated 状态",position = 1)
        private V1ContainerStateTerminated terminated;

        @ApiModelProperty(value = "waiting 状态", position = 2)
        private V1ContainerStateWaiting waiting;

        @ApiModelProperty(value = "step name", position = 3)
        private String name;

        @ApiModelProperty(value = "step container",position = 4)
        private String container;

        @ApiModelProperty(value = "镜像id", position = 5)
        private String imageID;

    }

}