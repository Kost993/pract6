package hotel;

public class Клієнт extends Особа {
    private String email;

    public Клієнт(int id, String name, String phone, String email) {
        super(id, name, phone);
        this.email = email;
    }

    @Override
    public void дія() {
        System.out.println("Клієнт " + name + " здійснює бронювання.");
    }

    @Override
    public void показатиРоль() {
        System.out.println("Роль: Клієнт");
    }

    @Override
    public void перевіритиДані() {
        System.out.println("Перевірка email: " + email);
    }
}
