package cn.codegg.tekton.v1beta1;

import io.kubernetes.client.openapi.models.*;
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
public class V1Beta1StepTemplate {

    @Deprecated
    @ApiModelProperty(value = "name", notes = "指定为DNS_LABEL的每个步骤的默认名称。任务中的每个步骤都必须有一个唯一的名称。无法更新",position = 0)
    private String name;

    @ApiModelProperty(value = "镜像" ,position = 0)
    private String image;

    @ApiModelProperty(value = "镜像的执行命令", notes = "如果没有则使用镜像内部的 ENTRYPOINT。更多详情：https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell" ,position = 1)
    private List<String> command;

    @ApiModelProperty(value = "命令参数", notes = "如果没有则使用镜像中的 CMD " ,position = 2)
    private List<String> args;

    @ApiModelProperty(value = "工作空间", notes = "该步骤的工作目录，没有则创建文件夹。未提供则使用容器默认的" ,position = 3)
    private String workingDir;

    @Deprecated
    @ApiModelProperty(value = "要从步骤的容器中公开的端口列表。在这里公开端口可以为系统提供有关容器使用的网络连接的附加信息，但主要是信息性的。此处未指定端口并不能防止该端口被暴露。任何侦听容器内默认“0.0.0.0”地址的端口都可以从网络访问。无法更新", position = 3)
    private List<V1ContainerPort> ports;

    @ApiModelProperty(value = "环境变量来源列表，例如configmap", notes = "详情见：https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#envfromsource-v1-core" ,position = 4)
    private List<V1EnvFromSource> envFrom;

    @ApiModelProperty(value = "环境变量列表" ,position = 5)
    private List<V1EnvVar> env;

    @ApiModelProperty(value = "资源配额" ,position = 6)
    private V1ResourceRequirements resources;

    @ApiModelProperty(value = "step 的 文件卷" ,position = 7)
    private List<V1VolumeMount> volumeMounts;

    @ApiModelProperty(value = "step 使用的块设备列表" ,position = 8)
    private List<V1VolumeDevice> volumeDevices;

    @Deprecated
    @ApiModelProperty(value = "存活探针", position = 9)
    private V1Probe livenessProbe;

    @Deprecated
    @ApiModelProperty(value = "就绪探针", position = 9)
    private V1Probe readinessProbe;

    @Deprecated
    @ApiModelProperty(value = "启动探针", position = 9)
    private V1Probe startupProbe;

    @Deprecated
    @ApiModelProperty(value = "生命周期")
    private V1Lifecycle lifecycle;

    @Deprecated
    @ApiModelProperty(value = "此字段将在将来的版本中删除，并且不能有意义地使用")
    private String terminationMessagePath;

    @Deprecated
    @ApiModelProperty(value = "指示应如何填充终止消息。文件将使用terminationMessagePath的内容来填充成功和失败的容器状态消息。如果终止消息文件为空并且容器因错误退出，则FallbackToLogsError将使用容器日志输出的最后一块。日志输出限制为2048字节或80行，以较小者为准。默认为“文件”。无法更新")
    private String terminationMessagePolicy;

    @ApiModelProperty(value = "镜像拉取策略", notes = "Always, Never, IfNotPresent,默认 Always" ,position = 9)
    private String imagePullPolicy;

    @ApiModelProperty(value = "SecurityContext 定义了 Step 应该运行的安全选项" ,notes = "如果设置，SecurityContext 的字段将覆盖 PodSecurityContext 的等效字" ,position = 10)
    private V1SecurityContext securityContext;

    @Deprecated
    @ApiModelProperty(value = "此容器是否应在容器运行时为stdin分配缓冲区。如果未设置此项，则从容器中的stdin读取总是会导致EOF。默认值为false", position = 11)
    private boolean stdin;

    @Deprecated
    @ApiModelProperty(value = "容器运行时是否应在stdin通道通过单个附加打开后关闭该通道。当stdin为true时，stdin流将在多个附加会话中保持打开状态。如果stdinOnce设置为true，则stdin在容器启动时打开，在第一个客户端连接到stdin之前为空，然后保持打开并接受数据，直到客户端断开连接，此时stdin关闭并保持关闭，直到容器重新启动。如果此标志为false，则从stdin读取的容器进程将永远不会收到EOF。默认值为false", position = 11)
    private boolean stdinOnce;

    @Deprecated
    @ApiModelProperty(value = "此容器是否应为自己分配一个DeprecatedTTY，还要求“stdin”为true。默认值为false", position = 11)
    private boolean tty;
}
