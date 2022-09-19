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
    private List<ResourceParam> params;

    @ApiModelProperty(value = "要获取secrets以填充某些资源字段", position = 3)
    private List<SecretParam> secrets;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ResourceParam {

        @ApiModelProperty(value = "name", position = 0)
        private String name;

        @ApiModelProperty(value = "value", position = 1)
        private String value;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SecretParam {

        @ApiModelProperty(value = "字段名称", position = 0)
        private String fieldName;

        @ApiModelProperty(value = "secret key", position = 1)
        private String secretKey;

        @ApiModelProperty(value = "secret name", position = 2)
        private String secretName;

    }

}
