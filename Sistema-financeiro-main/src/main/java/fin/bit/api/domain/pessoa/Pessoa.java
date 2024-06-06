package fin.bit.api.domain.pessoa;

import fin.bit.api.domain.endereco.Endereco;
import jakarta.persistence.*;

@Table(name = "pessoa")
@Entity(name = "Pessoa")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;
    private boolean ativo;

    public Pessoa(DadosCadastroPessoa dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.endereco = new Endereco(dados.endereco());
    }
}
