import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class Server_Start {
    public static void main(String[] args) {
        try {
            Registry noteRegistry= LocateRegistry.createRegistry(5050);
            System.out.println("Server is starting");
            noteRegistry.rebind("NoteServer",new NoteControllerImpl());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
