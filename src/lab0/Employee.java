package lab0;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_SSN_LENGTH = 9;
    public static final int MAX_SSN_LENGTH = 11;
    public static final String SSN_ERROR_MESSAGGE = "Please re-enter your 9 digit Social Security Number.";
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {

        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        int j = 0;
        StringBuilder ssnWithoutDashes = new StringBuilder();

        if (ssn == null || ssn.length() < MIN_SSN_LENGTH || ssn.length() > MAX_SSN_LENGTH) {
            JOptionPane.showMessageDialog(null, SSN_ERROR_MESSAGGE);
        } else {
            String[] ssnParts = ssn.split("-");
            for (String ssnPart : ssnParts) {
                j += ssnPart.length();
            }
            if (j != MIN_SSN_LENGTH) {
                JOptionPane.showMessageDialog(null, SSN_ERROR_MESSAGGE);
            } else {
                for (String ssnPart : ssnParts) {
                    ssnWithoutDashes.append(ssnPart);
                }
                ssnWithoutDashes.toString();
                char[] ssnFinal = new char[MIN_SSN_LENGTH];
                for (int i = 0; i < ssnWithoutDashes.length(); i++) {
                    ssnFinal[i] = ssnWithoutDashes.charAt(i);
                }
                boolean isValid = false;
                for (int i = 0; i < ssnFinal.length; i++) {
                    if (Character.isDigit(ssnFinal[i])) {
                        isValid = true;
                    } else {
                        isValid = false;
                        JOptionPane.showMessageDialog(null, SSN_ERROR_MESSAGGE);
                        break;
                    }
                }
            }
        }
    }
}
