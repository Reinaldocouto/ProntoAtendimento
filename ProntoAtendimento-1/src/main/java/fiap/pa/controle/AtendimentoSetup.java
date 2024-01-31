package fiap.pa.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fiap.pa.bo.HospitalBO;
import fiap.pa.modelo.Funcionario;
import fiap.pa.modelo.Paciente;

/**
 * Servlet implementation class AtendimentoSetup
 */
@WebServlet("/AtendimentoSetup")
public class AtendimentoSetup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtendimentoSetup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HospitalBO bo = new HospitalBO();
		try {
			List<Paciente> pacientes = bo.recuperaPacientes();
			request.setAttribute("pacientes", pacientes);
			
			List<Funcionario> enfermeiros = bo.recuperaEnfermeiro();
			request.setAttribute("enfermeiros", enfermeiros);
			
			request.getRequestDispatcher("atendimento.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
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
