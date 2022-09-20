package org.k8s.tekton.v1beta1.pipeline;

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
public class V1Beta1PipelineResourceSpec {

    @ApiModelProperty(value = "描述", position = 0)
    private String description;

    @ApiModelProperty(value = "type", position = 1)
    private String type;

    @ApiModelProperty(value = "声明一个字符串参数，用于pipelineResources上下文中", position = 2)
    private List<V1Beta1ResourceParam> params;

    @ApiModelProperty(value = "要获取secrets以填充某些资源字段", position = 3)
    private List<V1Beta1SecretParam> secrets;



}
