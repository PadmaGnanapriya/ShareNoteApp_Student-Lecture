import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public interface NoteController extends Remote {
    public void setNote(String note)throws RemoteException;
    public String getNote()throws RemoteException;
}
