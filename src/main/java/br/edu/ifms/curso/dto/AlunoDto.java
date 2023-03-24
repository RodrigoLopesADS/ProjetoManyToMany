package br.edu.ifms.curso.dto;

import java.util.Objects;

public class AlunoDto {
	
	private Long id;
	private String nome;
	private int ra;
	
	
	public AlunoDto() {
		// TODO Auto-generated constructor stub
	}


	public AlunoDto(Long id, String nome, int ra) {
		super();
		this.id = id;
		this.nome = nome;
		this.ra = ra;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoDto other = (AlunoDto) obj;
		return Objects.equals(id, other.id);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getRa() {
		return ra;
	}


	public void setRa(int ra) {
		this.ra = ra;
	}
	
	
	

}
