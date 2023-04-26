package cn.codegg.tekton.v1alpha1.pipeline;

import cn.codegg.tekton.common.Condition;
import cn.codegg.tekton.common.Status;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1RunStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<Condition> conditions;

    @ApiModelProperty(value = "annotations", notes = "//批注是资源的附加状态字段，用于保存" +
            "//附加状态以及向用户传达更多信息。这是" +
            "//大致类似于任何k8s资源上的注释，只是协调器在传达" +
            "//向外提供更丰富的信息")
    private Map<String, String> annotations;

    @ApiModelProperty(value = "run 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "run 结束时间",position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "run container 输出的结果列表", position = 3)
    private List<V1Alpha1RunResult> results;

    @ApiModelProperty(value = "run 的历史记录", position = 4)
    private List<V1Alpha1RunStatus> retriesStatus;

    @ApiModelProperty(value = "extraFields", position = 5)
    private Object extraFields;

}