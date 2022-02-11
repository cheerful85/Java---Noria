package p00II;

public class Uso_noria {

	public static void main(String[] args) {

		Noria noria = new Noria(10);
		
		noria.girar();
		
		noria.listaPersonasEnLaNoria();
		
		Persona p1 = new Persona("Juan", "García", "Andreu");
		Persona p2 = new Persona("John", "Smith", null);
		Persona p3 = new Persona("Laura", "Marín", "Pérez");
		
		noria.parar();
		
		noria.subirPersona(p1);
		noria.subirPersona(p2);
		noria.subirPersona(p3);
		
		noria.listaPersonasEnLaNoria();
		
		noria.bajarPersona(p1);
		
		noria.listaPersonasEnLaNoria();

		noria.girar();
		
		noria.bajarPersona(p3);
		
		noria.listaPersonasEnLaNoria();
		
		noria.parar();
		
		noria.bajarPersona(p3);
		
		noria.listaPersonasEnLaNoria();

		Persona p4 = new Persona("Lola", "Luengo", "Azur");
		
		noria.parar();
		
		noria.subirPersona(p4);
		
		noria.listaPersonasEnLaNoria();

		Persona p5 = new Persona("Juana", "Marín", "Pérez");

		Persona p6 = new Persona("Pepa", "Marín", "Pérez");

		Persona p7 = new Persona("Sandra", "Marín", "Pérez");

		Persona p8 = new Persona("Maria", "Marín", "Pérez");

		Persona p9 = new Persona("Dolores", "Marín", "Pérez");

		Persona p10 = new Persona("Ultima", "Marín", "Pérez");

		Persona p11 = new Persona("Elena", "Marín", "Pérez");
		
		Persona p12 = new Persona("Sara", "Marín", "Pérez");

		Persona p13 = new Persona("NoCabe", "Marín", "Pérez");


		noria.subirPersona(p5);
		noria.subirPersona(p6);
		noria.subirPersona(p7);
		noria.subirPersona(p8);
		noria.subirPersona(p9);
		noria.subirPersona(p10);
		noria.subirPersona(p11);
		noria.subirPersona(p12);
		noria.subirPersona(p13);		
		
		noria.listaPersonasEnLaNoria();

		
	}

}
