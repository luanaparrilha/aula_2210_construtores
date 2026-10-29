package aula_2210_construtor;

public class ConstrutorConsulta {

	public static void main(String[] args) {

		Consulta consulta1 = new Consulta();

		System.out.println("---CONSULTA MARCADA---");
		System.out.println("Doutor: " + consulta1.getNomeDentista());
		System.out.println("Paciente: " + consulta1.getNomePaciente());
		System.out.println("Data: " + consulta1.getDataConsulta());
	}

}