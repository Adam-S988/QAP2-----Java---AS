public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    //Constructors
    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public String getPersonals(){
        return this.owner.toString();

    }

    public void charge(Money amount){
        Money credit = new Money(this.getBalance());
        credit.add(amount);
        if (credit.compareTo(this.getCreditLimit()) == 1) {
            System.out.println("Exceeds credit limit");
        } else {
            this.balance.add(amount);
        }
    }

    public void payment(Money amount){
        this.balance.subtract(amount);
    }
}
