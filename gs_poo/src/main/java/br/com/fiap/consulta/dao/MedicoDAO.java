package br.com.fiap.consulta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.consulta.modelo.Medico;

public class MedicoDAO {

	
	public List<Medico> recupera() throws Exception{
		String sel = "select id, nome, crm, especialidade from medico order by nome";
		List<Medico> l = new ArrayList<>();
			
		try (Connection con = new ConnectionFactory().getConexao();
				PreparedStatement pstmt = con.prepareStatement(sel)){
			
			ResultSet rs = pstmt.executeQuery();
			
			Medico m;
			while(rs.next()) {
				m = new Medico();
				m.setId(rs.getLong("id"));
				m.setNome(rs.getString("nome"));
				m.setCrm(rs.getString("crm"));
				m.setEspecialidade(rs.getString("especialidade"));
				l.add(m);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return l;
	
		
	}
}
