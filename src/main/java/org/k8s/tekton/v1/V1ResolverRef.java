package org.k8s.tekton.v1;

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
public class V1ResolverRef {

    @ApiModelProperty(value = "resolverName", position = 0)
    private String resolverName;

    @ApiModelProperty(value = "远程pipeline参数", position = 1)
    private List<V1RunParam<?>> params;


}
