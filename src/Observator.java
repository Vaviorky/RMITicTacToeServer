import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Observator extends Remote {
    public void update() throws RemoteException;
}
