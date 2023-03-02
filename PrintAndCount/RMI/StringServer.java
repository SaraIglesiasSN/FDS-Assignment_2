package PrintAndCount.RMI;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServer extends UnicastRemoteObject implements RemoteBuffer {
    private StringBuffer buffer;

    public StringServer(String s) throws RemoteException {
        super();
        this.buffer = new StringBuffer(s);
    }

    public int printAndCountLetters(String message) throws RemoteException {
        // Print the received message on the server's console
        System.out.println("Received message: " + message);

        // Count the number of letters in the message
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                count++;
            }
        }

        // Pass the count back to the client
        System.out.println("Number of letters: " + count);
        return count;
    }

    public static void main(String[] args) throws Exception {
        StringServer server = new StringServer("A");
        Naming.bind("rmi://localhost:1099/MyBuffer", server);
    }
}