package ca.dgmyers.jbepoc.plumbing

import org.jbehave.core.embedder.EmbedderControls
import org.jbehave.core.embedder.EmbedderMonitor
import org.jbehave.core.embedder.MetaFilter
import org.jbehave.core.failures.BatchFailures
import org.jbehave.core.model.Meta
import org.jbehave.core.model.Scenario
import org.jbehave.core.model.Story
import org.jbehave.core.model.StoryDuration
import org.jbehave.core.model.StoryMaps
import org.jbehave.core.reporters.ReportsCount
import sun.awt.EmbeddedFrame

import java.util.concurrent.ExecutorService

class MultiEmbeddedMonitor implements EmbedderMonitor{

    Collection<EmbedderMonitor> renameMe;
    MultiEmbeddedMonitor(EmbedderMonitor ... embeddedMonitors) {
        for (embeddedMonitors){ //todo stream this

        }

    }

    //todo idk some other constructor
    //I should not have to code this

    void runningEmbeddable(String name){
//hakl:runningEmbeddable
}//hook

    void embeddableFailed(String name, Throwable cause){
//hakl:embeddableFailed
}//hook

    void embeddableNotConfigurable(String name){
//hakl:embeddableNotConfigurable
}//hook

    void embeddablesSkipped(List<String> classNames){
//hakl:embeddablesSkipped
}//hook

    void metaNotAllowed(Meta meta, MetaFilter filter){
//hakl:metaNotAllowed
}//hook

    void runningStory(String path){
//hakl:runningStory
}//hook

    void storyFailed(String path, Throwable cause){
//hakl:storyFailed
}//hook

    void storiesSkipped(List<String> storyPaths){
//hakl:storiesSkipped
}//hook

    /** @deprecated Use #storiesNotAllowed(List<String>, MetaFilter, boolean) */
    void storiesNotAllowed(List<Story> notAllowed, MetaFilter filter){
//hakl:storiesNotAllowed
}//hook

    void storiesNotAllowed(List<Story> notAllowed, MetaFilter filter, boolean verbose){
//hakl:storiesNotAllowed
}//hook

    void scenarioNotAllowed(Scenario scenario, MetaFilter filter){
//hakl:scenarioNotAllowed
}//hook

    void batchFailed(BatchFailures failures){
//hakl:batchFailed
}//hook

    void beforeOrAfterStoriesFailed(){
//hakl:beforeOrAfterStoriesFailed
}//hook

    void generatingReportsView(File outputDirectory, List<String> formats, Properties viewProperties){
//hakl:generatingReportsView
}//hook

    void reportsViewGenerationFailed(File outputDirectory, List<String> formats, Properties viewProperties,
                                     Throwable cause){
//hakl:reportsViewGenerationFailed
}//hook

    void reportsViewGenerated(ReportsCount count){
//hakl:reportsViewGenerated
}//hook

    void reportsViewFailures(ReportsCount count){
//hakl:reportsViewFailures
}//hook

    void reportsViewNotGenerated(){
//hakl:reportsViewNotGenerated
}//hook

    void runningWithAnnotatedEmbedderRunner(String className){
//hakl:runningWithAnnotatedEmbedderRunner
}//hook

    void annotatedInstanceNotOfType(Object annotatedInstance, Class<?> type){
//hakl:annotatedInstanceNotOfType
}//hook

    void mappingStory(String storyPath, List<String> metaFilters){
//hakl:mappingStory
}//hook

    void generatingMapsView(File outputDirectory, StoryMaps storyMaps, Properties viewProperties){
//hakl:generatingMapsView
}//hook

    void mapsViewGenerationFailed(File outputDirectory, StoryMaps storyMaps, Properties viewProperties, Throwable cause){
//hakl:mapsViewGenerationFailed
}//hook

    void generatingNavigatorView(File outputDirectory, Properties viewResources){
//hakl:generatingNavigatorView
}//hook

    void navigatorViewGenerationFailed(File outputDirectory, Properties viewResources, Throwable cause){
//hakl:navigatorViewGenerationFailed
}//hook

    void navigatorViewNotGenerated(){
//hakl:navigatorViewNotGenerated
}//hook

    void processingSystemProperties(Properties properties){
//hakl:processingSystemProperties
}//hook

    void systemPropertySet(String name, String value){
//hakl:systemPropertySet
}//hook

    void storyTimeout(Story story, StoryDuration storyDuration){
//hakl:storyTimeout
}//hook

    void usingThreads(int threads){
//hakl:usingThreads
}//hook

    void usingExecutorService(ExecutorService executorService){
//hakl:usingExecutorService
}//hook

    void usingControls(EmbedderControls embedderControls){
//hakl:usingControls
}//hook

    void invalidTimeoutFormat(String path){
//hakl:invalidTimeoutFormat
}//hook

    void usingTimeout(String path, long timeout){
//hakl:usingTimeout
}//hook


}
