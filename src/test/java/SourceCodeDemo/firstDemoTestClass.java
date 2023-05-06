package SourceCodeDemo;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstDemoTestClass {

    @BeforeClass
    public void launchBrowser(){
    System.out.println("Chrome opened");
    }

    @Test
    public void testGoogle(){
        System.out.println("Google");
    }

    @Test
    public void testFacebook(){
        System.out.println("Facebook");
    }



}
