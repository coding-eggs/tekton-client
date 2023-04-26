package cn.codegg.tekton.v1;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1RefSource {

    @ApiModelProperty(value = "uri" , position = 0)
    private String uri;

    @ApiModelProperty(value = "摘要是URI指定的工件内容的加密摘要的集合")
    private Map<String, String> digest;

    @ApiModelProperty(value = "EntryPoint标识生成的入口点。这通常是生成定义文件和/或该文件中的目标标签的路径。示例：“task/git clone/0.8/git clone.yaml”", position = 2)
    private String entryPoint;

}
