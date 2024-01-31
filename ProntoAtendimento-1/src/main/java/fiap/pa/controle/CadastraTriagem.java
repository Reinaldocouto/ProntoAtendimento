package fiap.pa.controle;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fiap.pa.bo.HospitalBO;
import fiap.pa.modelo.Funcionario;
import fiap.pa.modelo.Paciente;
import fiap.pa.modelo.Triagem;

/**
 * Servlet implementation class CadastraTriagem
 */
@WebServlet("/CadastraTriagem")
public class CadastraTriagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraTriagem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperar todos as informacoes da tela,
		//instanciar objeto Triagem com funcionario e paciente
		//associado e gravar no banco de dados.
		//Depois, pego a lista de pacientes e médicos e
		//mando para a tela de prontuário
		
		String idPaciente = request.getParameter("paciente");
		String pressao = request.getParameter("pressao");
		String temp = request.getParameter("temperatura");
		String peso = request.getParameter("peso");
		String motivo = request.getParameter("motivo");
		String obs = request.getParameter("observacao");
		String idEnfermeiro = request.getParameter("enfermeiro");
		
		Triagem tri = new Triagem();
		tri.setMotivo(motivo);
		tri.setDescricao(obs);
		tri.setPressao(pressao);
		tri.setPeso(Double.parseDouble(peso));
		tri.setTemperatura(Double.parseDouble(temp));
		
		Paciente pac = new Paciente();
		pac.setId(Long.parseLong(idPaciente));
		
		Funcionario fun = new Funcionario();
		fun.setId(Long.parseLong(idEnfermeiro));
		
		tri.setPaciente(pac);
		tri.setEnfermeiro(fun);
		
		tri.setHorario(LocalDateTime.now());
		
		HospitalBO bo = new HospitalBO();
		try {
			bo.gravaTriagem(tri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		request.getRequestDispatcher("atendimento.jsp").forward(request, response);
	}

}
