package practica2;

public class Carro extends Vehiculo{
	//Luego de hacer clase padre, se hace clase hijo
	//debe identificarse como hijo mediante el extends
	
	//Se heredan los atributos de la clase padre
	//Nuevos Atributos
	private int kilometraje;
	private String combustible;
	
	//Metodo constructor
	public Carro(String matricula, String marca, String modelo, int kilometraje, String combustible) {
		super(matricula,marca,modelo);
		this.kilometraje=kilometraje;
		this.combustible=combustible;
	}
	
	//Se heredan métodos de la clase padre
	//Otro métodos get
	public int getKilometraje() {
		return kilometraje;
	}
	public String getCombustible() {
		return combustible;
	}
	
	//Metodos abstracto que se implementan en esta clase
	public double costeRepararMotor() {
		double coste1=0;
		double costeA=0.02;
		double costeB=0.01;
		if (kilometraje<=150000) {//en caso kilometraje sea menor a eso
			coste1=costeA*kilometraje;//el coste a se multiplica por kilómetro
		}else if(kilometraje>150000){//si es mayor,
			coste1=1000+(costeB*kilometraje);//el coste b se multiplica a l km y se suma 1000
		}
		if (combustible == "gasolina" ) {//en caso el vehículo sea a gasolina
			coste1=coste1-(coste1*0.1);//le aplico el descuento
		}
		return coste1; //devuelvo el precio final
	}
	
	public double costeCambioRueda() {
		double coste2=100;//precio fijo
		return coste2;
	}
	public double costeCambioLiPaBri() {
		double coste3=55;//precio fijo
		return coste3;//precio fijo
	}
	
	
	public String toString() {
		return "Carro: "+super.toString()+" Kilometraje: "+kilometraje+" Combustible: "+combustible;
	}//acudo al toString de Father class (marca, matricula y modelo)
	

}
