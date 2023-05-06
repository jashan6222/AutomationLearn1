package SourceCodeDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class thirdDemoTestClass {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test executing from thirdDemoTestClass");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class executing in thirdDemoTestClass");
    }

    @Test
    public void demoTest(){
        System.out.println("demoTest executing from thirdDemoTestClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method executing in thirdDemoTestClass");
    }

}
