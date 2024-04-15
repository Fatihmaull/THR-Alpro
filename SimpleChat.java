import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleChat {

    public static void main(String[] args) {
        Server server = new Server();
        Client client = new Client();

        Thread serverThread = new Thread(server);
        Thread clientThread = new Thread(client);

        serverThread.start();
        clientThread.start();
    }

    static class Server implements Runnable {
        @Override
        public void run() {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket clientSocket = serverSocket.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

                String message;
                while (true) {
                    message = in.readLine();
                    if (message.equalsIgnoreCase("bye")) {
                        break;
                    }
                    System.out.println("Client: " + message);

                    System.out.print("You: ");
                    message = consoleInput.readLine();
                    out.println(message);
                }

                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Client implements Runnable {
        @Override
        public void run() {
            try {
                Socket socket = new Socket("localhost", 5000);

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

                String message;
                while (true) {
                    System.out.print("You: ");
                    message = consoleInput.readLine();
                    out.println(message);
                    if (message.equalsIgnoreCase("bye")) {
                        break;
                    }

                    message = in.readLine();
                    System.out.println("Server: " + message);
                }

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
