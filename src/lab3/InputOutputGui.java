package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {

    private NameService nameService;
    public static final String EMPTY_NAME_MESSAGGE = "Enter full name (use Format: first last):";
    public static String msg = "Your last name is: ";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {

        String fullName = JOptionPane.showInputDialog(EMPTY_NAME_MESSAGGE);
        try {
            String lastName = nameService.extractLastName(fullName);
            msg += lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (MyCustomException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
