package com.knd.demo.Controller;

import com.knd.demo.EmployeeModel;
import org.springframework.stereotype.Component;

@Component
public class DemoHelper {

    public EmployeeModel getEmployeeDetails() {
        EmployeeModel employee = new EmployeeModel();
        employee.setEmpNo("1");
        employee.setEmpName("Kundan");
        employee.setDesignation("Engineer");

        return employee;
    }
}
