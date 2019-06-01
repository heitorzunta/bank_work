package model.entities;

public class OpenAccount extends Accountant {

    private int qtdCheque =0;

    public OpenAccount(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public int getQtdCheque() {
        return qtdCheque;
    }

    public void setQtdCheque(int qtdCheque) {
        this.qtdCheque = qtdCheque;
    }

    //metodo para emitir Cheque
    public void issueCheque(){
        qtdCheque++;
    }

    //metodo para emprestimo
    public boolean loan(double value){
        return true;
    }
}
