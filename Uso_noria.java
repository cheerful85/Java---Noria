package p00II;

public class Uso_noria {

	public static void main(String[] args) {

		Noria noria = new Noria(10);
		
		noria.girar();
		
		noria.listaPersonasEnLaNoria();
		
		Persona p1 = new Persona("Juan", "Garc�a", "Andreu");
		Persona p2 = new Persona("John", "Smith", null);
		Persona p3 = new Persona("Laura", "Mar�n", "P�rez");
		
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

		Persona p5 = new Persona("Juana", "Mar�n", "P�rez");

		Persona p6 = new Persona("Pepa", "Mar�n", "P�rez");

		Persona p7 = new Persona("Sandra", "Mar�n", "P�rez");

		Persona p8 = new Persona("Maria", "Mar�n", "P�rez");

		Persona p9 = new Persona("Dolores", "Mar�n", "P�rez");

		Persona p10 = new Persona("Ultima", "Mar�n", "P�rez");

		Persona p11 = new Persona("Elena", "Mar�n", "P�rez");
		
		Persona p12 = new Persona("Sara", "Mar�n", "P�rez");

		Persona p13 = new Persona("NoCabe", "Mar�n", "P�rez");


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
