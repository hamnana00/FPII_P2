package practica2;

public class Pricipal {

	public static void main(String[] args) {
		//Creando los vehículos con polimorfismo
		Vehiculo [] vehiculo = new Vehiculo [5];
		vehiculo [0] = new Carro ("1111AAA", "Ford", "Fiesta", 146000, "gasolina");// carro1
		vehiculo [1] = new Moto ("2222BBB", "Yamaha", "XMAX", 300);// moto1
		vehiculo [2] = new Carro("3333CCC", "Toyota", "Corolla", 235000, "diesel"); //carro2
		vehiculo [3] = new Carro("4444DDD", "Citroen", "C4", 182000, "diesel"); //carro3
		vehiculo [4] = new Moto("5555EEE", "Honda", "PCX", 125);// moto2

		//creo vectores por cada sevicio
		boolean[] repMotor = {true, false, true, true, true};
		boolean[] cambRueda = {false, true, false, true, true};
		boolean[] cambLimP = {true, false, true, false, false};
		
		//inicializo variables que puedo usar dentro de mi boocle
		double precioMot = 0;
		double precioRued = 0;
		double precioLimp = 0;
		
		for(int i=0; i<vehiculo.length;i++) {
			//Para cada elemento del array vehiculos, debe imprimir la condicional de servicios
			System.out.println("----------------------------------------");
			System.out.println(vehiculo[i].toString());//invoco al toString
			//condicional de servicios
				if (repMotor [i]==true) {
					precioMot += vehiculo[i].costeRepararMotor(); //para usar al final, precio total por todos los cambios de motor
						System.out.println("--> Se ha reparado el motor: "+vehiculo[i].costeRepararMotor());
					}
				if (cambRueda[i]==true) {
					precioRued += vehiculo[i].costeCambioRueda();
					System.out.println("--> Se ha cambiado rueda: "+vehiculo[i].costeCambioRueda());
				}
				if (cambLimP[i]==true) {
					precioLimp += ((Carro)vehiculo[i]).costeCambioLiPaBri();
					System.out.println("--> Se ha cambiado el limpiaparabrisas: "+((Carro)vehiculo[i]).costeCambioLiPaBri());
				}
			}
		System.out.println("----------------------------------------");
		System.out.println("----------Y LA QUE POLIMORFICE----------");
		System.out.println("------------y la que calcule------------");
		System.out.println("----------------------------------------");
		//para calcular los precios, llamo a las variables que suban los true en mi condicional de servicios
		System.out.println("Cobros por reparación de motor: "+precioMot);//the math is mathing 
		System.out.println("Cobros por cambio de rueda: "+precioRued);
		System.out.println("Cobros por cambio de limpiaparabrisas: "+precioLimp);
		System.out.println("TOTAL: "+(precioMot+precioRued+precioLimp));
		
	}

}
