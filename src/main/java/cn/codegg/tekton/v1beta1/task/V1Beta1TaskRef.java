package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.v1beta1.V1Beta1ResolverRef;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskRef {

    @ApiModelProperty(value = "taskRef 引用的 task name ",position = 0)
    private String name;

    @ApiModelProperty(value = "kind", notes = "TaskKind表示任务的种类：1。将Kind设置为“Task”时的Namespaced Task。如果Kind为“”，则默认为“Task”。2.当Kind设置为“ClusterTask”3时，群集作用域任务。Kind为非空且APIVersion为非空时的自定义任务", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", notes = "引用的API版本注意：具有非空APIVersion和Kind的任务被视为自定义任务", position = 2)
    private String apiVersion;

    @Deprecated
    @ApiModelProperty(value = "对 Tekton Bundle 的 Bundle url 引用。请将ResolverRef与bundle解析器一起使用。", position = 3)
    private String bundle;

    @ApiModelProperty(value = "ResolverRef 允许在远程位置引用任务，如 git repo。仅当启用 alpha 功能门时才支持此字段",position = 4)
    private V1Beta1ResolverRef ResolverRef;

}
