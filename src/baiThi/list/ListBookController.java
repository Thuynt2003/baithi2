package baiThi.list;

import baiThi.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static database.Roostage.rootStage;

public class ListBookController {

    public TableView<Book> tb;
    public TableColumn<Book,String> clid;
    public TableColumn<Book,String> clname;
    public TableColumn<Book,String> clAuthor;
    public TableColumn<Book,String> clPrice;
    private ObservableList<Book> ls = FXCollections.observableArrayList();
    public void initialize(URL location, ResourceBundle resources) {
        clid.setCellValueFactory(new PropertyValueFactory<>("cusName"));
        clname.setCellValueFactory(new PropertyValueFactory<>("tel"));
        clAuthor.setCellValueFactory(new PropertyValueFactory<>("email"));
        clPrice.setCellValueFactory(new PropertyValueFactory<>("gl"));
    }
    public void add(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("../add/addBookRecords.fxml"));
        Scene sc = new Scene(listScene,1280,800);
        rootStage.setTitle("ADDBook");
        rootStage.setScene(sc);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        Parent listScene = FXMLLoader.load(getClass().getResource("/baiThi/home/home.fxml"));
        Scene sc = new Scene(listScene,1280,800);
        rootStage.setTitle("ADDBook");
        rootStage.setScene(sc);

    }
}
