import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            try (ServerSocket serverSocket = new ServerSocket(8888)) {
                System.out.println("Server is listening on port 8888");

                while (true) {
                    Socket socket = serverSocket.accept();
                    System.out.println("New client connected");

                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                    String message = in.readLine();
                    System.out.println("Received message from client: " + message);

                    int count = countLetters(message);
                    out.println(count);
                    System.out.println("Sent count back to client: " + count);

                    socket.close();
                }
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static int countLetters(String message) {
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (Character.isLetter(message.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}