package cn.codegg.tekton.v1beta1.task;

import cn.codegg.tekton.v1beta1.V1Beta1ResourceDeclaration;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TaskResources {

    @ApiModelProperty(value = "保存从 DeclaredPipelineResources 中声明的 PipelineResources 到 Task 所需的输入 PipelineResources 的映射", position = 0)
    private V1Beta1ResourceDeclaration inputs;

    @ApiModelProperty(value = "保存从在 DeclaredPipelineResources 中声明的 PipelineResources 到 Task 所需的输入 PipelineResources 的映射",position = 1)
    private V1Beta1ResourceDeclaration outputs;

}
