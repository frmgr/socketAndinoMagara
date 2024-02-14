// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.net.*;
import java.io.*;
public class Server {
  public static void main(String[] args) throws IOException{
    
    int port = 12345;
    ServerSocket serverSocket = new ServerSocket(port);
    System.out.println("Server in ascolto sulla porta " + port);
    try{
      while(true)
        {
          Socket client = serverSocket.accept();
          PrintWriter out = new PrintWriter(client.getOutputStream(), true);
          out.println("Ciao client!");
          client.close();
        }
    }

    catch(IOException e)
      {
        System.out.println("Errore: " + e.getMessage());
      }

    finally {
      serverSocket.close();
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}