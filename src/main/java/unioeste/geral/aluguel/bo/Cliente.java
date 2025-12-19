package unioeste.geral.aluguel.bo;
import unioeste.geral.endereco.bo.EnderecoEspecifico;
import unioeste.geral.pessoa.bo.*;

import java.io.Serializable;
import java.util.List;

public class Cliente extends PessoaFisica implements Serializable {
    public Cliente() {
    }

    public Cliente(Long id, String nome, String nomeSocial, EnderecoEspecifico enderecoResidencial, List<Fone> fones, List<Email> emails, String cpf, String primeiroNome, String sobreNome) {
        super(id, nome, nomeSocial, enderecoResidencial, fones, emails, cpf, primeiroNome, sobreNome);
    }
}
