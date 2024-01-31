package br.com.fiap.consulta.bo;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.consulta.dao.ConsultaDAO;
import br.com.fiap.consulta.dao.MedicoDAO;
import br.com.fiap.consulta.dao.PacienteDAO;
import br.com.fiap.consulta.modelo.Consulta;
import br.com.fiap.consulta.modelo.Medico;
import br.com.fiap.consulta.modelo.Paciente;

public class ClinicaMedicaBO {

	
	public List<Medico> recuperaMedicos() throws Exception {
		MedicoDAO dao = new MedicoDAO();
		return dao.recupera();
	}
	
	public List<Paciente> recuperaPacientes() throws Exception {
		PacienteDAO dao = new PacienteDAO();
		return dao.recupera();
	}
	
	public List<Paciente> recuperaPacientesComConsulta() throws Exception {
		PacienteDAO dao = new PacienteDAO();
		return dao.recuperaComConsulta();
	}
	
	public List<Consulta> recuperaConsultas(Paciente p) throws Exception {
		ConsultaDAO dao = new ConsultaDAO();
		return dao.recuperaPorPaciente(p);
	}
	
	public void cadastraConsulta(Consulta c) throws Exception {
		LocalDate agora = LocalDate.now();
		if (agora.isAfter(c.getData())) {
			throw new Exception("Apenas consultas com 1 dia de antecedência podem ser cadastradas");
		}
		ConsultaDAO dao = new ConsultaDAO();
		dao.inclui(c);
	}
	
	
	
	
}
