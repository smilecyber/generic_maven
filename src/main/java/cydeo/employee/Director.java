package cydeo.employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Director extends Employee{
    private Manager manager;
}
