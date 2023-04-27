package cn.codegg.tekton.v1alpha1.resolution;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class V1Alpha1ResolutionRequestSpec {

    private Map<String, String> params;

}
