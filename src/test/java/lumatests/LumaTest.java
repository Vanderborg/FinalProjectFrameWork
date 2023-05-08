package lumatests;

import base.CommonAPI;
import org.testng.annotations.Test;
import lumapages.HomePage;

public class LumaTest extends CommonAPI {

    @Test
    public void signInTest(){
        HomePage home = new HomePage(getDriver());
        home.navigateToSignIn();
    }
}
