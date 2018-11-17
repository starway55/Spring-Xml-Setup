package yunprac.com.example.springPrac.MainApplication;

import org.springframework.context.annotation.Bean;

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
