import java.io.*;
public class WyjscieWejscie3 {
    public static void main(String[] args) {
        int bajt;

        try(FileInputStream fis = new FileInputStream("Y:\\OneDrive\\Pulpit\\plik.txt");
             FileOutputStream fis2 = new FileOutputStream("Y:\\OneDrive\\Pulpit\\plik2.txt"))
        {
            do{
                bajt=fis.read();
                if(bajt == 32) fis2.write(bajt+13);
                else if(bajt!=-1)
                {
                    System.out.println((char)bajt);
                    fis2.write(bajt);
                }
            }while(bajt != -1);
        }catch (IOException e)
        {
            System.out.println("Błąd odczytu pliku");
        }
    }
}
