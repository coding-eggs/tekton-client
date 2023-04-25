package cn.codegg.tekton.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeatureFlags {

    private  boolean disableAffinityAssistant;
    private  boolean disableCredsInit;
    private  boolean runningInEnvWithInjectedSidecars;
    private  boolean requireGitSSHSecretKnownHosts;
    private  boolean enableTektonOCIBundles;
    private  boolean scopeWhenExpressionsToTask;
    private  String enableAPIFields;
    private  boolean sendCloudEventsForRuns;
    private  boolean awaitSidecarReadiness;
    private  String enforceNonfalsifiability;
    private  String verificationNoMatchPolicy;
    private  boolean enableProvenanceInStatus;
    private  String resultExtractionMethod;
    private  int maxResultSize;

}
