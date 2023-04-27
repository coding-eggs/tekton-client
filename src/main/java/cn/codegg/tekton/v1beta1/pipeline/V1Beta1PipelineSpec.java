package cn.codegg.tekton.v1beta1.pipeline;


import cn.codegg.tekton.v1beta1.V1Beta1ParamSpec;
import com.google.gson.annotations.SerializedName;
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
public class V1Beta1PipelineSpec {

    @ApiModelProperty(value = "ui展示名称", position = 0)
    private String displayName;

    @ApiModelProperty(value = "pipeline 描述", position = 0)
    private String description;

    @Deprecated
    @ApiModelProperty(value = "Resources 将分配给 Pipeline task 的资源的名称和类型声明为输入和输出。", position = 1)
    private List<V1Beta1PipelineDeclaredResource> resources;

    @ApiModelProperty(value = "pipeline 中的 task", position = 2)
    private List<V1Beta1PipelineTask> tasks;

    @ApiModelProperty(value = "声明了运行此pipeline时必须提供的输入参数列表", position = 3)
    private List<V1Beta1ParamSpec> params;

    @ApiModelProperty(value = "声明了一组命名的工作空间，这些工作空间预计将由 PipelineRun 提供", position = 4)
    private List<V1Beta1PipelineWorkspaceDeclaration> workspaces;

    @ApiModelProperty(value = "pipeline 输出列表", position = 5)
    private List<V1Beta1PipelineResult> results;

    @ApiModelProperty(value = "pipeline结束后运行的任务列表", position = 6)
    @SerializedName("finally")
    private List<V1Beta1PipelineTask> finallyTask;


}
