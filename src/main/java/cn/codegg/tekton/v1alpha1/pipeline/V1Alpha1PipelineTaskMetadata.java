package cn.codegg.tekton.v1alpha1.pipeline;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1PipelineTaskMetadata {

    @ApiModelProperty(value = "task 标签", position = 0)
    private Map<String, String> labels;

    @ApiModelProperty(value = "task 的注解", position = 1)
    private Map<String, String> annotations;

}
