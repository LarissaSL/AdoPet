package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.CadastrarTutorDTO;
import br.com.alura.adopet.api.exception.ValidacaoException;
import br.com.alura.adopet.api.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarSeEmailETelefoneJaForamCadastrados implements IValidacaoCadastroTutor{

    @Autowired
    private TutorRepository tutorRepository;

    @Override
    public void validar(CadastrarTutorDTO dto) {
        boolean verificaCadastro = tutorRepository.existsByEmailOrTelefone(dto.telefone(), dto.email());

        if (verificaCadastro) {
            throw new ValidacaoException("Dados já cadastrados para outro tutor!");
        }
    }
}
