import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WyjscieWejscie {
    public static void main(String[] args) {
        FileInputStream fis;
        int bajt;

        try{
            fis = new FileInputStream("Y:\\OneDrive\\Pulpit\\plik.txt");
        }catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku");
            return;
        }
        try{
            do{
                bajt=fis.read();
                if(bajt!=-1) System.out.println((char)bajt);
            }while(bajt != -1);
        }catch (IOException e)
        {
            System.out.println("Błąd odczytu pliku");
            return;
        }
        finally {
            try {
                    fis.close();
            }
            catch (IOException e)
            {
                System.out.println("Błąd podczas zamykania pliku");
            }
        }


    }
}
