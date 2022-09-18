package org.k8s.tekton.v1beta1.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskRunResult<T> {

    private String name;

    private String type;

    private T value;

}
