package cn.codegg.tekton.v1alpha1.trigger;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class V1Alpha1CELInterceptor {

    @ApiModelProperty(value = "filter", position = 0)
    private String filter;

    @ApiModelProperty(value = "overlay" , position = 1)
    private List<CELOverlay> overlays;

    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @Data
    public static class CELOverlay {

        @ApiModelProperty(value = "key", position = 0)
        private String key;

        @ApiModelProperty(value = "expression", position = 1)
        private String expression;

    }

}
