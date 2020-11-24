package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private TextField textfield;

    @FXML
    private void helloWorld() {
        System.out.println("Hello World!");
    }

    @FXML
    private void labelTest() {
        label.setText("Hello World!");
    }

    @FXML
    private void textFieldTest() {
        String input = textfield.getText();
        if (! input.equals("")) {
            label.setText(input);
        } else {
            label.setText("SKRIV HER");
        }
    }
}
