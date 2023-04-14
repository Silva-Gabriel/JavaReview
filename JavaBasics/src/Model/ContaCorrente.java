package Model;

public class ContaCorrente  extends Conta{
    private Double taxa;

    public ContaCorrente(Double taxa) {
        this.taxa = taxa;
    }

    public ContaCorrente() {
    }

    public ContaCorrente(Integer agencia, Integer numero, Double saldo, Cliente dono, Double taxa) {
        super(agencia, numero, saldo, dono);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
