import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class NoteViewerUI {
    public TextArea studentTextArea;

    public void reloadingButton(ActionEvent actionEvent) throws RemoteException, NotBoundException, MalformedURLException {
        NoteController noteController= (NoteController) Naming.lookup("rmi://localhost:5050/NoteServer");
        studentTextArea.setText(noteController.getNote());

    }
}
