package cn.codegg.tekton.v1beta1.resolution;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class V1Beta1ResolutionRequest {

    private V1ObjectMeta metadata;

    private V1Beta1ResolutionRequestSpec spec;

    private V1Beta1ResolutionRequestStatus status;

}
