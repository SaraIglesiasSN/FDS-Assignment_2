package PrintAndCount.RMIAtLeastOnce;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.concurrent.TimeUnit;

public class StringClient {
    public static void main(String[] args) throws Exception {
        boolean executedSuccesfully = false;
        while (executedSuccesfully == false) {
            try {
                RemoteBuffer rb = (RemoteBuffer) Naming.lookup("rmi://localhost:1099/MyBuffer");

                String message = "Hello World!";
                int count = rb.printAndCountLetters(message);
                System.out.println("Number of letters received from server: " + count);
                executedSuccesfully = true;
            } catch(RemoteException e) {
                System.out.println("RemoteException: " + e.getMessage());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        }
        
    }
}
