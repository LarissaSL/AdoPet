package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Abrigo;
import br.com.alura.adopet.api.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Page<Pet> findAllByAdotadoFalse(Pageable pageable);
    Page<Pet> findByAbrigo(Abrigo abrigo, Pageable pageable);
}
