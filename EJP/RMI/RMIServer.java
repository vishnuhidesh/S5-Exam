import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    
    public static void main(String [] args){
        
        try{
            RMIInterface obj = new RMIImplement();
            LocateRegistry.createRegistry(1099);

            Naming.rebind("MyRemoteObject", obj);

            System.out.println("Server is running.......");


        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    
}
