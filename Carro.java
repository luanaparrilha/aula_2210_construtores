package aula_2210_construtor;

public class Carro {
	String modelo;
	String cor;
	String placa;

	public Carro() {
		modelo = "Honda Civic";
		cor = "Cinza";
		placa = "ABC1234";
	}

	public Carro(String modelo, String cor, String placa) {
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}