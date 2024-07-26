package SEM2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class testController {
    @FXML
    private Button Back;

    @FXML
    private void switchBack(ActionEvent e) throws Exception {
        Main.setRoot("admin");
    }
}
