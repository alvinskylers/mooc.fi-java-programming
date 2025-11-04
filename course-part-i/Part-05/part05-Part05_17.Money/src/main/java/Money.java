
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money amount) {
        int newCents = this.cents + amount.cents();
        int newEuros = this.euros + amount.euros();
        Money money = new Money(newEuros, newCents);
        return money;
    }

    public boolean lessThan(Money amount) {
        
        if (this.euros < amount.euros) {
            return true;
        }

        if (this.euros > amount.euros) {
            return false;
        }

        if (this.euros == amount.euros) {
            if (this.cents > amount.cents) {
                return false;
            }

            if  (this.cents < amount.cents) {
                return true;
            }
        }

        return false;
    }

    public Money minus(Money amount) {

        int finalEuros = 0;
        int finalCents = 0;

        if (this.euros >= amount.euros) {
            
            if (this.cents >= amount.cents) {
                finalEuros = this.euros - amount.euros;
                finalCents = this.cents - amount.cents;
                System.out.println("euros: " + finalEuros);
                System.out.println("cents: " + finalCents);
            } 

            if (this.cents < amount.cents) {
                finalEuros = this.euros - amount.euros;
                finalCents = (this.cents + 100) - amount.cents;
                finalEuros--;

                if (finalEuros <= 0) {
                    finalEuros = 0;
                    finalCents = 0;
                }

            }

            return new Money(finalEuros, finalCents);
        }

        if (this.euros < amount.euros) {
            return new Money(finalEuros, finalCents);
        }

        return null;
    }

}
