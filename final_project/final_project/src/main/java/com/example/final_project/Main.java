package com.example.final_project;

//Necessary classes imported to run and create the table
    import javafx.application.Application;
    import javafx.geometry.Insets;
    import javafx.scene.Group;
    import javafx.scene.Scene;
    import javafx.scene.control.Label;
    import javafx.scene.control.TableColumn;
    import javafx.scene.control.TableView;
    import javafx.scene.control.cell.PropertyValueFactory;
    import javafx.scene.layout.VBox;
    import javafx.scene.text.Font;
    import javafx.stage.Stage;


public class Main extends Application {

    private TableView table = new TableView();
    private ContactManager cm = new ContactManager(10);
    public static void main(String[] args) {
        launch(args);
    }

    //init method used to carry out the operations
    public void init() {
        cm.add("Simon", "Cowell","8888888","100",new Address("123 Street", "none", "Toronto", "M4J3E1", "Ontario", "Canada"), "simon@simon.com", "Notes Here", new MyDate(24,07,1997));
        cm.add("Salman", "Khan","123","321",new Address("123 Street", "none", "Toronto", "M4J3E1", "Montreal", "Canada"), "fatih@fatih.com", "Notes Here", new MyDate(19,11,1997));
        cm.add("Drake","Graham","999999999","10010101",new Address("Queen STR","none","California","QWERTY","Orange County","USA"),"drake@singr.com","Singer",new MyDate(24,11,1986));
        cm.add("Justin","Biber","111111111","100",new Address("HighWay sTR","unknown","Miami","QWERTY122","LA","USA"),"justin@biber.com","Dancer",new MyDate(24,11,1986));
//        cm.findContact("Simon","Drake");
//        cm.viewAllContacts();
        //cm.add("Dimitri","Vegas","9999","10001",new Address("King STR"," ","Schipol","1117BC","Holland","Amsterdam"),"dimirti@singer.com","DJ",new MyDate(01,01,1990));
        cm.add("Like","Mike","100","999",new Address("King ","St ","Warsaw","1187BC","Poland","Amsterdam"),"likemike@singer.com","DJ Brother",new MyDate(05,02,1991));
        cm.add("Dimitri","Vegas","9999","10001",new Address("King STR"," ","Schipol","1117BC","Holland","Amsterdam"),"dimirti@singer.com","DJ",new MyDate(01,01,1990));
        cm.delete("Like","Mike");
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Assignment 2");
        stage.setWidth(1000);
        stage.setHeight(800);

        final Label label = new Label("Address Book");
        label.setFont(new Font("Helvetica ", 25));

        table.setEditable(true);

        //table created to store the values
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn phoneCol = new TableColumn("Phone");
        TableColumn homePhoneCol = new TableColumn("Home");
        homePhoneCol.setCellValueFactory(new PropertyValueFactory<>("homePhone"));

        TableColumn workPhoneCol = new TableColumn("Work");
        workPhoneCol.setCellValueFactory(new PropertyValueFactory<>("workPhone"));
        phoneCol.getColumns().addAll(homePhoneCol, workPhoneCol);

        TableColumn homeAddressCol = new TableColumn("Home Address");
        homeAddressCol.setCellValueFactory(new PropertyValueFactory<>("address"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn birthdayCol = new TableColumn("Birthday");
        birthdayCol.setCellValueFactory(new PropertyValueFactory<>("birthday"));

        TableColumn notesCol = new TableColumn("Notes");
        notesCol.setCellValueFactory(new PropertyValueFactory<>("notes"));


        table.getColumns().addAll(firstNameCol, lastNameCol, phoneCol, homeAddressCol, emailCol, birthdayCol, notesCol);

        Contact[] contacts = cm.allContacts();

        for (Contact c : contacts) {
            table.getItems().add(c);
        }

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(5, 0, 0, 5));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
}