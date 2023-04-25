package cn.codegg.tekton.v1.pipeline;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1PipelineWorkspaceDeclaration {


    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "description", position = 1)
    private String description;

    @ApiModelProperty(value = "optional", position = 2)
    private boolean optional;

}
