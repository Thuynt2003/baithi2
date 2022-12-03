package baiThi.home;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static database.Roostage.rootStage;

public class HomeController {

    public void addBook(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("../add/addBookRecords.fxml"));
        Scene sc = new Scene(listScene,1280,800);
        rootStage.setTitle("ADDBook");
        rootStage.setScene(sc);

    }

    public void listBook(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/listBookRecords.fxml"));
        Scene sc = new Scene(listScene,1280,800);
        rootStage.setTitle("ADDBook");
        rootStage.setScene(sc);
    }
}
