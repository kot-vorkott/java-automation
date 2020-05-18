import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        String[] channels = {"Первый канат", "ТНТ", "Jetix", "2x2", "СТС"};
        boolean doExit = false;
        System.out.println("Введите номер канала от 1 до 5, 6 - выключить телевизор. Не вводите что-то кроме цифр - пульт сломается");

        Scanner scanner = new Scanner(System.in);
        while (!doExit) {
            int channelNumber = scanner.nextInt();
            if (channelNumber == 6){
                doExit = true;
                System.out.println("Выключение");
            }
            else if (channelNumber > 0 && channelNumber < 6)
                System.out.println("Переключаем на канал " + channels[channelNumber - 1]);
            else System.out.println("Введите номер канала от 1 до 5, 6 - выключить телевизор");

        }
    }
}
