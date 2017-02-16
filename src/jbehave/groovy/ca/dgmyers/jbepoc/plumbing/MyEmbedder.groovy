package ca.dgmyers.jbepoc.plumbing

import ca.dgmyers.jbepoc.MySteps
import org.jbehave.core.configuration.Configuration
import org.jbehave.core.configuration.MostUsefulConfiguration
import org.jbehave.core.embedder.Embedder
import org.jbehave.core.embedder.EmbedderControls
import org.jbehave.core.io.LoadFromClasspath
import org.jbehave.core.io.LoadFromRelativeFile
import org.jbehave.core.io.LoadFromURL
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser
import org.jbehave.core.reporters.CrossReference
import org.jbehave.core.reporters.StoryReporterBuilder
import org.jbehave.core.steps.InjectableStepsFactory
import org.jbehave.core.steps.InstanceStepsFactory
import org.jbehave.core.steps.ParameterConverters
import org.jbehave.core.steps.PrintStreamStepMonitor
import org.jbehave.core.steps.SilentStepMonitor
import org.jbehave.core.steps.StepMonitor

import java.text.SimpleDateFormat

class MyEmbedder extends Embedder {

    @Override
    public EmbedderControls embedderControls() {

        return new EmbedderControls()
    }

    @Override
    public Configuration configuration() {

        return new MostUsefulConfiguration()
                .useStoryLoader(new LoadFromRelativeFile(new File("C:\\Users\\Grama\\Desktop\\svn\\jbepoc\\src\\jbehave\\stories").toURI().toURL()))
                .useParameterConverters(new ParameterConverters()
                .addConverters(new ParameterConverters.DateConverter(new SimpleDateFormat("yyyy-MM-dd")))) // use custom date pattern
                .useStepMonitor(new PrintStreamStepMonitor())
    }

    @Override
    public InjectableStepsFactory stepsFactory() {

        return new InstanceStepsFactory(configuration(), new MySteps())
    }

}