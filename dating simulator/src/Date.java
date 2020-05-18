import java.util.*;

public class Date {
    public static void main(String[] args) {
        System.out.println("Привет, как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Приятно познакомиться, " + name + "." + " Хочешь сходить в кино?");
        //System.out.println("1) Да");
        //System.out.println("2) Нет");
        //String cinema = scanner.nextLine();


        boolean answerAccepted;

      do {

           System.out.println("1) Да");
           System.out.println("2) Нет");
           String cinema = scanner.nextLine();

           if (cinema.equals("Да")) {
               System.out.println("Олично, тогда пошли в кино, " + name + "!");
               answerAccepted = true;
           } else if (cinema.equals("Нет")) {
               System.out.println("Бууука! Тогда я приглашу кого-нибудь еще.");
               answerAccepted = true;
           } else {
               System.out.println("Извини, я не понял. Попробуй еще раз!");
               answerAccepted = false;
           }
      }
      while (answerAccepted == false);


    }
}
