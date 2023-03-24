package br.edu.ifms.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.curso.model.Disciplina;

@Repository
public interface RepositoryDisciplina extends JpaRepository<Disciplina, Long> {

}
