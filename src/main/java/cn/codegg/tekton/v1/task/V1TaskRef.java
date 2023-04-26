package cn.codegg.tekton.v1.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1.V1ResolverRef;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1TaskRef {

    @ApiModelProperty(value = "taskRef 引用的 task name ",position = 0)
    private String name;

    @ApiModelProperty(value = "kind", notes = "TaskKind表示任务的种类：1。将Kind设置为“Task”时的Namespaced Task。如果Kind为“”，则默认为“Task”。2.当Kind为非空且APIVersion为非空时的自定义任务", position = 1)
    private String kind;

    @ApiModelProperty(value = "apiVersion", notes = "referent的API版本注意：APIVersion和Kind非空的Task被视为Custom Task", position = 2)
    private String apiVersion;

    @ApiModelProperty(value = "ResolverRef 允许在远程位置引用任务，如 git repo。仅当启用 alpha 功能门时才支持此字段",position = 4)
    private V1ResolverRef ResolverRef;

}
