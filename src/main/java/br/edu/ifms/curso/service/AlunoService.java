package br.edu.ifms.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.curso.dto.AlunoDto;
import br.edu.ifms.curso.model.Aluno;
import br.edu.ifms.curso.repository.RepositoryAluno;

@Service
public class AlunoService {
	
	@Autowired
	private RepositoryAluno repositoryAluno;
	
	
	public List<Aluno> buscarTodos(){
		return repositoryAluno.findAll();
		
	}
	
	public Aluno buscarId(Long id) {
		Optional<Aluno> aluno = repositoryAluno.findById(id);
		return aluno.orElseThrow();
		
	}
	
	public Aluno inserir(Aluno aluno) {
		aluno.setId(null);
		return repositoryAluno.save(null);
		
	}
	
	public void remover(Long id) {
		buscarId(id);
		repositoryAluno.deleteById(id);
		
	}
	
	public Aluno atualizar(Aluno aluno) {
		Aluno alunoNovo = buscarId(aluno.getId());
		
		alunoNovo.setNome(aluno.getNome());
		alunoNovo.setRa(aluno.getRa());
		
		
		return repositoryAluno.save(alunoNovo);
		
	}

	public Aluno fromDto(AlunoDto alunoDto) {
		return new Aluno(alunoDto.getId(), alunoDto.getNome(), alunoDto.getRa());
		
	}
	
	
	
	
	
	

}
