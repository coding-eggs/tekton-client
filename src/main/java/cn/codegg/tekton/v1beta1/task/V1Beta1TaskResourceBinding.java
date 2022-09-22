package cn.codegg.tekton.v1beta1.task;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1beta1.pipeline.V1Beta1PipelineResourceRef;
import cn.codegg.tekton.v1beta1.pipeline.V1Beta1PipelineResourceSpec;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskResourceBinding {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "ResourceRef 是对应该使用的实际 PipelineResource 实例的引用", position = 1)
    private V1Beta1PipelineResourceRef resourceRef;

    @ApiModelProperty(value = "ResourceSpec 是应由 task 创建和使用的资源的规范", position = 2)
    private V1Beta1PipelineResourceSpec resourceSpec;

    @ApiModelProperty(value = "路径可能会在 #1284 中被移除，然后可以使用 PipelineResourceBinding 代替", position = 3)
    private List<String> paths;

}
