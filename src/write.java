import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        String su = "Test";
        String a = "File test";
        try(FileWriter writer = new FileWriter(su, false))
        {
            // запись всей строки
            String text = a;
            writer.write(text);
            // запись по символам
            writer.append('\n');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
