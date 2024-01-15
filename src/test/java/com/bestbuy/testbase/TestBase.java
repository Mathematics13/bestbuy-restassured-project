package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt() {

        RestAssured.baseURI = "http://localhost";                                                               // RestAssured is a class
                                                                         //  RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseURI");
        RestAssured.port = 3030;
                                                                                                             //Create property reader class as before
    }

}
