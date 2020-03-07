package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.core.StringContains;
import pages.Homepage;
import pages.Resultspage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Stepdefs
{

    private Homepage homePage = new Homepage();
    private Resultspage resultsPage = new Resultspage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable
    {String actual =homePage.getcurrenturl();
     assertThat(actual,endsWith("argos.co.uk/"));
    }

    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String arg1) throws Throwable
    {
        homePage.dosearch("adidas");


    }

    @Then("^I should be able to see adidas product$")
    public void i_should_be_able_to_see_adidas_product() throws Throwable
    {
        assertThat(resultsPage.getSearchTitle(),containsString("adidas"));

    }

}
