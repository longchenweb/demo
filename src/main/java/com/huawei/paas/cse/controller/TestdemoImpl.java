package com.huawei.paas.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-09-28T13:54:17.803Z")

@RestSchema(schemaId = "testdemo")
@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON)
public class TestdemoImpl {

    @Autowired
    private TestdemoDelegate userTestdemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestdemoDelegate.helloworld(name);
    }

}
