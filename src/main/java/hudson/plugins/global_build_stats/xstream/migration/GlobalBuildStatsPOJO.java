package hudson.plugins.global_build_stats.xstream.migration;

import hudson.plugins.global_build_stats.model.BuildStatConfiguration;
import hudson.plugins.global_build_stats.model.JobBuildResult;
import hudson.plugins.global_build_stats.rententionstrategies.RetentionStrategy;

import java.util.List;

/**
 * Generic interface for GlobalBuildStats POJOs
 * @author fcamblor
 */
public interface GlobalBuildStatsPOJO {
	public List<JobBuildResult> getJobBuildResults();
	public void setJobBuildResults(List<JobBuildResult> jobBuildResults);
	public List<BuildStatConfiguration> getBuildStatConfigs();
	public void setBuildStatConfigs(List<BuildStatConfiguration> buildStatConfigs);
    public List<RetentionStrategy> getRetentionStrategies();
    public void setRetentionStrategies(List<RetentionStrategy> retentionStrategies);
}
