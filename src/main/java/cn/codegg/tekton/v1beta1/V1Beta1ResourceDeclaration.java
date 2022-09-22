package cn.codegg.tekton.v1beta1;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1ResourceDeclaration {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "type",position = 1)
    private String type;

    @ApiModelProperty(value = "描述", position = 2)
    private String description;

    @ApiModelProperty(value = "workspace 文件夹将被复制的路径", position = 3)
    private String targetPath;

    @ApiModelProperty(value = "是否可选", position = 4)
    private Boolean optional;
}
