package cydeo;

import cydeo.department.Department;
import cydeo.employee.Director;
import cydeo.employee.Employee;
import cydeo.employee.Manager;
import cydeo.employee.Worker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Company<T,S>{
    private List<T> employeeList;
    private List<S> departmentList;

    public boolean addEmployee(T employee){
        //todo check director and manager department is same if class type is worker
        //todo check manager department is same if class type is director
        if (employee instanceof Worker){
            if (((Worker) employee).getDirector() == null){
                System.out.println("worker must have director");
                return false;
            }
            if (!((Worker) employee).getDepartment().getName().equals
                    (((Worker) employee).getDirector().getDepartment().getName())){
                System.out.println("worker department and director's department must be same");
            }
        }else if (employee instanceof Director){
            if (((Director) employee).getManager() == null){
                System.out.println("director must have manager");
                return false;
            }
            if (!((Director) employee).getDepartment().getName().equals
                    (((Director) employee).getManager().getDepartment().getName())){
                System.out.println("director department and manager's department must be same");
            }
        }
        validateEmployeeInformation((Employee) employee);
        employeeList.add(employee);
        return true;
    }

    public boolean addDepartment(S department){
        validateDepartmentInformation((Department) department);
        departmentList.add(department);
        return true;
    }

    public boolean validateDepartmentInformation(Department department){
        if (department.getName() == null){
            System.out.println("Department name can not be null");
            return false;
        }
        if (department.getCode() == null){
            System.out.println("Department code can not be null");
            return false;
        }
        return true;
    }

    private boolean validateEmployeeInformation(Employee employee){
        if (employee.getDepartment() == null){
            System.out.println("Department can not be null");
            return false;
        }

        //todo check variables is not null and suitable

        /*

        if (employee.getName() == null){
            System.out.println("Name can not be null");
            return false;
        }
        if (employee.getSurName() == null){
            System.out.println("Surname can not be null");
            return false;
        }
        if (employee.getWorkingType() == null){
            System.out.println("working type can not be null");
            return false;
        }
         */
        return true;
    }
}
