package hotel;

public abstract class Працівник extends Особа {
    protected double salary;

    public Працівник(int id, String name, String phone, double salary) {
        super(id, name, phone);
        this.salary = salary;
    }

    @Override
    public abstract void дія();

    @Override
    public abstract void показатиРоль();

    @Override
    public abstract void перевіритиДані();
}
