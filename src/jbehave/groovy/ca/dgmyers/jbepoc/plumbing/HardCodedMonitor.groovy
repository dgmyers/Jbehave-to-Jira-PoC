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
import sun.net.www.http.HttpClient

import java.util.concurrent.ExecutorService

//https://docs.atlassian.com/jira/REST/cloud/
class HardCodedMonitor implements EmbedderMonitor{

    Collection<EmbedderMonitor> renameMe;
    MultiEmbeddedMonitor(EmbedderMonitor ... embeddedMonitors) {
        for (embeddedMonitors){ //todo stream this

        }

    }

    void push(){
        /*
        {
            "self": "http://www.example.com/jira/rest/api/2/issue/10010/comment/10000",
            "id": "10000",
            "author": {
                "self": "http://www.example.com/jira/rest/api/2/user?username=fred",
                "name": "fred",
                "displayName": "Fred F. User",
                "active": false
            },
            "body": "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.",
            "updateAuthor": {
                "self": "http://www.example.com/jira/rest/api/2/user?username=fred",
                "name": "fred",
                "displayName": "Fred F. User",
                "active": false
            },
            "created": "2017-02-14T07:42:54.815+0000",
            "updated": "2017-02-14T07:42:54.816+0000",
            "visibility": {
                "type": "role",
                "value": "Administrators"
            }
        }
        */
        //todo hit all the endpoints

        URL url = new URL("http://sentiment.vivekn.com/api/batch/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setConnectTimeout(5000);//5 secs
        connection.setReadTimeout(5000);//5 secs

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
        out.write(
                "[ " +
                        "\"the fox jumps over the lazy dog\"," +
                        "\"another thing here\" " +
                        "]");
        out.flush();
        out.close();

        int res = connection.getResponseCode();

        System.out.println(res);


        InputStream is = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while((line = br.readLine() ) != null) {
            System.out.println(line);
        }
        connection.disconnect();
    }

    //todo idk some other constructor

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
