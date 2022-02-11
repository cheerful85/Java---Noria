package p00II;

public class Noria {

	private int capacidad;
	private int personasDentro;
	private boolean enMovimiento;
	private int posicion=0;
	private Persona asientos[];

	public Noria(int capacidad) {
		super();
		this.capacidad = capacidad;
		enMovimiento = false;
		for(int i=0; i<capacidad; i++)
			//asientos[i] = new Persona();
			asientos = new Persona[capacidad];
	}		

	
	public void girar() {
		System.out.println("La noria está girando, no puede subir o bajar nadie.");
		enMovimiento = true;
	}
	
	public void parar() {
		System.out.println("Se detiene el movimiento de la noria");
		enMovimiento = false;
	}
	
	public boolean subirPersona(Persona p) {
		if (this.getEnMovimiento()) {
			System.out.println("La noria esta en movimiento. No se puede subir");
			return false;
		}else {
			if (this.getPersonasDentro()==this.getCapacidad()) {
				System.out.println("La noria esta llena. No se puede subir");
				return false;
			}else {
				System.out.println("Se sube una persona a la Noria mas");
				this.personasDentro++;
				for(int i=0; i<capacidad;i++)
					if(asientos[i] == null) {
						posicion=i;
						break;
					}
				asientos[posicion] = p;
				posicion++;
				return true;
			}
		}
	}
	
	public boolean bajarPersona(Persona p) {
		if (this.getEnMovimiento()) {
			System.out.println("La noria esta en movimiento. No se puede bajar");
			return false;
		}else {
			if (this.getPersonasDentro()==0) {
				System.out.println("La noria esta vacia. No se puede bajar");
				return false;
			}else {
				System.out.println("Se baja una persona a la Noria");
				for(int i=0;i<capacidad; i ++) {
					if(asientos[i]!=null)
						if(p.getNombreCompleto().equals(asientos[i].getNombreCompleto())) 
							asientos[i]=null;
				}
				System.out.println("Persona que baja: " + p.getNombreCompleto());
				this.personasDentro--;
				return true;
			}
		}
	}
	
	public void listaPersonasEnLaNoria() {
		System.out.println("---------- Recuento de personas en la noria ----------");
		System.out.println("Numero total de personas en la Noria " + this.personasDentro);
		
		for(int i=0;i<capacidad;i++) {
			if(asientos[i] != null)
				System.out.println("Posicion " + i + ": " + asientos[i].getNombreCompleto());
			else
				System.out.println("Posicion " + i + ": " + "vacio");
		}
		
		System.out.println("---------- Fin del recuento ----------");
	}
	
	public boolean getEnMovimiento() {
		return enMovimiento;
	}

	public int getPersonasDentro() {
		return personasDentro;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
}
