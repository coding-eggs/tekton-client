package cn.codegg.tekton.v1beta1;


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
public class V1Beta1WhenExpression {


    @ApiModelProperty(value = "input", notes = "input 是表达式的输入，可以是静态输入或变量（参数或结果）。如果未提供，则默认为空字符串", position = 0)
    private String input;

    @ApiModelProperty(value = "操作符",notes = "in , notin", position = 1)
    private String operator;

    @ApiModelProperty(value = "value", notes = "string array ", position = 2)
    private List<String> values;




}
