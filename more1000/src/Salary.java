public class Salary {
    public static void main(String[] args) {
        int salary = 0;
        int month = 0;
        int totalSalary = 0;

        while (salary < 10000) {
            salary = salary + 1000;
            month = month + 1;
            totalSalary = totalSalary + salary;
            System.out.println("Сейчас месяц " + month + " и моя зарплата теперь:" + salary + " и всего я заработал " + totalSalary);
        }

        System.out.println("Я получаю в месяц 10000$");

        do {
            salary = salary + 1000;
            month = month + 1;
            totalSalary = totalSalary + salary;
            System.out.println("Сейчас месяц " + month + " и моя зарплата теперь:" + salary + " и всего я заработал " + totalSalary);
        } while (month<12);

        System.out.println("За год моя зарплата выросла до 12000$");

        for (int i = 0; i<=11; i++){
            salary = salary + 1000;
            month = month + 1;
            totalSalary = totalSalary + salary;
            System.out.println("Я работаю уже " + month + " месяцев" + " и моя зарплата теперь:" + salary + " и всего я заработал " + totalSalary);
        }
        System.out.println("За два года работы я заработал " + totalSalary);
    }
}
