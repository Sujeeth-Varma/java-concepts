
public class MainClass {
    public static void main(String[] args) throws Exception {
        BankAccount b1 = new BankAccount(1000.00, "Sujeeth");
        BankAccount b2 = new BankAccount(2000.00, "Sujeeth");
        System.out.println(b1.getBalance());
        b1.deposit(200.00);
        System.out.println("Balance Before withdrawing: " + b1.getBalance()); // 1200
        b1.withDraw(100.00);
        System.out.println("Balance After withdrawing: " + b1.getBalance()); // 1100

        try {
        b1.withDraw(5000.00);
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }

        System.out.println(b1);
        System.out.println(b1.equals(b2));
    }
}
