import java.rmi.Naming;
public class Client {
    public static void main(String [] args){
        try {
            
            Inter remobj = (Inter) Naming.lookup("rmi://localhost/SomeName");
            
            System.out.println(remobj.add(50, 70));
            
        } catch (Exception e) {
            
            System.out.println(e);

        }
    }
}
