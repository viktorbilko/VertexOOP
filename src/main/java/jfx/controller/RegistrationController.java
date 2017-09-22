package jfx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author Viktor Bilko on 21.09.2017.
 */
public class RegistrationController implements Initializable {

    List <String> list = new LinkedList<>();

    @FXML
    private CheckBox checkLicence;
    @FXML
    private DatePicker date;
    @FXML
    private TextField txtname;
    @FXML
    private TextField txtsurname;
    @FXML
    private TextArea text;
    @FXML
    private Button btnSave;
    @FXML
    public Button btnPrint;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnSave.setOnAction(event -> save());


        btnPrint.setOnAction(event -> System.out.println(list));

    }

    private void save(){
        if (checkLicence.isSelected()) {
            list.add(txtname.getText());
            list.add(date.getValue().toString());
            list.add(text.getText());
        } else {
            System.out.println("Not");
        }

    }
}
