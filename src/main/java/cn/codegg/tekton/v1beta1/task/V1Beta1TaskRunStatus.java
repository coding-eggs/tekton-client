package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.v1beta1.V1Beta1Condition;
import cn.codegg.tekton.v1beta1.V1Beta1SidecarState;
import cn.codegg.tekton.v1beta1.pipeline.V1Beta1PipelineResourceResult;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskRunStatus {


    @ApiModelProperty(value = "pod 名称", position = 0)
    private String podName;

    @ApiModelProperty(value = "task 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "task 结束时间",position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "taskrun 状态" , position = 3)
    private List<V1Beta1Condition> conditions;

    @ApiModelProperty(value = "task step 状态列表",position = 4)
    private List<StepState> steps;

    @ApiModelProperty(value = "描述通过 CloudEventResource 请求的每个云事件的状态", position = 5)
    private List<V1Beta1CloudEventDelivery> cloudEvents;

    @ApiModelProperty(value = "task run 的历史记录", position = 6)
    private List<V1Beta1TaskRunStatus> retriesStatus;

    @ApiModelProperty(value = "在 taskRun 期间构建的 Resources 的结果。目前包括构建容器镜像的摘要", position = 7)
    private List<V1Beta1PipelineResourceResult> resourceResult;

    @ApiModelProperty(value = "task container 输出的结果列表", position = 8)
    private List<V1Beta1TaskRunResult<?>> taskRunResults;

    @ApiModelProperty(value = "sidecar 的状态记录", position = 9)
    private List<V1Beta1SidecarState> sidecars;

    @ApiModelProperty(value = "taskrun 中 task 的 spec", position = 10)
    private V1Beta1TaskSpec taskSpec;





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