import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class Server {
    public static void main(String [] args){
        try {

            Inter obj = new Imp();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("SomeName", obj);

            System.out.println("Server is running....");

            
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
