package org.k8s.tekton.v1beta1.trigger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1EventListenerTrigger {



    private List<V1Beta1TriggerSpecBinding> bindings;

    private V1Beta1TriggerSpecTemplate template;

    private String triggerRef;

    private String name;

    private List<V1Beta1TriggerInterceptor> interceptors;

    private String serviceAccountName;


}
