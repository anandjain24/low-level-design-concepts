package oops.SOLID.singleResponsibilityPrinciple.after;

import oops.SOLID.singleResponsibilityPrinciple.after.Employee;
import oops.SOLID.singleResponsibilityPrinciple.after.EmployeeRepository;

import java.util.List;

public class SaveEmployeesMain {

    public static void main(String[] arg){
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();
        // Save employees
        for(Employee e : employees){
            e.save();
        }
    }
}
