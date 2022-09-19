package org.k8s.tekton.v1beta1.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1CloudEventDelivery {

    @ApiModelProperty(value = "指向一个地址", position = 0)
    private String target;

    @ApiModelProperty(value = "status", position = 1)
    private CloudEventDeliveryState status;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class CloudEventDeliveryState {

        @ApiModelProperty(value = "status", position = 0)
        private String condition;

        @ApiModelProperty(value = "最后一次发送时间" , position = 1)
        private String sentAt;

        @ApiModelProperty(value = "错误的文本", position = 2)
        private String message;

        @ApiModelProperty(value = "是尝试发送云事件的次数", position = 3)
        private Integer retryCount;
    }
}
