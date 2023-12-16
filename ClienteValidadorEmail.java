package ClientValidadorEmail;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteValidadorEmail {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("10.1.1.153", 5555);
        
        ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

        System.out.println("Digite o E-mail a ser validado:");
        Scanner scanner = new Scanner(System.in);

        String emailDigitado = scanner.nextLine();

        output.writeUTF(emailDigitado);
        output.flush();

    }
    
}
