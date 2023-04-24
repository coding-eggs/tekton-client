package cn.codegg.tekton.v1alpha1;

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
public class V1Alpha1RunSpec {


    @ApiModelProperty(value = "task 引用", position = 1)
    private V1Alpha1TaskRef taskRef;

    @ApiModelProperty(value = "spec", position = 2)
    private V1Alpha1EmbeddedRunSpec spec;

    @ApiModelProperty(value = "run 需要的参数", notes = "与task中的param配合使用，这里给task中的param赋值" ,position = 3)
    private List<V1Alpha1RunParam<?>> params;

    @ApiModelProperty(value = "定义用户可以提供的任务运行规范状态", position =  4)
    private String status;

    @ApiModelProperty(value = "为 Run 定义人类可读的状态消息", example = "Run cancelled as the PipelineRun it belongs to has been cancelled.",position = 5)
    private String statusMessage;

    @ApiModelProperty(value = "重试次数", position = 6)
    private Integer retries;

    @ApiModelProperty(value = "service account",position = 3)
    private String serviceAccountName;

    @ApiModelProperty(value = "PodTemplate 保存 pod 特定的配置",position = 9)
    private V1Alpha1PodTemplate podTemplate;

    @ApiModelProperty(value = "超时时间", example = "120s",position = 8)
    private String timeout;

    @ApiModelProperty(value = "task 中使用的  workspace列表", position = 10)
    private List<V1Alpha1WorkspaceBinding> workspaces;



}
