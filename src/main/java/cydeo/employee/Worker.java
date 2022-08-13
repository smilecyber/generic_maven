package cydeo.employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker extends Employee{
    private Director director;
}
