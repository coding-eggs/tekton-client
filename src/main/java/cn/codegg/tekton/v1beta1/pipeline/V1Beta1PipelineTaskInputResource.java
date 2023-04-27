package cn.codegg.tekton.v1beta1.pipeline;


import cn.codegg.tekton.v1beta1.task.V1Beta1TaskResourceBinding;
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
public class V1Beta1PipelineTaskInputResource {

    private String name;

    private String resource;

    private List<String> from;

}
