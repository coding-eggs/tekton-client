package cn.codegg.tekton.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EnumApiResources {

    /*
      NAME                              SHORTNAMES   APIVERSION                             NAMESPACED   KIND
        extensions                        ext,exts                               dashboard.tekton.dev/v1alpha1          true         Extension
        resolutionrequests                resolutionrequest,resolutionrequests   resolution.tekton.dev/v1beta1          true         ResolutionRequest
        clustertasks                                                             tekton.dev/v1beta1                     false        ClusterTask
        customruns                                                               tekton.dev/v1beta1                     true         CustomRun
        pipelineruns                      pr,prs                                 tekton.dev/v1                          true         PipelineRun
        pipelines                                                                tekton.dev/v1                          true         Pipeline
        taskruns                          tr,trs                                 tekton.dev/v1                          true         TaskRun
        tasks                                                                    tekton.dev/v1                          true         Task
        verificationpolicies                                                     tekton.dev/v1alpha1                    true         VerificationPolicy
        clusterinterceptors               ci                                     triggers.tekton.dev/v1alpha1           false        ClusterInterceptor
        clustertriggerbindings            ctb                                    triggers.tekton.dev/v1beta1            false        ClusterTriggerBinding
        eventlisteners                    el                                     triggers.tekton.dev/v1beta1            true         EventListener
        interceptors                      ni                                     triggers.tekton.dev/v1alpha1           true         Interceptor
        triggerbindings                   tb                                     triggers.tekton.dev/v1beta1            true         TriggerBinding
        triggers                          tri                                    triggers.tekton.dev/v1beta1            true         Trigger
        triggertemplates                  tt                                     triggers.tekton.dev/v1beta1            true         TriggerTemplate
     */

    @Getter
    @AllArgsConstructor
    public enum V1 {

        PIPELINES("pipelines","tekton.dev/v1","Pipeline","tekton.dev","v1",true),
        PIPELINERUNS("pipelineruns","tekton.dev/v1","PipelineRun","tekton.dev","v1",true),
        TASKS("tasks","tekton.dev/v1","Task","tekton.dev","v1",true),
        TASKRUNS("taskruns","tekton.dev/v1","TaskRun","tekton.dev","v1",true),
        ;

        private final String plural;

        private final String apiVersion;

        private final String kind;

        private final String group;

        private final String version;

        private final boolean namespaced;
    }

    @Getter
    @AllArgsConstructor
    public enum V1Beta1 {

        PIPELINES("pipelines","tekton.dev/v1beta1","Pipeline","tekton.dev","v1beta1",true),
        PIPELINERUNS("pipelineruns","tekton.dev/v1beta1","PipelineRun","tekton.dev","v1beta1",true),
        TASKS("tasks","tekton.dev/v1beta1","Task","tekton.dev","v1beta1",true),
        TASKRUNS("taskruns","tekton.dev/v1beta1","TaskRun","tekton.dev","v1beta1",true),
        CLUSTERTASKS("clustertasks","tekton.dev/v1beta1","ClusterTask","tekton.dev","v1beta1",false),
        CUSTOMRUNS("customruns","tekton.dev/v1beta1","CustomRun","tekton.dev","v1beta1",true),
        CLUSTERTRIGGERBINDINGS("clustertriggerbindings","triggers.tekton.dev/v1beta1","ClusterTriggerBinding","triggers.tekton.dev","v1beta1",false),
        EVENTLISTENERS("eventlisteners","triggers.tekton.dev/v1beta1","EventListener","triggers.tekton.dev","v1beta1",true),
        TRIGGERS("triggers","triggers.tekton.dev/v1beta1","Trigger","triggers.tekton.dev","v1beta1",true),
        TRIGGERBINDINGS("triggerbindings","triggers.tekton.dev/v1beta1","TriggerBinding","triggers.tekton.dev","v1beta1",true),
        TRIGGERTEMPLATES("triggertemplates","triggers.tekton.dev/v1beta1","TriggerTemplate","triggers.tekton.dev","v1beta1",true),

        ;
        private final String plural;

        private final String apiVersion;

        private final String kind;

        private final String group;

        private final String version;

        private final boolean namespaced;
    }

    @Getter
    @AllArgsConstructor
    public enum V1Alpha1 {
        RUNS("runs","tekton.dev/v1alpha1 ","Run","tekton.dev","v1alpha1",true),
        VERIFICATIONPOLICIES("verificationpolicies","tekton.dev/v1alpha1 ","VerificationPolicy","tekton.dev","v1alpha1",true),
        RESOLUTIONREQUESTS("resolutionrequests","resolution.tekton.dev/v1alpha1","ResolutionRequest","resolution.tekton.dev","v1alpha1",true),
        PIPELINERESOURCES("pipelineresources","tekton.dev/v1alpha1 ","PipelineResource","tekton.dev","v1alpha1",true),
        CLUSTERINTERCEPTORS("clusterinterceptors","triggers.tekton.dev/v1alpha1","ClusterInterceptor","triggers.tekton.dev","v1alpha1",false),
        CLUSTERTRIGGERBINDINGS("clustertriggerbindings","triggers.tekton.dev/v1alpha1","ClusterTriggerBinding","triggers.tekton.dev","v1alpha1",false),
        EVENTLISTENERS("eventlisteners","triggers.tekton.dev/v1alpha1","EventListener","triggers.tekton.dev","v1alpha1",true),
        TRIGGERS("triggers","triggers.tekton.dev/v1alpha1","Trigger","triggers.tekton.dev","v1alpha1",true),
        TRIGGERBINDINGS("triggerbindings","triggers.tekton.dev/v1alpha1","TriggerBinding","triggers.tekton.dev","v1alpha1",true),
        TRIGGERTEMPLATES("triggertemplates","triggers.tekton.dev/v1alpha1","TriggerTemplate","triggers.tekton.dev","v1alpha1",true),

        ;
        private final String plural;

        private final String apiVersion;

        private final String kind;

        private final String group;

        private final String version;

        private final boolean namespaced;

    }

}
