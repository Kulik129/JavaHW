import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pp = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО");
        String name = in.nextLine();
        System.out.println("Введите дату рождения в формате дд.мм.гггг");
        String date = in.nextLine();
        System.out.println("Введите пол");
        String gender = in.nextLine();
        try {
            System.out.println("Введите номер телефона без +79");
            Integer numbers = in.nextInt();
            System.out.println();
            pp.add(name);
            pp.add(date);
            pp.add(gender);
            pp.add(numbers.toString());
        } catch (InputMismatchException e){
            System.out.println("Это не число");
        }
        for (String s : pp){
            boolean a = s.isEmpty();
            if(a == true){
                System.out.println("Одна из строк пуста");
            }else {
                try (FileWriter writer = new FileWriter(name+".txt", false))
                {
                    ArrayList<String> text = pp;
                    writer.write(String.valueOf(text));
                    writer.append('\n');
                    writer.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}