package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML public TextArea textArea;

    @FXML public TextField textField;
    public Button closeButton;

    public void clickBtn1(ActionEvent actionEvent) {
        if (!textField.getText().equals("")) { //когда пусто, не отправляет сообщение в чат
            textArea.appendText("Me:\n- " + textField.getText() + "\n\n");
            textField.requestFocus();
            textField.clear();
        }
    }

    public void enter(ActionEvent actionEvent) {
        if (!textField.getText().equals("")) {
            textArea.appendText("Me:\n- " + textField.getText() + "\n\n");
            textField.requestFocus();
            textField.clear();
        }
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(()->{
            Stage stage =(Stage) closeButton.getScene().getWindow();
            stage.close();
        });
    }
}
