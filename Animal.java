package aula_2210_construtor;

public class Animal {
	String nome;
	String tipo;
	String sexo;
	String peso;

	public Animal() {
		nome = "Garfield";
		tipo = "Gato Persa";
		sexo = "Macho";
		peso = "8kg";
	}

	public Animal(String nome, String tipo, String sexo, String peso) {
		this.nome = nome;
		this.tipo = tipo;
		this.sexo = sexo;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}