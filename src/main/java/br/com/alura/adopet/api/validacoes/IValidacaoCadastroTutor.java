package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.CadastrarTutorDTO;

public interface IValidacaoCadastroTutor {

    void validar(CadastrarTutorDTO dto);
}
