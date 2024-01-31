package fiap.pa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import fiap.pa.modelo.Triagem;

public class DaoTriagem {
	
	public void insere(Triagem t) throws Exception {
		String ins = "INSERT INTO triagem(temperatura, pressao, peso, motivo,"
				+ "descricao, horario, paciente_id, enfermeiro_id) values("
				+ "?, ?, ?, ?, ?, ?, ?, ?)";
		try(Connection con = new ConnectionFactory().getConexao();
			PreparedStatement pstmt = con.prepareStatement(ins, new String[] {"id"}))
		{
			pstmt.setDouble(1, t.getTemperatura());
			pstmt.setString(2, t.getPressao());
			pstmt.setDouble(3, t.getPeso());
			pstmt.setString(4, t.getMotivo());
			pstmt.setString(5, t.getDescricao());
			pstmt.setTimestamp(6, Timestamp.valueOf(t.getHorario()));
			pstmt.setLong(7, t.getPaciente().getId());
			pstmt.setLong(8, t.getEnfermeiro().getId());
			pstmt.executeUpdate();			
			ResultSet rs = pstmt.getGeneratedKeys();
			if (rs.next()) {
				t.setId(rs.getLong(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
