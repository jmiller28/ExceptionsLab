package lab0;

import java.util.Date;

/**
 *
 * @author Instlogin
 */
public class Startup {
    private String lastName;
    private String firstName;
    private static Date hireDate;
    private int vacationDays;
    private String ssn;
    private boolean b;
    

    
    public static void main(String[] args) {
        Startup start = new Startup();

        Employee emp = new Employee(
            "Jim",
            "Smith",
            "123-45-6789",
            start.hireDate,
            start.vacationDays);
         
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
        System.out.println(fullNameInCaps + "  " + hireDate);
    }
}
