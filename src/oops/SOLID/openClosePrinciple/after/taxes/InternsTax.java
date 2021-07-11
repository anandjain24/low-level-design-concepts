package oops.SOLID.openClosePrinciple.after.taxes;

import oops.SOLID.openClosePrinciple.after.employees.Employee;

public class InternsTax {
    private final static int INCOME_TAX_PERCENTAGE = 15;
    private final static  int LOWER_LIMIT_TAX = 15000;

    public static double calculateTax(Employee employee) {
        int annualIncome = employee.getAnnualIncome();

        if(annualIncome > LOWER_LIMIT_TAX)
            return ((employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100);
        else
            return 0;
    }

}
