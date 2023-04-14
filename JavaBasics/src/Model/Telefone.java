package Model;

public class Telefone {
    private Integer ddd;
    private Integer numero;
    private Boolean possuiWhatsApp;

    public Telefone() {
    }

    public Telefone(Integer ddd, Integer numero, Boolean possuiWhatsApp) {
        this.ddd = ddd;
        this.numero = numero;
        this.possuiWhatsApp = possuiWhatsApp;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getPossuiWhatsApp() {
        return possuiWhatsApp;
    }

    public void setPossuiWhatsApp(Boolean possuiWhatsApp) {
        this.possuiWhatsApp = possuiWhatsApp;
    }
}
