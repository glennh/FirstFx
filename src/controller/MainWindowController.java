package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Person;

public class MainWindowController {

	@FXML
	private TableView<Person> tableView;
	@FXML
	private TableColumn<Person, String> firstNameColumn;
	@FXML
	private TableColumn<Person, String> lastNameColumn;
	@FXML
	private TableColumn<Person, String> ageColumn;

	private ObservableList<Person> personList = FXCollections.observableArrayList();

	private Main main;
	private Stage primaryStage;

	public void initialize() {
		firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
	}

	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.primaryStage = primaryStage;
		setTableData();
		tableView.setItems(personList);
	}

	public void setTableData() {
		personList.add(new Person("Andy", "A", "11"));
		personList.add(new Person("John", "B", "22"));
		personList.add(new Person("Mary", "C", "33"));
		personList.add(new Person("Bill", "D", "44"));
		personList.add(new Person("Steve", "E", "55"));
		personList.add(new Person("Gary", "F", "66"));
		personList.add(new Person("Fred", "G", "77"));
		personList.add(new Person("Jay", "H", "88"));
		personList.add(new Person("Clare", "I", "99"));
	}

	public void closeWindow() {
		this.primaryStage.close();
	}

}
