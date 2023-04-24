package cn.codegg.tekton.v1alpha1;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1TaskRef {

    @ApiModelProperty(value = "taskRef 引用的 task name ",position = 0)
    private String name;

    @ApiModelProperty(value = "kind", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", position = 2)
    private String apiVersion;

    @ApiModelProperty(value = "对 Tekton Bundle 的 Bundle url 引用。", position = 3)
    private String bundle;

    @ApiModelProperty(value = "ResolverRef 允许在远程位置引用任务，如 git repo。仅当启用 alpha 功能门时才支持此字段",position = 4)
    private V1Alpha1ResolverRef ResolverRef;

}
