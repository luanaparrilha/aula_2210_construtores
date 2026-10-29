package aula_2210_construtor;

public class ConstrutorAnimal {

	public static void main(String[] args) {

		Animal gato = new Animal();

		System.out.println("---CADASTRAMENTO DE ANIMAL---");
		System.out.println("Nome: " + gato.getNome());
		System.out.println("Tipo: " + gato.getTipo());
		System.out.println("Sexo: " + gato.getSexo());
		System.out.println("Peso: " + gato.getPeso());

	}

}