import com.telran.model.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @BeforeMethod
    public void precondition() {
        app.user().skipWizard();
        app.user().goToLoginForm();

    }

    @Test
    public void testLogin() {
        app.user().fillLoginForm(new User().withfName("kanter.testing").withPassword("12131415$kanter"));
        app.user().clickLoginButton();
    }
}
