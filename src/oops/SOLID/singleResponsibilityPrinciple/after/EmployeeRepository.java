package oops.SOLID.singleResponsibilityPrinciple.after;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll(){
        // Employees are hardcoded here from simplicity
        Employee anna = new FullTimeEmployee("Anna DeVries", 50);
        Employee ramesh = new FullTimeEmployee("Ramesh Jain", 60);

        Employee john = new PartTimeEmployee("John Doe", 20) ;
        Employee jessica = new PartTimeEmployee("Jessica Hepburn", 25);

        return Arrays.asList(anna, ramesh, john, jessica);
    }
}
