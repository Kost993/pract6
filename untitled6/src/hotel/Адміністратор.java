package hotel;

public class Адміністратор extends Працівник {

    public Адміністратор(int id, String name, String phone, double salary) {
        super(id, name, phone, salary);
    }

    @Override
    public void дія() {
        System.out.println("Адміністратор " + name + " керує бронюваннями.");
    }

    @Override
    public void показатиРоль() {
        System.out.println("Роль: Адміністратор");
    }

    @Override
    public void перевіритиДані() {
        System.out.println("Перевірка доступу адміністратора.");
    }
}
