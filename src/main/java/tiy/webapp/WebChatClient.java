package tiy.webapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.PublicKey;

/**
 * Created by Justins PC on 5/3/2016.
 */
public class WebChatClient {
    public static Socket clientSocket;
    public static String userInputFromPage;

    String userText;
    public static String sendMessage(String InputFromHtml) {
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("================(Swag)================");
        System.out.println("===============================================");
        System.out.println("===============================================");

    try {
        clientSocket = new Socket("", 8005);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);//sends input from client to server
        String sendInputTest = " :client sending input to server";
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); //sends input into the server
        System.out.println("what was sent to server: " + in.toString() + sendInputTest); //prints out what we sent to the server
        System.out.println(InputFromHtml);
        out.println(InputFromHtml); //input from server
        String serverResponse;
        while ((serverResponse = in.readLine()) !=null) {
            System.out.println(serverResponse);
            if (serverResponse.isEmpty()) {
                break;
            }
        }
    }catch (IOException e) {

    }

        return InputFromHtml;
    }

}
