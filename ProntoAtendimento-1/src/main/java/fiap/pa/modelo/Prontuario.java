package fiap.pa.modelo;

import java.time.LocalDateTime;

public class Prontuario {

	private long id;
	private LocalDateTime horario;
	private String diagnostico;
	private String encaminhamento;
	
	private Funcionario medico;
	private Paciente paciente;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getHorario() {
		return horario;
	}
	public void setHorario(LocalDateTime horario) {
		this.horario = horario;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getEncaminhamento() {
		return encaminhamento;
	}
	public void setEncaminhamento(String encaminhamento) {
		this.encaminhamento = encaminhamento;
	}
	public Funcionario getMedico() {
		return medico;
	}
	public void setMedico(Funcionario medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Prontuario(long id, LocalDateTime horario, String diagnostico, String encaminhamento, Funcionario medico,
			Paciente paciente) {
		super();
		this.id = id;
		this.horario = horario;
		this.diagnostico = diagnostico;
		this.encaminhamento = encaminhamento;
		this.medico = medico;
		this.paciente = paciente;
	}
	
	public Prontuario() {
	}
	
}
