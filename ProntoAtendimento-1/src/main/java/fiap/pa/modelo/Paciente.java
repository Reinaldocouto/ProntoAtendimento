package fiap.pa.modelo;

import java.time.LocalDate;

public class Paciente {
	
	private long id;
	private String nome;
	private LocalDate nascimento;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public Paciente(long id, String nome, LocalDate nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	public Paciente() {
	}
}
