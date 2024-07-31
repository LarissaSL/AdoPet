package br.com.alura.adopet.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CadastroPetDTO(
        @NotBlank String nome,
        @NotBlank String tipo,
        @NotBlank String raca,
        int idade,
        @NotBlank String cor,
        float peso
) {}

