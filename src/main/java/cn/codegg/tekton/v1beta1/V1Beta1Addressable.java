package cn.codegg.tekton.v1beta1;


import cn.codegg.tekton.common.URL;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1Addressable {

    private String name;

    private URL url;

    private String CACerts;

}
