package cn.codegg.tekton.common;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Matrix {

    private List<Param> params;

    private List<Include> include;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Include{

        private String name;

        private List<Param> params;

    }


    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        List<Param> paramList = new ArrayList<>();
        Param param1 = Param.builder().name("aaa")
                .value(ParamValue.builder().type("string").stringVal("valaaa").build())
                .build();
        paramList.add(param1);
        matrix.setParams(paramList);

        List<Include> includeList = new ArrayList<>();
        Include include = Include.builder()
                .name("incluaeaaa")
                .params(paramList)
                .build();
        includeList.add(include);

        matrix.setInclude(includeList);

        System.out.println(new Gson().toJson(matrix));

    }

}
