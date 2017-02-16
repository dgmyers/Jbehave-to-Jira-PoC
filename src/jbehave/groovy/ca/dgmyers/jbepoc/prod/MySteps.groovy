package ca.dgmyers.jbepoc

import ca.dgmyers.jbepoc.prod.MyProd
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When
import org.jbehave.core.steps.Steps

/**
 * Created by dgmyers on 2/4/2017.
 */
class MySteps extends Steps{

    MyProd mine = new MyProd();
    int result;

    public MySteps(){

        println("Instantiate")
    }

    @When("When I add <first> and <second> numbers")
    public void stepA(int first, int second) {
        throw new RuntimeException()
        result = mine.add(first, second)
    }

    @Then("Then I get the <sum>")
    public void stepB(int sum) {

        assert result == sum
    }

    @Given("I add")
    public void stepD() {
        //result = mine.add(first, second)
        println("A")
    }

    @When("I do")
    public void stepE() {
        //result = mine.add(first, second)
        println("B")
    }

    @Then("I get")
    public void stepF() {
        //result = mine.add(first, second)
        println("C")
    }
}