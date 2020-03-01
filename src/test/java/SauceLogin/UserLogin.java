package SauceLogin;

import Pages.TestFile;
import org.testng.annotations.Test;

public class UserLogin {

    TestFile JavaCode = new TestFile();

    @Test (priority = 1)
    public void TestingloginForStandardUser(){
        JavaCode.goToWebsite();
        JavaCode.enterUsername("standard_user");
        JavaCode.enterPassword();
        JavaCode.clickSubmit();
        JavaCode.VerifyingLogin(true);
    }

    @Test(priority = 2)
    public void TestingLoginForLockedOutUser(){
        JavaCode.goToWebsite();
        JavaCode.enterUsername("locked_out_user");
        JavaCode.enterPassword();
        JavaCode.clickSubmit();
        JavaCode.VerifyingLogin(false);
    }

//    @Test
//    public void TesingLoginForAllUser(){
//        LoginTestMaster("standard_user", true);
//        LoginTestMaster("locked_out_user", false);
//    }

}
