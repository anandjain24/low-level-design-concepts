package oops.SOLID.singleResponsibilityPrinciple.after;

/*
Models an employee form a business perspective
 */
public class Employee {

    private String firstName;
    private String lastName;
    private int monthlyIncome;
    private int nbHoursPerWeek;

    public Employee(String fullName, int monthlyIncome){
        setMonthlyIncome(monthlyIncome);
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    public void setMonthlyIncome(int monthlyIncome){
        if(monthlyIncome < 0){
            throw new IllegalArgumentException("Income must be positive");
        }
        this.monthlyIncome = monthlyIncome;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public int getNbHoursPerWeek(){
        return nbHoursPerWeek;
    }

    public void setNbHoursPerWeek(int nbHoursPerWeek){
        if(nbHoursPerWeek < 0){
            throw new IllegalArgumentException("Hours per week must be positive");
        }
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.firstName + "." +
                this.lastName +
                "@globomanticshr.com";
    }
    /*
     * According to SRP, a class should have only one reason to get changed.
     * In the before structure, we have seen that Employee class has multiple reasons:
     * 1. Change in attributes
     * 2. Change in the format of the file (in the save function)
     * Thus we will be removing the save function outside the Employee class to follow the SR principle.
     */
    public void save() {
        IsolatedSaveBehaviour obj = new IsolatedSaveBehaviour();
        obj.save(this);
    }
}
