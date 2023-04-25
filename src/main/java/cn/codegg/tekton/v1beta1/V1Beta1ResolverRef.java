package cn.codegg.tekton.v1beta1;

import cn.codegg.tekton.common.Param;
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
public class V1Beta1ResolverRef {

    @ApiModelProperty(value = "resolverName", notes = "解析程序是应该执行引用的Tekton资源解析的解析程序的名称，例如“gi", position = 0)
    private String resolverName;

    @ApiModelProperty(value = "远程pipeline参数", position = 1)
    private List<Param> params;


}
