package aula_2210_construtor;

public class Consulta {
	String nomeDentista;
	String nomePaciente;
	String dataConsulta;
	
	public Consulta() {
		nomeDentista = "Doutor Nefário";
		nomePaciente = "Banguela";
		dataConsulta = "31/10/2026";
	}

	public Consulta(String nomeDentista, String nomePaciente, String dataConsulta) {
		this.nomeDentista = nomeDentista;
		this.nomePaciente = nomePaciente;
		this.dataConsulta = dataConsulta;
	}

	public String getNomeDentista() {
		return nomeDentista;
	}

	public void setNomeDentista(String nomeDentista) {
		this.nomeDentista = nomeDentista;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

}