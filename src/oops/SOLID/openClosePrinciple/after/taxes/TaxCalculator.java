package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.after.employees.PartTimeEmployee;

public class TaxCalculator {
    private final static int INCOME_TAX_PERCENTAGE = 20;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 3;


    public static double calculate(Employee employee){
        if(employee.getClass()== FullTimeEmployee.class){
            FullTimeEmployeeTax fTime = new FullTimeEmployeeTax();
            return fTime.calculateTax(employee);
        }
        else if (employee.getClass() == PartTimeEmployee.class){
            PartTimeEmployeeTax pTime = new PartTimeEmployeeTax();
            return pTime.calculateTax(employee);
        }
        else{
            InternsTax iTax = new InternsTax();
            return iTax.calculateTax(employee);
        }
    }
}