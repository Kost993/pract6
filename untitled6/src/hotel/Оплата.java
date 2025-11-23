package hotel;

public class Оплата extends Транзакція {

    public Оплата(int id, double amount, String date) {
        super(id, amount, date);
    }

    @Override
    public void виконати() {
        System.out.println("Оплату виконано: " + amount + " грн.");
    }

    @Override
    public void показатиТип() {
        System.out.println("Тип транзакції: Оплата");
    }

    @Override
    public void логувати() {
        System.out.println("Логування оплати ID: " + id);
    }
}
