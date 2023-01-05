package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdminController {

    @FXML
    void setAnimationWhenMouseEntered(MouseEvent event) {
        Button btnQuanLy = (Button) event.getSource();
        btnQuanLy.setStyle("-fx-background-color: #67A2D5");
    }

    @FXML
    void setAnimationWhenMouseExited(MouseEvent event) {
        Button btnQuanLy = (Button) event.getSource();
        btnQuanLy.setStyle("-fx-background-color: #143B63");
    }

    @FXML
    void switchScene(ActionEvent event) throws IOException {
        Button btnQuanLy = (Button) event.getSource();
        String viewPath = switch (btnQuanLy.getText()) {
            case "Quản lý cuộc họp" -> "/View/QuanLyCuocHopUI.fxml";
            case "Quản lý nhân khẩu" -> "/View/QuanLyNhanKhauUI.fxml";
            case "Quản lý hộ khẩu" -> "/View/QuanLyHoKhauUI.fxml";
            case "Quản lý khoản thu" -> "/View/QuanLyKhoanThuUI.fxml";
            case "Quản lý nộp tiền" -> "/View/QuanLyNopTienUI.fxml";
            case "Quản lý tài khoản" -> "/View/QuanLyTaiKhoanUI.fxml";
            case "Thống kê" -> "/View/ThongKeUI.fxml";
            default -> "";
        };
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(viewPath)));
        Stage mainStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        double width = mainStage.getScene().getWidth();
        double height = mainStage.getScene().getHeight();
        mainStage.setScene(new Scene(root, width, height));
        mainStage.show();
    }
}
