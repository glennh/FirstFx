package controller;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import model.Person;

public class MainWindowController {

	@FXML
	private Label label;

	@FXML
	private TextField field;

	private Person person;

	private Main main;

	public void setMain(Main main) {
		this.main = main;
		this.person = new Person("Bob", "Manderly", "55");
	}

	public void handleButton() {
		String text = field.getText();
		label.setText(person.getFirstName());
		field.clear();
	}

	public void showAlert1() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Information header text");
		alert.setContentText("This is the information text");
		alert.showAndWait();
	}

	public void showAlert2() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Information");
		alert.setHeaderText("Information header text");
		alert.setContentText("This is the information text");
		alert.showAndWait();
	}

	public void showAlert3() {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Information");
		alert.setHeaderText("Information header text");
		alert.setContentText("This is the information text");
		alert.showAndWait();
	}

	public void showAlert4() {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Information");
		alert.setHeaderText("Information header text");
		alert.setContentText("This is the information text");
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			System.out.println("pressed ok");
		} else {
			System.out.println("pressed cancel");
		}
	}

	public void showAlert5() {
		TextInputDialog dialog = new TextInputDialog();
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) {
			System.out.println(result.get());
		}

	}

}
