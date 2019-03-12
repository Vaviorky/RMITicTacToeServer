import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class KKServer {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "security.policy");
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }

        try {
            System.out.println("Server startuje.. czekaj.");
            System.setProperty("java.rmi.server.hostname", "192.168.43.47");
            LocateRegistry.createRegistry(1099);
            GameInterface game = Game.getInstance();
            Naming.rebind("//192.168.43.47/Game", game);

            System.out.println("Server jest gotowy.");
        } catch (MalformedURLException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
