package cn.codegg.tekton.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Condition {

    @ApiModelProperty(value = "类型",example = "Succeeded",position = 1)
    private String type;

    @ApiModelProperty(value = "状态：Unknown / True / False ", position = 2)
    private String status;

    @ApiModelProperty(value = "如何解释此条件的失败，错误、警告、信息之一", position = 3)
    private String severity;

    @ApiModelProperty(value = "最后变更时间",position = 4)
    private OffsetDateTime lastTransitionTime;

    @ApiModelProperty(value = "原因: Started / Pending / Running / TaskRunCalled / Succeeded / Failed / [Error message] / TaskRunTimeout / TaskRunImagePullFailed" ,position = 5)
    private String reason;

    @ApiModelProperty(value = "变更信息", position = 6)
    private String message;







}
