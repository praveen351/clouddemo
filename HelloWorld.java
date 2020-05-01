import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld{
  public static void main(String[] args){
    try {
            FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream, "UTF-16");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("Thing is runnung fine");
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
}
