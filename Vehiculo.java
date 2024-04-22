package practica2;

public abstract class Vehiculo { //se comienza por la clase padre
	// es una clase abstracta
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//Método Constructor
	public Vehiculo (String matricula, String marca, String modelo) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
	
	//Metodos get 
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	//los abstract no llevan {}
	public abstract double costeRepararMotor();
	public abstract double costeCambioRueda();
	
	//Método toString para usar en clases hijos
	public String toString() {
		return marca+" Matrícula: "+matricula+" Modelo: "+modelo;
	}

}
