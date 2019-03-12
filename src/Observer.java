import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Observer extends Remote {
    public void notifyObservers() throws RemoteException;
}
