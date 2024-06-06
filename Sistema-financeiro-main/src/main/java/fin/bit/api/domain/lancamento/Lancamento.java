package fin.bit.api.domain.lancamento;

import fin.bit.api.domain.categoria.Categoria;
import fin.bit.api.domain.pessoa.Pessoa;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
@Table(name = "lancamento")
@Entity(name = "Lancamento")

public class Lancamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private BigDecimal valor;
    private String observacao;
    private TipoLancamento tipo;
    private Categoria categoria;
    private Pessoa pessoa;

    public Lancamento(DadosCadastroLancamento dados, Categoria categoria, Pessoa pessoa) {
        this.descricao = dados.descricao();
        this.dataVencimento = dados.dataVencimento();
        this.dataPagamento = dados.dataPagamento();
        this.valor = dados.valor();
        this.observacao = dados.observacao();
        this.tipo = dados.tipo();
        this.categoria = categoria;
        this.pessoa = pessoa;


    }




}
