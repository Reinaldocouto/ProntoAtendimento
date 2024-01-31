package br.com.fiap.consulta.dao;

import java.util.List;

import br.com.fiap.consulta.modelo.Consulta;
import br.com.fiap.consulta.modelo.Paciente;

public class ConsultaDAO {

	/**
	 * Este metodo devera retornar uma lista de Consultas do paciente passado como parametro
	 * observe que, na query sql devera ser feito um join com a tabela medico pois o nome 
	 * do medico devera ser exibido tambem na tela.
	 */
	public List<Consulta> recuperaPorPaciente(Paciente p) throws Exception {
		return null;
	}

	/**
	 * Faca a inclusao deste objeto consulta no banco de dados. Observe que o id gerado
	 * pelo banco deve ser colocado no objeto para possivel uso na interface.
	 */
	public void inclui(Consulta c) throws Exception {
	}
	
}
