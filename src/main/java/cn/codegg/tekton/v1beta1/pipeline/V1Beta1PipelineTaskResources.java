package cn.codegg.tekton.v1beta1.pipeline;


import cn.codegg.tekton.v1beta1.task.V1Beta1TaskResourceBinding;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1PipelineTaskResources {

    @ApiModelProperty(value = "Inputs 保存调用此任务的输入资源", position = 0)
    private List<V1Beta1PipelineTaskInputResource> inputs;

    @ApiModelProperty(value = "输出保存调用此任务的输入资源", position = 1)
    private List<V1Beta1PipelineTaskOutputResource> outputs;

}
