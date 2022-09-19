package org.k8s.tekton.v1beta1.task;


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
public class V1Beta1TaskRunResources {

    @ApiModelProperty(value = "Inputs 保存调用此任务的输入资源", position = 0)
    private List<V1Beta1TaskResourceBinding> inputs;

    @ApiModelProperty(value = "输出保存调用此任务的输入资源", position = 1)
    private List<V1Beta1TaskResourceBinding> outputs;

}
