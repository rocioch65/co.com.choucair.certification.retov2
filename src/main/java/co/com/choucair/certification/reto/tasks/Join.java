package co.com.choucair.certification.reto.tasks;
import co.com.choucair.certification.reto.userinterface.uTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Join implements Task{

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strPassword;
    private String strConfPassword;

    public Join(String strFirstName, String strLastName, String strEmail, String strPassword, String strConfPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.strConfPassword = strConfPassword;
    }

    public static Join theCommunity(String strFirstName, String strLastName, String strEmail, String strPassword, String strConfPassword) {
        return Tasks.instrumented(
                Join.class, strFirstName, strLastName, strEmail,
                strPassword, strConfPassword
        );
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(
                Click.on(uTestRegisterPage.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(uTestRegisterPage.INPUT_FIRTSNAME),
                Enter.theValue(strLastName).into(uTestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(uTestRegisterPage.INPUT_EMAIL),
                Click.on(uTestRegisterPage.SELECT_BIRTHMONTH),
                Click.on(uTestRegisterPage.SELECT_MONTH),
                Click.on(uTestRegisterPage.SELECT_BIRTHDAY),
                Click.on(uTestRegisterPage.SELECT_DAY),
                Click.on(uTestRegisterPage.SELECT_BIRTHYEAR),
                Click.on(uTestRegisterPage.SELECT_YEAR),
                Click.on(uTestRegisterPage.LOCATION_BUTTON),
                Click.on(uTestRegisterPage.DEVICES_BUTTON),
                Click.on(uTestRegisterPage.LAST_STEP_BUTTON),
                Enter.theValue(strPassword).into(uTestRegisterPage.CREATE_PASSWORD_INPUT),
                Enter.theValue(strConfPassword).into(uTestRegisterPage.CONFIRM_PASSWORD_INPUT),
                Click.on(uTestRegisterPage.TERMS_CHECK),
                Click.on(uTestRegisterPage.PRIVACY_CHECK),
                Click.on(uTestRegisterPage.COMPLETE_BUTTON),
                Click.on(uTestRegisterPage.WELCOME_MESSAGE)
        );
    }
}
