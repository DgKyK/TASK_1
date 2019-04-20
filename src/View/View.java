package View;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static String MESSAGES_BUNDLE_NAME = "info";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("uk", "UA"));

    public void printMessage(String message){
        System.out.println(message);
    }

    public String stringConcat(String...v){
        StringBuilder resultString = new StringBuilder();
        for(String currentString : v){
            resultString.append(currentString);
        }
        return new String(resultString);
    }

}
