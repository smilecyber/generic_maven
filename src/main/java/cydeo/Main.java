package cydeo;

import cydeo.department.Department;
import cydeo.department.IT;
import cydeo.employee.Director;
import cydeo.employee.Employee;
import cydeo.employee.Manager;
import cydeo.employee.Worker;

public class Main {
    public static void main(String[] args) {
        IT it = new IT();
        it.setCode("it-code");
        it.setName("it-name");
        Employee employee = createEmployee();

        Company company<Employee, Department> = new Company<>();
        //todo check company object initialization
        company.addEmployee(employee);
        company.addDepartment(it);

        //todo list all employee's details
        //todo list all department's details

    }

    public static Employee createEmployee(){
        //todo create 5 worker with different managers and directors

        return new Worker();
    }
}
