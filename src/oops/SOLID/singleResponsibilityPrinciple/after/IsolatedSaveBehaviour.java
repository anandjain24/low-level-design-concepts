package oops.SOLID.singleResponsibilityPrinciple.after;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsolatedSaveBehaviour {

   public void save(Employee e){
       try {
           Employee employee =e;
           StringBuilder sb = new StringBuilder();
           sb.append("### EMPLOYEE RECORD ####");
           sb.append(System.lineSeparator());
           sb.append("NAME: ");
           sb.append(employee.getFirstName() + " " + employee.getLastName());
           sb.append(System.lineSeparator());
           sb.append("POSITION: ");
           sb.append(employee.getClass().getTypeName());
           sb.append(System.lineSeparator());
           sb.append("EMAIL: ");
           sb.append(employee.getEmail());
           sb.append(System.lineSeparator());
           sb.append("MONTHLY WAGE: ");
           sb.append(employee.getMonthlyIncome());
           sb.append(System.lineSeparator());

           Path path = Paths.get(employee.getFullName()
                   .replace(" ","_") + ".rec");
           Files.write(path, sb.toString().getBytes());

           System.out.println("Saved employee " + employee.toString());
       } catch (IOException ex){
           System.out.println("ERROR: Could not save employee. " + ex);
       }
   }
}
