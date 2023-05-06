package Zoho;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class zohoMailTest {

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite executing from Zoho Mail");
    }

    public void noAnnotationMethod(){
        System.out.println("No Annotation Method in Zoho Mail");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method executing in Zoho Mail");
    }

}
