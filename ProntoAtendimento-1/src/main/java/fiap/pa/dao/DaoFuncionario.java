package fiap.pa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fiap.pa.modelo.Funcionario;

public class DaoFuncionario {
	
	public List<Funcionario> recupera(String cargo) throws Exception {
		String sql = "SELECT id, nome, registro FROM funcionario WHERE cargo = ?";
		List<Funcionario> retorno = new ArrayList<>();
		
		try(Connection con = new ConnectionFactory().getConexao();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setString(1, cargo);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Funcionario f = new Funcionario(rs.getLong("id"), 
						               rs.getString("nome"), 
						               rs.getString("registro"),
						               cargo);
				retorno.add(f);
			}			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return retorno;
	}

}
