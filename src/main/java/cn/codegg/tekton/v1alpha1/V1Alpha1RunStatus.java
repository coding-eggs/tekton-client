package cn.codegg.tekton.v1alpha1;

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
public class V1Alpha1RunStatus {


    @ApiModelProperty(value = "run 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "run 结束时间",position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "run container 输出的结果列表", position = 3)
    private List<V1Alpha1RunResult<?>> results;

    @ApiModelProperty(value = "run 的历史记录", position = 4)
    private List<V1Alpha1RunStatus> retriesStatus;

    @ApiModelProperty(value = "extraFields", position = 5)
    private Object extraFields;

}