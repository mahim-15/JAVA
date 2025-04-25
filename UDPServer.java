
import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String args[]) {
        DatagramSocket aSocket = null;
        try {
            int serverPort = 1484; 
            aSocket = new DatagramSocket(serverPort);
            byte[] buffer = new byte[1000];

            System.out.println("UDP Server is running on port " + serverPort + "...");

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);

                
                String receivedMessage = new String(request.getData(), 0, request.getLength());
                System.out.println("Received: " + receivedMessage);

                
                String replyMessage = "Server received: " + receivedMessage;
                byte[] replyData = replyMessage.getBytes();

                DatagramPacket reply = new DatagramPacket(
                        replyData, replyData.length,
                        request.getAddress(), request.getPort());
                aSocket.send(reply);
            }
        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } finally {
            if (aSocket != null)
                aSocket.close();
        }
    }
}