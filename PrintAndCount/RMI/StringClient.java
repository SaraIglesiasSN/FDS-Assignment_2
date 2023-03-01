package PrintAndCount.RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class StringClient {
    public static void main(String[] args) throws Exception {
        RemoteBuffer rb = (RemoteBuffer) Naming.lookup("rmi://localhost:1000/MyBuffer");

        String message = "Hello World!";
        rb.printAndCountLetters(message);
    }
}
