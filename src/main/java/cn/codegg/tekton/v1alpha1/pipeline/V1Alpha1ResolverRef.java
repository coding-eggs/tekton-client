package cn.codegg.tekton.v1alpha1.pipeline;

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
public class V1Alpha1ResolverRef {

    @ApiModelProperty(value = "resolverName", position = 0)
    private String resolverName;

    @ApiModelProperty(value = "远程pipeline参数", position = 1)
    private List<Param> params;


}
