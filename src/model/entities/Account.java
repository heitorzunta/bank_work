package model.entities;

public abstract class Account {

    private int accountNumber;
    private Double amount = 0.0; //montante de dinheiro na conta
    private Agency agency;
    private Client client;
    private int qtdTransfer = 0;
    private int qtdDeposit = 0;

    public Account(int accountNumber, Agency agency, Client client) {
        accountNumber = accountNumber;
        this.agency = agency;
        this.client = client;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Agency getAgency() {
        return agency;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getQtdTransfer() {
        return qtdTransfer;
    }

    public int getQtdDeposit() {
        return qtdDeposit;
    }

    public void deposit(double value){
        amount += value;
    }

    public String transfer(Account transferAccount, double value){

        if(amount - value >=0) {
            amount -= value;
            transferAccount.deposit(value);
            return "Sucessfull!";
        }
        else return  "Error in transfer!";
    }

    @Override
    public String toString(){
        StringBuilder infoAccount = new StringBuilder();

        infoAccount.append("NUMERO DA CONTA: " + accountNumber + " ");
        infoAccount.append("AGENCIA: " + agency.getCodAgency() +"\n");
        infoAccount.append("NOME DO CLIENTE: " + client.getName() + "\n");
        return infoAccount.toString();
    }
}
