package org.k8s.tekton.v1.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1TaskRunResult<T> {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "type, 目前是字符串，以后可能是 array", position = 1)
    private String type;

    @ApiModelProperty(value = "value", position = 2)
    private T value;

}
