public class StringChange {
    public static void main(String[] args) {
        String str1 = "Я строка номер 1";
        String str2 = "Я строка номер 2";
        String str3 = "";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("Длина строки 1 = " + str1.length());
        System.out.println("Соединение строки 1 и строки 2 конкатенацией = " + str1.concat(" " + str2));
        System.out.println("Равны ли строки 1 и 2? " + str1.equals(str2));
        System.out.println("Узнаем на каком месте находится символ 'н': " + str1.indexOf('н'));
        System.out.println("Узнаем пустая ли строка 3: "+ str3.isEmpty());
        System.out.println("Выведем строку 1 заглавными буквами: " + str1.toUpperCase());
        System.out.println("Выведем строку 2 строчными буквами: " + str2.toLowerCase());
        System.out.println("Что находится на индексе 3 в строке 2: " + str2.charAt(3));
        System.out.println("Выведем подстроку строки 1 (cтрока): " + str1.substring(2, 8));
        System.out.println("Заменим часть одной строки на другую (строка на string): " + str1.replace("строка", "string") );
        System.out.println("Узнаем, начинается ли наша строка с Я строка: " + str1.startsWith("Я строка"));
        System.out.println("Узнаем, заканчивается ли наша строка словами Я строка: " + str1.endsWith("Я строка"));
        System.out.println("Узнаем содержит ли наша строка символ '!': " + str1.contains("!"));
        System.out.println("Наверно есть еще методы но я усталь");
    }
}
