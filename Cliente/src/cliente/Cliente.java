
package cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {

    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        try {
            Socket clientSocket = new Socket("localhost", 1234);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
     }
        System.out.println("Conexão realizada com sucesso!");
    }
}
