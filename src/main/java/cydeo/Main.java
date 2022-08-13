package cydeo;

import cydeo.department.Department;
import cydeo.department.IT;
import cydeo.employee.Director;
import cydeo.employee.Employee;
import cydeo.employee.Manager;
import cydeo.employee.Worker;
import cydeo.enums.Shift;
import cydeo.enums.WorkingType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IT it = new IT();
        it.setCode("it-code");
        it.setName("it-name");
        Employee employee = createEmployee(it);

        Company<Employee, Department> company = new Company<>();
        company.setDepartmentList(new ArrayList<>());
        company.setEmployeeList(new ArrayList<>());

        company.addEmployee(employee);
        company.addDepartment(it);

        for (Employee e : company.getEmployeeList()){
            System.out.println(e.getName());
            System.out.println(e.getDepartment().getName());
            System.out.println(e.getShift());
            System.out.println(e.getWorkingType());
        }
        for (Department department : company.getDepartmentList()){
            System.out.println(department.getName());
            System.out.println(department.getCode());
        }
    }

    public static Employee createEmployee(Department department){
        Manager manager = new Manager();
        manager.setDepartment(department);
        manager.setName("ali");
        manager.setSurName("ali");
        manager.setWorkingType(WorkingType.FULL_TIME);
        manager.setShift(Shift.REGULAR);


        Director director = new Director();
        director.setDepartment(department);
        director.setName("ali");
        director.setSurName("ali");
        director.setManager(manager);
        director.setWorkingType(WorkingType.FULL_TIME);
        director.setShift(Shift.REGULAR);


        Worker worker = new Worker();
        worker.setDepartment(department);
        worker.setName("ali");
        worker.setSurName("ali");
        worker.setDirector(director);
        worker.setWorkingType(WorkingType.FULL_TIME);
        worker.setShift(Shift.LATE);
        return worker;
    }
}
