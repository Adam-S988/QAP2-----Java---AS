public class Money {
    private long dollars;
    private long cents;

    // Constructor
    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public void add(Money otherAmount) {
        this.dollars += otherAmount.dollars;
        this.cents += otherAmount.cents;

        if (this.cents >= 100) {
            this.dollars += this.cents / 100;
            this.cents %= 100;
        }
    }

    public void subtract(Money otherAmount) {
        this.dollars -= otherAmount.dollars;
        this.cents -= otherAmount.cents;

        if (this.cents < 0) {
            this.dollars -= 1;
            this.cents += 100;
        }
    }

    public int compareTo(Money otherObject) {
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(thisTotalCents, otherTotalCents);
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}
