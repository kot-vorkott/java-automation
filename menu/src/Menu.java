import java.util.Scanner;

public class Menu {

    public void writeMenu() {
        System.out.println("Наше меню: ");
        System.out.println("1) Курочка");
        System.out.println("2) Пицца");
        System.out.println("3) Шашлыки");
        System.out.println("4) Пепси");
        System.out.println("5) Чай");
        System.out.println("6) Показать весь заказ");
        System.out.println("7) Закрыть");
    }

    public static void main(String[] args) {
        System.out.println("Приветствуем вас в нашем ресторане! В период коронавируса все заказы принимает наш электронный бот");
        System.out.println("Чтобы заказать, просто введите номер блюда.");

        Menu orderInRestaurant = new Menu();
        int order = 0;
        while (order != 7) {
            orderInRestaurant.writeMenu();
            Scanner scanner = new Scanner(System.in);
            order = scanner.nextInt();

            switch (order) {
                case 1:
                    System.out.println("Вы заказали курочку");
                    break;
                case 2:
                    System.out.println("Вы заказали пиццу");
                    break;
                case 3:
                    System.out.println("Вы заказали шашлыки");
                    break;
                case 4:
                    System.out.println("Вы заказали пепси");
                    break;
                case 5:
                    System.out.println("Вы заказали чай");
                    break;
                case 6:
                    System.out.println("Ваш заказ:");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Я всего лишь бот, и понимаю только цифры из меню");
            }

        }
        System.out.println("Спасибо за заказ!");
    }
}