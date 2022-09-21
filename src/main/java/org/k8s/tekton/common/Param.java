package org.k8s.tekton.common;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Param {

    private String name;

    private ParamValue value;

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ParamValue {

        @ApiModelProperty(value = "type", position = 0)
        private String type;

        @ApiModelProperty(value = "stringVal", position = 1)
        private String stringVal;

        @ApiModelProperty(value = "arrayVal", position = 2)
        private List<String> arrayVal;

        @ApiModelProperty(value = "objectVale", position = 3)
        private Map<String,String> objectVal;

    }

}
