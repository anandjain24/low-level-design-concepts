package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class FullTimeEmployeeTax {
    private final static int INCOME_TAX_PERCENTAGE = 30;
    private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final static int CESS_TAX_PERCENTAGE = 1;


    public static double calculateTax(Employee employee){
        return ((employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE )/100) +
                ((employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE )/100) +
                ((employee.getMonthlyIncome() * CESS_TAX_PERCENTAGE )/100) ;
    }
}
