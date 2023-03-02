package PrintAndCount.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class StringClient {
    public static void main(String[] args) throws Exception {
        RemoteBuffer rb = (RemoteBuffer) Naming.lookup("rmi://localhost:1000/MyBuffer");

        String message = "Hello World!";
        int count = rb.printAndCountLetters(message);
        System.out.println("Number of letters received from server: " + count);
    }
}
