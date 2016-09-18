package Window;

import Methods.UserLogInOut;
import org.testng.annotations.Test;

/**
 * Created by iqbal on 9/18/2016.
 */
public class TestReg extends UserLogInOut {
        @Test
        public void TestReg() throws Exception {

            String[] getRegData = signUpData();
            sleepFor(5);
            methods.FirstNameInput(getRegData[0]);
            sleepFor(2);
            methods.LastNameInput(getRegData[1]);
            sleepFor(2);
            methods.EmailInput(getRegData[2]);
            sleepFor(2);
            methods.PassInput(getRegData[3]);
            sleepFor(2);
            methods.Regitrstion();
        }
}
