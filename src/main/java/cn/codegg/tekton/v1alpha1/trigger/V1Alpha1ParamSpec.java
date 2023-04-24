package cn.codegg.tekton.v1alpha1.trigger;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1ParamSpec {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "描述", position = 1)
    private String description;

    @ApiModelProperty(value = "value", position = 2)
    @SerializedName("default")
    private String defaultValue;

}
