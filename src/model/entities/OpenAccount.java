package model.entities;

public class OpenAccount extends Accountant {

    private int qtdCheque =0;

    public OpenAccount(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public int getQtdCheque() {
        return qtdCheque;
    }

    public void issueCheque(){ // emitir cheque
        this.qtdCheque++;
    }
}
