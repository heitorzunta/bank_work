package model.entities;

public class Agency {
    private Integer codAgency;
    private String nameAgency;
    private Address addAgency;

    public Agency(){}

    public Agency(Integer codAgency, String nameAgency, Address addAgency) {
        this.codAgency = codAgency;
        this.nameAgency = nameAgency;
        this.addAgency = addAgency;
    }

    public Integer getCodAgency() {
        return codAgency;
    }

    public void setCodAgency(Integer codAgency) {
        this.codAgency = codAgency;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public void setNameAgency(String nameAgency) {
        this.nameAgency = nameAgency;
    }

    public Address getAddAgency() {
        return addAgency;
    }

    public void setAddAgency(Address addAgency) {
        this.addAgency = addAgency;
    }

    @Override
    public String toString(){
        StringBuilder agencia = new StringBuilder();

        agencia.append("AGÊNCIA: ");
        agencia.append(nameAgency + " ");
        agencia.append("NUMERO: ");
        agencia.append(codAgency);

        return agencia.toString();
    }

}
