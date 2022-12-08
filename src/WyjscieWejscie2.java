import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WyjscieWejscie2 {
    public static void main(String[] args) {
        int bajt;

        try(FileInputStream fis = new FileInputStream("Y:\\OneDrive\\Pulpit\\plik.txt"))
        {
            do{
                bajt=fis.read();
                if(bajt!=-1) System.out.println((char)bajt);
            }while(bajt != -1);
        }catch (IOException e)
        {
            System.out.println("Błąd odczytu pliku");
            return;
        }

    }
}
