package com.huawei.paas.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTestdemo {

        TestdemoDelegate testdemoDelegate = new TestdemoDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = testdemoDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}