package br.com.alura.adopet.api.dto;

import br.com.alura.adopet.api.model.Abrigo;

public record DadosListagemAbrigoDTO(String nome,
                                     String telefone,
                                     String email) {

    public DadosListagemAbrigoDTO(Abrigo abrigo) {
        this(abrigo.getNome(), abrigo.getTelefone(), abrigo.getEmail());
    }
}
