package br.edu.ifms.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.curso.model.Aluno;

@Repository
public interface RepositoryAluno extends JpaRepository<Aluno, Long>{
	
	

}
