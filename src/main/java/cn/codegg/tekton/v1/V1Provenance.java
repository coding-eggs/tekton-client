package cn.codegg.tekton.v1;

import cn.codegg.tekton.common.FeatureFlags;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Provenance {

    private V1RefSource refSource;

    private FeatureFlags featureFlags;

}
