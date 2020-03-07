import cucumber.api.java.Before;
import org.junit.Test;
import pages.Basketpage;
import pages.Homepage;
import pages.Resultspage;
import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.fail;

public class Testsuite
{
    public Homepage homepage=new Homepage();
    public Resultspage resultpage =new Resultspage();
    public Basketpage basketpage=new Basketpage();

    @Test
    public void searchtest()
    {
        String searchterm = "adidas";
        homepage.dosearch(searchterm);
        assertThat(homepage.getcurrenturl(),endsWith(searchterm));


    }
}
