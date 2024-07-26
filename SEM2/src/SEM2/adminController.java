package SEM2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class adminController {
    @FXML
    private Button nextWindow;

    @FXML
    private void switchToNextWindow(ActionEvent e) throws Exception {
        Main.setRoot("test");
    }
}
