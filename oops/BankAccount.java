public class BankAccount {
  
    private Double balance;
    private String owner;

    BankAccount(Double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public Double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public Double withDraw(Double amount) throws Exception {
        if (amount < balance) {
            balance -= amount;
            return balance;
        } else {
            throw new Exception("No Enough Funds!");
        }
    }

    @Override
    public String toString() {
        return "Balance of " + this.owner + "'s' account is " + this.balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof BankAccount) {
            BankAccount b2 = (BankAccount) obj;
            return this.owner.equals(b2.owner);
        }
        return false;
    }

    

    
}
