package hotel;

public class Покоївка extends Працівник {

    public Покоївка(int id, String name, String phone, double salary) {
        super(id, name, phone, salary);
    }

    @Override
    public void дія() {
        System.out.println("Покоївка " + name + " прибирає номер.");
    }

    @Override
    public void показатиРоль() {
        System.out.println("Роль: Покоївка");
    }

    @Override
    public void перевіритиДані() {
        System.out.println("Перевірка робочого інвентаря.");
    }
}
