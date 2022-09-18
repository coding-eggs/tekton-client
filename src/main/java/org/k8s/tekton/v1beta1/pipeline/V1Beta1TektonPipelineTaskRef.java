package org.k8s.tekton.v1beta1.pipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.k8s.tekton.v1beta1.V1Beta1TektonResolverRef;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineTaskRef {

    @ApiModelProperty(value = "taskRef 引用的 task name ",position = 0)
    private String name;

    @ApiModelProperty(value = "kind", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", position = 2)
    private String apiVersion;

    @ApiModelProperty(value = "ResolverRef 允许在远程位置引用任务，如 git repo。仅当启用 alpha 功能门时才支持此字段",position = 3)
    private V1Beta1TektonResolverRef v1Beta1TektonResolverRef;

}
