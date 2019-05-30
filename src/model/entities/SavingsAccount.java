package model.entities;

public class SavingsAccount extends Account{

    public
    SavingsAccount(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public void addYield(){ //Calcula o rendimento da poupanca e acrescenta ao montante
        deposit(getAmount()*0.14);
    }
}
