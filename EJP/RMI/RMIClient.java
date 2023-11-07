import java.rmi.Naming;

public class RMIClient {
    public static void main(String [] args){
        try{
            RMIInterface remobj = (RMIInterface) Naming.lookup("rmi://localhost/MyRemoteObject");
            System.out.println(remobj.add(10, 20));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
