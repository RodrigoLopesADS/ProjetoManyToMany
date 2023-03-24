package br.edu.ifms.curso.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.curso.model.Aluno;
import br.edu.ifms.curso.model.Disciplina;
import br.edu.ifms.curso.repository.RepositoryAluno;
import br.edu.ifms.curso.repository.RepositoryDisciplina;

@Service
public class DBService {
	
	@Autowired
	RepositoryAluno repositoryAluno;

	@Autowired
	RepositoryDisciplina repositoryDisciplina;

	

	public void instantiateTestDataBase() throws ParseException {
		
		

		Aluno aKenely = new Aluno(null, "Kenely", 123);
		
		Disciplina d1 = new Disciplina(null, "DB", 80);
		
		//aKenely.getDisciplina().addAll(Arrays.asList(d1));

		//aKenely.getDisciplina().add(d1);
		
		repositoryAluno.saveAll(Arrays.asList(aKenely));
		repositoryDisciplina.saveAll(Arrays.asList(d1));

		

	}
	
	

}
