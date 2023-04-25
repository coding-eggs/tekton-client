package cn.codegg.tekton.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Condition {

    @ApiModelProperty(value = "最后变更时间",position = 0)
    private String lastTransitionTime;

    @ApiModelProperty(value = "变更信息", position = 1)
    private String message;

    @ApiModelProperty(value = "原因: Started / Pending / Running / TaskRunCalled / Succeeded / Failed / [Error message] / TaskRunTimeout / TaskRunImagePullFailed" ,position = 2)
    private String reason;

    @ApiModelProperty(value = "状态：Unknown / True / False ", position = 3)
    private String status;

    @ApiModelProperty(value = "类型",example = "Succeeded",position = 4)
    private String type;

}
