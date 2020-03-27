package ba.unsa.etf.rs.tut4;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

public class Controller {
    public ChoiceBox choice;
    public TextArea textarea1;
    public TextArea textarea2;
    public Button dugme;


    public void ispisi(){
        String input = textarea1.getText();

        textarea2.appendText(input);

    }

}
