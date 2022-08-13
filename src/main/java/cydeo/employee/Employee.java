package cydeo.employee;

import cydeo.enums.Shift;
import cydeo.department.Department;
import cydeo.enums.WorkingType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private Department department;
    private WorkingType workingType;
    private String name;
    private String surName;
    private Shift shift;


}
