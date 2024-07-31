package br.com.alura.adopet.api.dto;

import br.com.alura.adopet.api.model.Pet;
import br.com.alura.adopet.api.model.TipoPet;

public record DadosListagemPetDTO(String nome,
                                  TipoPet tipo,
                                  String raca,
                                  int idade,
                                  String cor,
                                  Float peso,
                                  DadosListagemAbrigoDTO abrigo) {

    public DadosListagemPetDTO(Pet pet) {
        this(pet.getNome(), pet.getTipo(), pet.getRaca(), pet.getIdade(), pet.getCor(), pet.getPeso(), new DadosListagemAbrigoDTO(pet.getAbrigo()));
    }
}
