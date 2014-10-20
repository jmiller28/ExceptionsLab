package lab2;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    public static final int MAX_LENGTH = 2;
    public static final int ZERO = 0;
    public static final String SPLIT_VALUE = " ";
    public static final String ERROR_NAME_MESSAGGE = "Please try again. Enter first and last names with a space between.";
    public static final String ERROR_BLANK_MESSAGGE = "Please try again. Your full name cannot be blank.";

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {

        String lastName = "";
        if (fullName.length() > ZERO) {
            String[] nameParts = fullName.split(SPLIT_VALUE);
            if (nameParts.length == MAX_LENGTH) {
                lastName = nameParts[nameParts.length - LAST_NAME_IDX];
            } else {
                throw new IllegalArgumentException(ERROR_NAME_MESSAGGE);
            }
        } else {
            throw new IllegalArgumentException(ERROR_BLANK_MESSAGGE);
        }
        return lastName;

    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws IllegalArgumentException {

        String firstName = "";
        if (fullName.length() > ZERO) {
            String[] nameParts = fullName.split(SPLIT_VALUE);
            if (nameParts.length == MAX_LENGTH) {
                firstName = nameParts[FIRST_NAME_IDX];
            } else {
                throw new IllegalArgumentException(ERROR_NAME_MESSAGGE);
            }
        } else {
            throw new IllegalArgumentException(ERROR_BLANK_MESSAGGE);
        }
        return firstName;

    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }

}
