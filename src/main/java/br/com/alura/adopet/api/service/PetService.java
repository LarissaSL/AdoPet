package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.dto.CadastroPetDTO;
import br.com.alura.adopet.api.dto.DadosListagemPetDTO;
import br.com.alura.adopet.api.model.Abrigo;
import br.com.alura.adopet.api.model.Pet;
import br.com.alura.adopet.api.repository.PetRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Page<DadosListagemPetDTO> listarPetsNaoAdotados(Pageable pageable) {
        return petRepository.findAllByAdotadoFalse(pageable).map(DadosListagemPetDTO::new);
    }

    @Transactional
    public void cadastrarPet(Abrigo abrigo, CadastroPetDTO dto) {
        Pet pet = new Pet(dto, abrigo);
        petRepository.save(pet);
    }
}
