package org.k8s.tekton.v1beta1.pipeline;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1PipelineResourceResult {

    @ApiModelProperty(value = "key", position = 0)
    private String key;

    @ApiModelProperty(value = "value", position = 1)
    private String value;

    @ApiModelProperty(value = "resourceName", position = 2)
    private String resourceName;

    @ApiModelProperty(value = "ResultType 用于确定 PipelineResourceResult 是否来自 task 结果 请注意，ResultType 是另一种类型，用于定义我们用于 Results 的数据类型（例如字符串、数组等）", position = 3)
    private Integer type;

}
