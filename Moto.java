package practica2;

public class Moto extends Vehiculo{
	//con extends indico que es clase hijo de vehiculo
	
	//Atributos nuevos
	private int cilindrada;
	
	//Método constructor incluyendo atributos heredados
	public Moto(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula,marca,modelo);
		this.cilindrada=cilindrada;
	}
	
	//Uso los metodos abstractos 
	public double costeRepararMotor() {
		double coste1=0;
		if (cilindrada<=250) {//si las cilindradas son menor,
			coste1=300;//el precio es fijo
		}else if(cilindrada>250){//si son mayir
			coste1=200+(0.25*cilindrada);//100+ precio
		}
		return coste1;
	}
	public double costeCambioRueda() {
		double coste2=50;//precio fijo
		return coste2;
	}
	public String toString() {
		return "Moto: "+super.toString()+" Cilindrada: "+cilindrada;
		//acudo al toString de Father class (marca, matricula y modelo)
	}
	

}
