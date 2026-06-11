package com.knd.demo.Controller;

import com.knd.demo.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("Demo")
public class DemoController {

    @Autowired
    private DemoHelper demoHelper;

    @GetMapping("GetEmployeeDetails")
    public EmployeeModel employDetails() {
        return demoHelper.getEmployeeDetails();
    }
}
