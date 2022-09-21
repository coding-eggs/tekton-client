package org.k8s.tekton.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class URL {

    @ApiModelProperty(value = "scheme", position = 0)
    private String Scheme;
    @ApiModelProperty(value = "加密数据", position = 1)
    private String Opaque;
    @ApiModelProperty(value = "用户信息，包括username;password",position = 2)
    private Userinfo User;
    @ApiModelProperty(value = "host or host:port", position = 3)
    private String Host;
    @ApiModelProperty(value = "路径（相对路径可以省略前导斜杠）", position = 4)
    private String Path;
    @ApiModelProperty(value = "u.Path 的转义形式", position = 5)
    private String RawPath;
    @ApiModelProperty(value = "不发出空主机", position = 6)
    private Boolean OmitHost;
    @ApiModelProperty(value = "即使 RawQuery 为空，也追加一个查询 ('?')", position = 7)
    private Boolean ForceQuery;
    @ApiModelProperty(value = "加密查询值，不带？", position = 8)
    private String RawQuery;
    @ApiModelProperty(value = "参考片段，不带 #", position = 9)
    private String Fragment;
    @ApiModelProperty(value = "EscapedFragment 返回 u.Fragment 的转义形", position = 10)
    private String RawFragment;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Userinfo {

        @ApiModelProperty(value = "username", position = 0)
        private String username;

        @ApiModelProperty(value = "password", position = 1)
        private String password;

        @ApiModelProperty(value = "passwordSet", position = 2)
        private Boolean passwordSet;

    }

}
