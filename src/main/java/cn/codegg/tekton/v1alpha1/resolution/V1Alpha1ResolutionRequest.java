package cn.codegg.tekton.v1alpha1.resolution;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Alpha1ResolutionRequest {

    private V1ObjectMeta metadata;

    private V1Alpha1ResolutionRequestSpec spec;

    private V1Alpha1ResolutionRequestStatus status;

}
