package steps;

import com.qacart.base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    @Before
    public void runsBeforeAnyScenario(){
        System.out.println("Before");
    }

    @After
    public void runsAfterAnyScenario(){
        driver.quit();
    }
}
