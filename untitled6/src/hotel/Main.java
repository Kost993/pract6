package hotel;

public class Main {
    public static void main(String[] args) {

        Особа p1 = new Клієнт(1, "Іван", "0991234567", "ivan@example.com");
        Особа p2 = new Адміністратор(2, "Олег", "0981112233", 18000);
        Особа p3 = new Покоївка(3, "Наталія", "0979988776", 15000);

        Особа[] persons = { p1, p2, p3 };

        System.out.println("=== Демонстрація поліморфізму (Особа) ===");
        for (Особа os : persons) {
            os.показатиРоль();
            os.дія();
            os.перевіритиДані();
            System.out.println();
        }

        Транзакція t1 = new Оплата(101, 2500, "2025-01-10");

        System.out.println("=== Поліморфізм транзакцій ===");
        t1.показатиТип();
        t1.виконати();
        t1.логувати();
    }
}
