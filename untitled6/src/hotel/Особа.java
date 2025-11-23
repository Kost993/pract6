package hotel;

public abstract class Особа {
    protected int id;
    protected String name;
    protected String phone;

    protected static int totalPersons = 0;

    public Особа(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        totalPersons++;
    }

    public abstract void дія();
    public abstract void показатиРоль();
    public abstract void перевіритиДані();

    public void інфо() {
        System.out.println("Особа: " + name + ", телефон: " + phone);
    }

    public static void showTotalPersons() {
        System.out.println("Загальна кількість осіб: " + totalPersons);
    }
}
