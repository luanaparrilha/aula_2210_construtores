package aula_2210_construtor;

public class ConstrutorCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();

		System.out.println("---CADASTRAMENTO DE COMPRA---");
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Placa: " + carro1.getPlaca());
	}

}