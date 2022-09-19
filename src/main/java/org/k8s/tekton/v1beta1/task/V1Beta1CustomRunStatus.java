package org.k8s.tekton.v1beta1.task;

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
public class V1Beta1CustomRunStatus {


    @ApiModelProperty(value = "task 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "task 结束时间",position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "custom container 输出的结果列表", position = 3)
    private List<V1Beta1CustomRunResult> results;

    @ApiModelProperty(value = "task run 的历史记录", position = 4)
    private List<V1Beta1CustomRunStatus> retriesStatus;

    @ApiModelProperty(value = "ExtraFields 包含自定义任务控制器提供的任意字段。", position = 5)
    private Object extraFields;

}
