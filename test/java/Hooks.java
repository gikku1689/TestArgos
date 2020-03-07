import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import driverfactory.Driver;
import org.junit.Test;

public class Hooks extends Driver
{
    Driver gikku =new Driver();

    @Before
    public void setup()
    {
        gikku.openbrowser();
        gikku.navigateto("https://www.argos.co.uk/");
        gikku.applyImpcitWait();
        gikku.maxibroweser();
    }

    @After
    public void teardown()
    {
        gikku.closebrowser();
    }
}

