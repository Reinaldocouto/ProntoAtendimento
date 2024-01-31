package br.com.fiap.consulta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.consulta.modelo.Paciente;

public class PacienteDAO {

	
	public List<Paciente> recupera() throws Exception{
		String sel = "select id, nome, convenio from paciente order by nome";
		List<Paciente> l = new ArrayList<>();
			
		try (Connection con = new ConnectionFactory().getConexao();
				PreparedStatement pstmt = con.prepareStatement(sel)){
			
			ResultSet rs = pstmt.executeQuery();
			
			Paciente m;
			while(rs.next()) {
				m = new Paciente();
				m.setId(rs.getLong("id"));
				m.setNome(rs.getString("nome"));
				m.setConvenio(rs.getString("convenio"));
				l.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return l;
	
		
	}
	
	public List<Paciente> recuperaComConsulta() throws Exception{
		List<Paciente> l = new ArrayList<>();
			
		//TODO implemente este método
		return l;
	
		
	}
	
	
}
