package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Label lblMes;

    @FXML
    void login(ActionEvent event) throws IOException {
        String uName = username.getText();
        String pWord = password.getText();
        if(uName.equals("root") && pWord.equals("1234")){
            Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/View/QuanLyNhanKhauUI.fxml")));
            Stage mainStage = new Stage();
            mainStage.setTitle("Dashboard");
            mainStage.setScene(new Scene(root));
            mainStage.setResizable(true);
            loginStage.close();
            mainStage.show();
        } else {
            lblMes.setText("Username or Password is incorrect!");
        }
    }
}
