package cn.codegg.tekton.v1.pipeline;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import cn.codegg.tekton.v1.V1ParamSpec;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1PipelineSpec {

    @ApiModelProperty(value = "pipeline 描述", position = 0)
    private String description;

    @ApiModelProperty(value = "pipeline 中的 task", position = 2)
    private List<V1PipelineTask> tasks;

    @ApiModelProperty(value = "声明了运行此pipeline时必须提供的输入参数列表", position = 3)
    private List<V1ParamSpec<?>> params;

    @ApiModelProperty(value = "声明了一组命名的工作空间，这些工作空间预计将由 PipelineRun 提供", position = 4)
    private List<V1PipelineWorkspaceDeclaration> workspaces;

    @ApiModelProperty(value = "pipeline 输出列表", position = 5)
    private List<V1PipelineResult<?>> results;

    @ApiModelProperty(value = "pipeline结束后运行的任务列表", position = 6)
    @SerializedName("finally")
    private List<V1PipelineTask> finallyTask;


}
