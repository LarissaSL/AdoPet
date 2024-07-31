package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.dto.CadastroAbrigoDTO;
import br.com.alura.adopet.api.dto.DadosListagemAbrigoDTO;
import br.com.alura.adopet.api.dto.DadosListagemPetDTO;
import br.com.alura.adopet.api.exception.ValidacaoException;
import br.com.alura.adopet.api.model.Abrigo;
import br.com.alura.adopet.api.repository.AbrigoRepository;
import br.com.alura.adopet.api.repository.PetRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AbrigoService {

    @Autowired
    private AbrigoRepository abrigoRepository;

    @Autowired
    private PetRepository petRepository;

    public Page<DadosListagemAbrigoDTO> listar(Pageable pageable) {
        return abrigoRepository.findAll(pageable).map(DadosListagemAbrigoDTO::new);
    }

    @Transactional
    public void cadastrar(CadastroAbrigoDTO dto) {
        Abrigo abrigo = new Abrigo(dto);

        abrigoRepository.save(abrigo);
    }

    public Page<DadosListagemPetDTO> listarPetsDoAbrigo(String idOuNome, Pageable pageable) {
        Abrigo abrigo = carregarAbrigo(idOuNome);
        return petRepository.findByAbrigo(abrigo, pageable)
                .map(DadosListagemPetDTO::new);
    }

    public Abrigo carregarAbrigo(String idOuNome) {
        if (idOuNome.matches("\\d+")) {
            Long id = Long.parseLong(idOuNome);
            return abrigoRepository.findById(id)
                    .orElseThrow(() -> new ValidacaoException("Abrigo não encontrado"));
        } else {
            return abrigoRepository.findByNome(idOuNome)
                    .orElseThrow(() -> new ValidacaoException("Abrigo não encontrado"));
        }
    }
}
