import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Imp extends UnicastRemoteObject implements Inter{

    public Imp() throws RemoteException {}

    public int add(int x, int y) throws RemoteException{
        return x+y;
    }
}
