package fiap.pa.modelo;

import java.time.LocalDateTime;

public class Triagem {

	private long id;
	private double temperatura;
	private double peso;
	private String pressao;
	private String motivo;
	private String descricao;
	private LocalDateTime horario;
	private Funcionario enfermeiro;
	private Paciente paciente;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	public Funcionario getEnfermeiro() {
		return enfermeiro;
	}
	public void setEnfermeiro(Funcionario enfermeiro) {
		this.enfermeiro = enfermeiro;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Triagem(long id, double temperatura, double peso, String pressao, String motivo, String descricao,
			LocalDateTime horario, Funcionario enfermeiro, Paciente paciente) {
		super();
		this.id = id;
		this.temperatura = temperatura;
		this.peso = peso;
		this.pressao = pressao;
		this.motivo = motivo;
		this.descricao = descricao;
		this.horario = horario;
		this.enfermeiro = enfermeiro;
		this.paciente = paciente;
	}
	
	public Triagem() {		
	}
}
