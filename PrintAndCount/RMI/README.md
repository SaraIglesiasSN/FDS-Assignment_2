
When the client executes the printAndCountLetters method on the server with the message "Hello World!", the server will print the message on its console and return the number of letters (10) back to the client. Note that the printAndCountLetters method passes the message as a parameter, as there is no need to pass the StringBuffer object between the client and the server, since parameters are passed by value, not by reference.
## Explanation
RemoteBuffer.java:

This file contains the definition of the RemoteBuffer interface. It extends the Remote interface and declares three methods: buffer(), append_R(), and append_S(), which can be invoked remotely. These methods throw RemoteException in case of any remote communication error.

StringServer.java:

This file contains the implementation of the RemoteBuffer interface. It extends the UnicastRemoteObject class, which provides a default implementation for the Remote interface. The StringServer class contains a private StringBuffer instance variable that stores the string to be processed. The class implements the buffer(), append_R(), and append_S() methods of the RemoteBuffer interface. In addition, it has a main method that creates an instance of the StringServer class and binds it to a name in the RMI registry.

StringClient.java:

This file contains the client code that invokes the remote methods on the StringServer object. It looks up the RemoteBuffer object in the RMI registry, and invokes the append_S() and append_R() methods of the RemoteBuffer interface.

In this file, you would implement the printAndCountLetters method which would be invoked by the server, and would print the string received on the server console, count the number of letters in it, and return the count to the client.

In summary, RemoteBuffer.java defines the interface for the remote methods, StringServer.java implements the methods of the interface and binds it to the RMI registry, and StringClient.java uses the RMI registry to look up the RemoteBuffer object and invoke its methods.


## Running each in a different terminal
bash: (from RMI directory)

javac RemoteBuffer.java StringServer.java StringClient.java

rmiregistry 1000

(from FDS-Assignment_2 directory)

new terminal:
java -cp . PrintAndCount.RMI.StringServer 1000

new terminal: 

java -cp . PrintAndCount.RMI.StringClient localhost 1000