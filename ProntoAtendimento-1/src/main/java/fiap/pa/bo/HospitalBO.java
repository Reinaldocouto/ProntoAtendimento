package fiap.pa.bo;

import java.util.List;

import fiap.pa.dao.DaoFuncionario;
import fiap.pa.dao.DaoPaciente;
import fiap.pa.dao.DaoTriagem;
import fiap.pa.modelo.Funcionario;
import fiap.pa.modelo.Paciente;
import fiap.pa.modelo.Triagem;

public class HospitalBO {

	
	public List<Paciente> recuperaPacientes() throws Exception {
		DaoPaciente dao = new DaoPaciente();
		return dao.recupera();
	}
	
	public List<Funcionario> recuperaEnfermeiro() throws Exception {
		DaoFuncionario dao = new DaoFuncionario();
		return dao.recupera("Enfermeiro");		
	}

	public List<Funcionario> recuperaMedico() throws Exception {
		DaoFuncionario dao = new DaoFuncionario();
		return dao.recupera("Medico");		
	}

	public void gravaTriagem(Triagem tri) throws Exception {
		DaoTriagem dao = new DaoTriagem();
		dao.insere(tri);
	}
	
	
}
