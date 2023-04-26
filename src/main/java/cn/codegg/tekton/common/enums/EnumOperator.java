package cn.codegg.tekton.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumOperator {

    DoesNotExist("!"),
    Equals("="),
    DoubleEquals("=="),
    In("in"),
    NotEquals("!="),
    NotIn("notin"),
    Exists("exists"),
    GreaterThan("gt"),
    LessThan("lt");

    private final String Operator;



}
