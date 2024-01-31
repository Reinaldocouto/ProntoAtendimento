package fiap.pa.modelo;

public class Funcionario {

	private long id;
	private String nome;
	private String registro;
	private String cargo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Funcionario(long id, String nome, String registro, String cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.registro = registro;
		this.cargo = cargo;
	}
	
	public Funcionario() {		
	}
}
