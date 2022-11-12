import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pi();
    }

    public static void pi(){
        ArrayList<String> pp = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите Фамилию");
        String su = in.nextLine();
        System.out.println("Введите Имя");
        String na = in.nextLine();
        System.out.println("Введите Отчество");
        String ot = in.nextLine();
        System.out.println("Введите Дату рождения в формате дд.мм.гггг");
        String bi = in.nextLine();
        System.out.println("Введите пол");
        String po = in.next();
        System.out.println("Продолжите свой номер телефона без +79");
        if(in.hasNextInt()){
            Integer num = in.nextInt();
            pp.add(num.toString());
            pp.add(su);
            pp.add(na);
            pp.add(ot);
            pp.add(bi);
            pp.add(po);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        for(String s : pp){
            if(s.isEmpty()){
                System.out.println("Строка не заполнена");
            } else {
                System.out.println(s);
            }
        }
        try (FileWriter writer = new FileWriter(su, false))
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

