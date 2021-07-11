package oops.SOLID.singleResponsibilityPrinciple.after;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String fullName, int monthlyIncome){
        super(fullName, monthlyIncome); // super is used to invoke the reuse of immediate parent class constructor
        this.setNbHoursPerWeek(40);
    }
}
