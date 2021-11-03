package com.parkhomenko.springbootrabbitmqretrydemo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.Getter;
import lombok.Setter;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "@id",
        scope = Employee.class)
@Getter
@Setter
public class Employee {

    private String empName;
    private String empId;
    private int salary;

    public String toString() {
        return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
    }

}
