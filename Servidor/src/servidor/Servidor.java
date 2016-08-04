
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Servidor {

    
    public static void main(String[] args) {
        
        
        System.out.println("Esperando conexão na porta 1234");
        ServerSocket server = null;
        try {
            
            server = new ServerSocket(1234); // Prepara o servidor para receber conexoes na porta 1234
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Socket socket = server.accept(); //Interrompe a execução esperando um cliente
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Conexão realizada com sucesso!" );
           
       }     
}
