package concepts;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

    public static void main(String[] args) {
       try (ServerSocket server = new ServerSocket(34522)) {
           while (true) {
               try (
               Socket socket = server.accept();
               DataInputStream input = new DataInputStream(socket.getInputStream());
               DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {
                   System.out.println("new connection accepted");
                   for (int i = 0; i < 5; i++) {
                        String msg = input.readUTF();
                        System.out.println("Got this message from client" + msg);
                        output.writeUTF("Thanks for this message mf " + msg);
                   }
               }
           }
       } catch (IOException e) {
            e.printStackTrace();
       }
    }
}
