package org.k8s.tekton.v1beta1.trigger;

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
public class V1Beta1NamespaceSelector {

    @ApiModelProperty(value = "namespace list name")
    private List<String> matchNames;

}