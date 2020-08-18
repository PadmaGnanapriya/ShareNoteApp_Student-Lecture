import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class NoteControllerImpl extends UnicastRemoteObject implements NoteController{
    String note="Empty";

    public NoteControllerImpl() throws RemoteException{}
    @Override
    public void setNote(String note) throws RemoteException {
        this.note=note;
    }

    @Override
    public String getNote() throws RemoteException {
        return note;
    }
}
