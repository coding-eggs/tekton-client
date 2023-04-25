package cn.codegg.tekton.v1beta1;

import cn.codegg.tekton.common.FeatureFlags;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1Provenance {

    private V1Beta1ConfigSource configSource;

    private V1Beta1RefSource refSource;

    private FeatureFlags featureFlags;

}
