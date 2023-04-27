package cn.codegg.tekton.v1beta1.resolution;

import cn.codegg.tekton.v1beta1.V1Beta1RefSource;
import io.kubernetes.client.openapi.models.V1Condition;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class V1Beta1ResolutionRequestStatus {

    @ApiModelProperty(value = "observedGeneration")
    private long observedGeneration;

    @ApiModelProperty(value = "conditions", notes = "对资源当前状态的最新可用观测值")
    private List<V1Condition> conditions;

    @ApiModelProperty(value = "annotations", notes = "//批注是资源的附加状态字段，用于保存" +
            "//附加状态以及向用户传达更多信息。这是" +
            "//大致类似于任何k8s资源上的注释，只是协调器在传达" +
            "//向外提供更丰富的信息")
    private Map<String, String> annotations;

    @ApiModelProperty(value = "data", notes = " Use RefSource instead")
    private String data;

    @ApiModelProperty(value = "RefSource是记录url、摘要和入口点的远程数据的源引用。")
    private V1Beta1RefSource refSource;


}
