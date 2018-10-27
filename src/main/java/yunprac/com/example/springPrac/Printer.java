package yunprac.com.example.springPrac;

/**
 * Created by yunzhao on 27/10/18.
 */
public class Printer {

    private String message;

    public void printMessage(){

        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
