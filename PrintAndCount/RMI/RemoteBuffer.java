package PrintAndCount.RMI;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteBuffer extends Remote {
    int printAndCountLetters(String message) throws RemoteException;
}