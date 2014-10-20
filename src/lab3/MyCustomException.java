package lab3;

/**
 *
 * @author jmiller
 */
public class MyCustomException extends Exception {

    public String msg = "";

    public MyCustomException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
