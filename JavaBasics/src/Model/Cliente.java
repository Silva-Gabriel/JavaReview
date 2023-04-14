package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa{
  private Boolean parceiro;
  private List<Telefone> telefones = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Boolean parceiro, List<Telefone> telefones) {
        super(nome, cpf);
        this.parceiro = parceiro;
        this.telefones = telefones;
    }

    public Cliente(Boolean parceiro) {
        this.parceiro = parceiro;
    }

    public Boolean getParceiro() {
        return parceiro;
    }

    public void setParceiro(Boolean parceiro) {
        this.parceiro = parceiro;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefone(List<Telefone> telefone){
        this.telefones = telefone;
    }

    public void removeTelefone(List<Telefone> telefone){
        this.telefones.remove(telefone);
    }
}