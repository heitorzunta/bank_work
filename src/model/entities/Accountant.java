package model.entities;

public abstract class Accountant extends Account {

    public
    Accountant(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public double withdraw (double value) { //saque
        if (getAmount() > 0 && value < getAmount()) {
            setAmount(getAmount() - value); //pensar num metod estatico para isso
            return getAmount();
        } else return -1.0;
    }
}
