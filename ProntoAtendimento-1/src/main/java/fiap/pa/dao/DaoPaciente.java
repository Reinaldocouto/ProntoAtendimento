package fiap.pa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fiap.pa.modelo.Paciente;

public class DaoPaciente {

	public List<Paciente> recupera() throws Exception {
		String sql = "SELECT id, nome, nascimento FROM paciente";
		List<Paciente> lista = new ArrayList<>();
		try (Connection con = new ConnectionFactory().getConexao();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Paciente p = new Paciente();
				p.setId(rs.getLong("id"));
				p.setNome(rs.getString("nome"));
				p.setNascimento(rs.getDate("nascimento").toLocalDate());
				lista.add(p);
			}			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return lista;
	}
	
}
