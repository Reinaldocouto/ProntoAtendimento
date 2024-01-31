package br.com.fiap.consulta.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.consulta.bo.ClinicaMedicaBO;
import br.com.fiap.consulta.modelo.Medico;
import br.com.fiap.consulta.modelo.Paciente;

/**
 * Servlet implementation class CadastraConsultaSetup
 */
@WebServlet("/CadastraConsultaSetup")
public class CadastraConsultaSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraConsultaSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClinicaMedicaBO bo = new ClinicaMedicaBO();

		try {		
			
			List<Paciente> pacientes = bo.recuperaPacientes();
			List<Medico> medicos = bo.recuperaMedicos();
			request.setAttribute("pacientes", pacientes);
			request.setAttribute("medicos", medicos);
			request.getRequestDispatcher("cadastraConsulta.jsp").forward(request, response);
			

		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", e.getMessage());
			request.getRequestDispatcher("erro.jsp").forward(request, response);

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
