package cn.codegg.tekton.v1alpha1.pipeline;

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
public class V1Alpha1StatusCondition {

    @ApiModelProperty(value = "run 变更状态", position = 0)
    private List<V1Alpha1StatusCondition> conditions;

    @ApiModelProperty(value = "最后变更时间",position = 1)
    private OffsetDateTime lastTransitionTime;

    @ApiModelProperty(value = "变更信息", position = 2)
    private String message;

    @ApiModelProperty(value = "原因: Started / Pending / Running / TaskRunCalled / Succeeded / Failed / [Error message] / TaskRunTimeout / TaskRunImagePullFailed" ,position = 3)
    private String reason;

    @ApiModelProperty(value = "状态：Unknown / True / False ", position = 4)
    private String status;

    @ApiModelProperty(value = "类型",example = "Succeeded",position = 5)
    private String type;

}
