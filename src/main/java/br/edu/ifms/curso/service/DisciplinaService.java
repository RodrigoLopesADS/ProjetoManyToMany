package br.edu.ifms.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.ifms.curso.dto.DisciplinaDto;
import br.edu.ifms.curso.model.Disciplina;
import br.edu.ifms.curso.repository.RepositoryDisciplina;

@Service
public class DisciplinaService {
	
	
	private RepositoryDisciplina repositoryDisciplina;
	
	
	public List<Disciplina> buscarTodos(){
		return repositoryDisciplina.findAll();
		
	}
	
	public Disciplina buscarId(Long id) {
		Optional<Disciplina> disciplina = repositoryDisciplina.findById(id);
		return disciplina.orElseThrow();
		
	}
	
	public Disciplina inserir(Disciplina disciplina) {
		disciplina.setId(null);
		return repositoryDisciplina.save(null);
		
	}
	
	public void remover(Long id) {
		buscarId(id);
		repositoryDisciplina.deleteById(id);
		
	}
	
	public Disciplina atualizar(Disciplina disciplina) {
		Disciplina disciplinaNovo = buscarId(disciplina.getId());
		
		disciplinaNovo.setNome(disciplina.getNome());
		disciplinaNovo.setCargaHoraria(disciplina.getCargaHoraria());
		
		
		return repositoryDisciplina.save(disciplinaNovo);
		
	}

	public Disciplina fromDto(DisciplinaDto disciplinaDto) {
		return new Disciplina(disciplinaDto.getId(), disciplinaDto.getNome(), disciplinaDto.getCargaHoraria());
	}
	
	
	
	
	
	
	
	
	
	
	

}
