package cn.codegg.tekton.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumApiResources {

    /*
      NAME                              SHORTNAMES   APIVERSION                             NAMESPACED   KIND
      extensions                        ext,exts     dashboard.tekton.dev/v1alpha1          true         Extension
      resolutionrequests                             resolution.tekton.dev/v1alpha1         true         ResolutionRequest
      clustertasks                                   tekton.dev/v1beta1                     false        ClusterTask
      pipelineresources                              tekton.dev/v1alpha1                    true         PipelineResource
      pipelineruns                      pr,prs       tekton.dev/v1beta1                     true         PipelineRun
      pipelines                                      tekton.dev/v1beta1                     true         Pipeline
      runs                                           tekton.dev/v1alpha1                    true         Run
      taskruns                          tr,trs       tekton.dev/v1beta1                     true         TaskRun
      tasks                                          tekton.dev/v1beta1                     true         Task
      clusterinterceptors               ci           triggers.tekton.dev/v1alpha1           false        ClusterInterceptor
      clustertriggerbindings            ctb          triggers.tekton.dev/v1beta1            false        ClusterTriggerBinding
      eventlisteners                    el           triggers.tekton.dev/v1beta1            true         EventListener
      triggerbindings                   tb           triggers.tekton.dev/v1beta1            true         TriggerBinding
      triggers                          tri          triggers.tekton.dev/v1beta1            true         Trigger
      triggertemplates                  tt           triggers.tekton.dev/v1beta1            true         TriggerTemplate
     */

    EXTENSIONS("extensions","dashboard.tekton.dev/v1alpha1","Extension","dashboard.tekton.dev","v1alpha1",true),
    RESOLUTIONREQUESTS("resolutionrequests","resolution.tekton.dev/v1alpha1","ResolutionRequest","resolution.tekton.dev","v1alpha1",true),
    CLUSTERTASKS("clustertasks","tekton.dev/v1beta1","ClusterTask","tekton.dev","v1beta1",false),
    PIPELINERESOURCES("pipelineresources","tekton.dev/v1alpha1 ","PipelineResource","tekton.dev","v1alpha1",true),
    PIPELINERUNS("pipelineruns","tekton.dev/v1beta1","PipelineRun","tekton.dev","v1beta1",true),
    PIPELINES("pipelines","tekton.dev/v1beta1 ","Pipeline","tekton.dev","v1beta1",true),
    RUNS("runs","tekton.dev/v1alpha1 ","Run","tekton.dev","v1alpha1",true),
    TASKRUNS("taskruns","tekton.dev/v1beta1","TaskRun","tekton.dev","v1beta1",true),
    TASKS("tasks","tekton.dev/v1beta1","Task","tekton.dev","v1beta1",true),
    CLUSTERINTERCEPTORS("clusterinterceptors","triggers.tekton.dev/v1alpha1","ClusterInterceptor","triggers.tekton.dev","v1alpha1",false),
    CLUSTERTRIGGERBINDINGS("clustertriggerbindings","triggers.tekton.dev/v1beta1","ClusterTriggerBinding","triggers.tekton.dev","v1beta1",false),
    EVENTLISTENERS("eventlisteners","triggers.tekton.dev/v1beta1","EventListener","triggers.tekton.dev","v1beta1",true),
    TRIGGERBINDINGS("triggerbindings","triggers.tekton.dev/v1beta1","TriggerBinding","triggers.tekton.dev","v1beta1",true),
    TRIGGERS("triggers","triggers.tekton.dev/v1beta1","Trigger","triggers.tekton.dev","v1beta1",true),
    TRIGGERTEMPLATES("triggertemplates","triggers.tekton.dev/v1beta1","TriggerTemplate","triggers.tekton.dev","v1beta1",true),



    ;

    private final String plural;

    private final String apiVersion;

    private final String kind;

    private final String group;

    private final String version;

    private final boolean namespaced;





}
