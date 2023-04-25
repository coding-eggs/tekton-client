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
public class V1Beta1Step {

    @ApiModelProperty(value = "步骤名称" ,position = 0)
    private String name;

    @ApiModelProperty(value = "镜像" ,position = 1)
    private String image;

    @ApiModelProperty(value = "镜像的执行命令", notes = "如果没有则使用镜像内部的 ENTRYPOINT。更多详情：https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell" ,position = 2)
    private List<String> command;

    @ApiModelProperty(value = "命令参数", notes = "如果没有则使用镜像中的 CMD " ,position = 3)
    private List<String> args;

    @ApiModelProperty(value = "工作空间", notes = "该步骤的工作目录，没有则创建文件夹。未提供则使用容器默认的" ,position = 4)
    private String workingDir;

    @Deprecated
    @ApiModelProperty(value = "容器端口", notes = "要从步骤的容器中公开的端口列表。在这里公开端口可以为系统提供有关容器使用的网络连接的附加信息，但主要是信息性的。此处未指定端口并不能防止该端口被暴露。任何侦听容器内默认“0.0.0.0”地址的端口都可以从网络访问。无法更新。")
    private List<V1ContainerPort> ports;

    @ApiModelProperty(value = "环境变量来源列表，例如configmap", notes = "详情见：https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#envfromsource-v1-core" ,position = 5)
    private List<V1EnvFromSource> envFrom;

    @ApiModelProperty(value = "环境变量列表" ,position = 6)
    private List<V1EnvVar> env;

    @ApiModelProperty(value = "资源配额" ,position = 7)
    private V1ResourceRequirements resources;

    @ApiModelProperty(value = "step 的 文件卷" ,position = 8)
    private List<V1VolumeMount> volumeMounts;

    @ApiModelProperty(value = "step 使用的块设备列表" ,position = 9)
    private List<V1VolumeDevice> volumeDevices;

    @Deprecated
    @ApiModelProperty(value = "存活探针" ,position = 9)
    private V1Probe livenessProbe;

    @Deprecated
    @ApiModelProperty(value = "就绪探针" ,position = 9)
    private V1Probe readinessProbe;

    @Deprecated
    @ApiModelProperty(value = "启动探针" ,position = 9)
    private V1Probe startupProbe;

    @Deprecated
    @ApiModelProperty(value = "生命周期" ,position = 9)
    private V1Lifecycle lifecycle;

    @ApiModelProperty(value = "镜像拉取策略", notes = "Always, Never, IfNotPresent,默认 Always" ,position = 10)
    private String imagePullPolicy;

    @ApiModelProperty(value = "SecurityContext 定义了 Step 应该运行的安全选项" ,notes = "如果设置，SecurityContext 的字段将覆盖 PodSecurityContext 的等效字" ,position = 11)
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

    @ApiModelProperty(value = "step 执行脚本" ,position = 12)
    private String script;

    @ApiModelProperty(value = "step超时时间" ,position = 13)
    private String timeout;

    @ApiModelProperty(value = "step独占的 workspace 列表" ,notes = "该字段是alpha的字段，必须设置 enable" ,position = 14)
    private List<V1Beta1WorkspaceUsage> workspaces;

    @ApiModelProperty(value = "onError", notes = "OnError定义容器在发生错误时的退出行为: continue or stopAndFail" ,position = 15)
    private String onError;

    @ApiModelProperty(value = "标准step输出流配置" ,position = 16)
    private StepOutputConfig stdoutConfig;

    @ApiModelProperty(value = "stp错误输出流配置" ,position = 17)
    private StepOutputConfig stderrConfig;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class StepOutputConfig {

        @ApiModelProperty(value = "容器本地文件系统的路径")
        private String path;

    }



}
