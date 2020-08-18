/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NoteWriterUI extends Application {

    public TextArea lectTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    public void upload(ActionEvent actionEvent) throws RemoteException, NotBoundException, MalformedURLException {
        NoteController noteController=(NoteController) Naming.lookup("rmi://localhost:5050/NoteServer");
        noteController.setNote(lectTextArea.getText());
    }
}
