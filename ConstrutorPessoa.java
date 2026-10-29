package aula_2210_construtor;

public class ConstrutorPessoa {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Peeta Mellark", 17);
		Pessoa pessoa2 = new Pessoa("Katniss Everdeen", 16);

		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());

		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());

	}

}