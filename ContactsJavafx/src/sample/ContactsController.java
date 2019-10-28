package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import java.awt.print.Book;
import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class ContactsController {

    @FXML
    private ListView<ContactsInfo> ContactsListView;

    @FXML
    private ImageView PhotoImageView;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField SurnameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField PhoneNumberTextField;

    @FXML
    private TextField AgeTextField;

    private final ObservableList<ContactsInfo> contacts = FXCollections.observableArrayList();


    public void initialize() {
        contacts.add(new ContactsInfo("Shawn", "Mendes",21,
                "sample/avatars/shawn-mendes.jpg", "shawnmendes@gmail.com",
                "+996222222222"));
        contacts.add(new ContactsInfo("Camila", "Cabello",22,
                "sample/avatars/camila1.jpg", "camilacabello@gmail.com",
                "+996333333333"));
        contacts.add(new ContactsInfo("Ariana", "Grande",26,
                "sample/avatars/ariana.jpeg", "arianagrande@gmail.com",
                "+996444444444"));
        contacts.add(new ContactsInfo("Taylor", "Swift",29,
                "sample/avatars/taylor.jpg", "taylorswift@gmail.com",
                "+996555555555"));



        ContactsListView.setItems(contacts.sorted());

        ContactsListView.getSelectionModel().selectedItemProperty().
                addListener(
                        new ChangeListener<ContactsInfo>() {
                            @Override
                            public void changed(ObservableValue<? extends ContactsInfo> observable, ContactsInfo oldValue, ContactsInfo newValue) {
                                PhotoImageView.setImage(
                                        new Image(newValue.getPhoto())
                                );
                                NameTextField.setText(newValue.getName());
                                SurnameTextField.setText(newValue.getSurname());
                                EmailTextField.setText(newValue.getEmail());
                                PhoneNumberTextField.setText(newValue.getPhoneNumber());
                                AgeTextField.setText(String.valueOf(newValue.getAge()));
                            }
                        }
                );

        ContactsListView.setCellFactory(
                new Callback<ListView<ContactsInfo>, ListCell<ContactsInfo>>() {
                    @Override
                    public ListCell<ContactsInfo> call(ListView<ContactsInfo> listView) {
                        return new ImageTextCell();
                    }
                }
        );
    }

}