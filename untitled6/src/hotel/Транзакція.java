package hotel;

public abstract class Транзакція {
    protected int id;
    protected double amount;
    protected String date;

    public static int totalTransactions = 0;

    public Транзакція(int id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        totalTransactions++;
    }

    public abstract void виконати();
    public abstract void показатиТип();
    public abstract void логувати();

    public static void showTotalTransactions() {
        System.out.println("Транзакцій: " + totalTransactions);
    }
}
