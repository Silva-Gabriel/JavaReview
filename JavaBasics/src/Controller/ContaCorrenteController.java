package Controller;

import Model.Cliente;
import Model.Conta;
import Model.ContaCorrente;
import Model.Telefone;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrenteController extends ContaCorrente {

    public static void main(String[] args) {
        List<Telefone> telefones = new ArrayList<>();
        Telefone telefoneFixo = new Telefone(11, 3446, false);
        Telefone telefoneCelular1 = new Telefone(11, 2438, true);
        telefones.add(telefoneFixo);
        telefones.add(telefoneCelular1);
        Cliente cliente = new Cliente("Gabriel", "49045501880", true, telefones );
        Conta conta = new Conta(001,001,500.0,cliente);

        for(int i = 0; i < conta.getDono().getTelefones().size();i++) {
            System.out.println(conta.getDono().getTelefones().get(i));
        }
    }

}
