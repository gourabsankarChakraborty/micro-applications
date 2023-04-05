package com.abc.ma.controller;

import com.abc.ma.controller.model.CustomerData;
import com.abc.ma.service.MicroApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class MicroApplicationController {

    @Autowired
    MicroApplicationService service;

    @GetMapping(path = "/customer")
    public String getCustomer() {
        return service.getCustomer();
    }

    @GetMapping(path = "/customer", params = "name")
    public String getCustomer(@RequestParam("name") String name) {
        return "Input name" + name;
    }
    @GetMapping(path = "/customer", params = {"name", "age"}, consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCustomer(@RequestParam("name") String name, @RequestParam("age") String age) {
        return "Input name test" + name + " " + age;
    }

    @PostMapping(path = "customer")
    public CustomerData addCustomer(@RequestBody CustomerData request) {
        return service.addCustomer(request);
    }
}
