package fin.bit.api.controller;

import fin.bit.api.domain.categoria.CategoriaRepository;
import fin.bit.api.domain.lancamento.LancamentoRepository;
import fin.bit.api.domain.pessoa.PessoaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {
    @Autowired
    private LancamentoRepository repository;

    @Autowired
    private CategoriaRepository repository;

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroLancamento dados, UriComponentsBuilder uriBuilder) {

    }
