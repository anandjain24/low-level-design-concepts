package oops.SOLID.openClosePrinciple.after.persistence;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

import java.util.Arrays;
import java.util.List;

public class persistence {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
}