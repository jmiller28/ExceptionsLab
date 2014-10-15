package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    public static final int LAST_NAME_IDX = 1;
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 2;
    public static final String EMPTY_NAME_MESSAGGE = "Enter full name (use Format: first last):";
    public static final String SPLIT_VALUE = " ";

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        String fullName = JOptionPane.showInputDialog(EMPTY_NAME_MESSAGGE);
        String lastName = app.extractLastName(fullName);
        if (lastName.length() == MIN_LENGTH) {
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } else {
            lastName = app.extractLastName(fullName);
        }
    }

    public String extractLastName(String fullName) {
        String lastName = "";
        if (fullName != null) {
            String[] nameParts = fullName.split(SPLIT_VALUE);
            if (nameParts.length == MAX_LENGTH) {
                lastName = nameParts[nameParts.length - LAST_NAME_IDX];
            }
        }
        if (lastName.length() < MIN_LENGTH) {
            JOptionPane.showInputDialog(EMPTY_NAME_MESSAGGE);
        }
        return lastName;
    }
}
