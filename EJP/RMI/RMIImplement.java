import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIImplement extends UnicastRemoteObject implements RMIInterface {

    public RMIImplement() throws RemoteException {};

    public int add(int x, int y ) throws RemoteException {
        return (x+y);
    }
    
}