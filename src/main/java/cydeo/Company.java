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
public class Company{
  // todo fix generic types of company class
    private List<T> employeeList;
    private List<S> departmentList;

    public boolean addEmployee(T employee){
        //todo check director and manager department is same if class type is worker
        //todo check manager department is same if class type is director
        if (employee instanceof Worker){
           //todo check worker director is present
        }else if (employee instanceof Director){
            //todo check director manager is present
        }
        validateEmployeeInformation(employee);
        employeeList.add(employee);
        return true;
    }

    public boolean addDepartment(S department){
        validateDepartmentInformation((Department) department);
        departmentList.add(department);
        return true;
    }

    public boolean validateDepartmentInformation(Department department){
        //todo check variables is not null and suitable
        // name , code
        return true;
    }

    private boolean validateEmployeeInformation(Employee employee){
        if (employee.getDepartment() == null){
            System.out.println("Department can not be null");
            return false;
        }
        //todo check rest of variables is not null and suitable
        // name, surName, department, workingType, shift
        return true;
    }
}
