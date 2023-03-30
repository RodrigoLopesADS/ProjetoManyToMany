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
		Aluno aRodrigo = new Aluno(null, "Rodrigo", 456);
		Aluno aMariana = new Aluno(null, "Mariana", 789);
		Aluno aAlexandre = new Aluno(null, "Alexandre", 147);
		
		
		Disciplina d1 = new Disciplina(null, "DB", 80);
		Disciplina d2 = new Disciplina(null, "Frames2", 80);
		Disciplina d3 = new Disciplina(null, "SD", 80);
		//Disciplina d4 = new Disciplina(null, "Auditoria", 80);
		//Disciplina d5 = new Disciplina(null, "Javascript", 80);
		//Disciplina d6 = new Disciplina(null, "Docker", 80);
		
		d1.getAlunos().addAll(Arrays.asList(aKenely, aMariana));
		d2.getAlunos().addAll(Arrays.asList(aRodrigo, aAlexandre));
		d3.getAlunos().addAll(Arrays.asList(aKenely, aRodrigo, aAlexandre));
		
		
		

		
		
		repositoryAluno.saveAll(Arrays.asList(aKenely, aRodrigo, aMariana, aAlexandre));
		repositoryDisciplina.saveAll(Arrays.asList(d1, d2, d3));

		

	}
	
	

}
