package ca.dgmyers.jbepoc.plumbing

import ca.dgmyers.jbepoc.MySteps
import org.jbehave.core.configuration.MostUsefulConfiguration
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.JUnitStories
import org.jbehave.core.junit.JUnitStory
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory
import org.jbehave.core.steps.ProvidedStepsFactory
import org.jbehave.core.steps.Step
import org.jbehave.core.steps.StepFinder
import org.jbehave.core.steps.Steps
import org.junit.Test;
import org.junit.runner.RunWith

import java.lang.reflect.Array;

public class MyRunner {

    @Test
    public void hello(){
        println("hello world")
    }

    @Test
    public void runClasspathLoadedStoriesAsJUnit() {

        Embedder embedder = new MyEmbedder()
        List<String> storyPaths = Arrays.asList("ca/dgmyers/jbepoc/prod/MyStory.story", "ca/dgmyers/jbepoc/prod/BadStory.story")

        embedder.useEmbedderMonitor(new MultiEmbeddedMonitor(embedder.embedderMonitor(), new HardCodedMonitor()));

        embedder.candidateSteps().add(new MySteps());
        embedder.runStoriesAsPaths(storyPaths)
    }
}
