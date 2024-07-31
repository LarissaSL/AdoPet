package br.com.alura.adopet.api.service;

import br.com.alura.adopet.api.dto.AtualizarTutorDTO;
import br.com.alura.adopet.api.dto.CadastrarTutorDTO;
import br.com.alura.adopet.api.model.Tutor;
import br.com.alura.adopet.api.repository.TutorRepository;
import br.com.alura.adopet.api.validacoes.IValidacaoCadastroTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private List<IValidacaoCadastroTutor> validacoes;

    public void cadastrar(CadastrarTutorDTO dto) {
        validacoes.forEach(v -> v.validar(dto));

        Tutor tutor = new Tutor(dto.nome(), dto.telefone(), dto.email());
        tutorRepository.save(tutor);
    }


    public void atualizar(AtualizarTutorDTO dto) {
        Tutor tutor = tutorRepository.getReferenceById(dto.id());
        tutor.atualizarDados(dto);
    }
}
