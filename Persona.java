package p00II;

public class Persona {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private double altura;

	public Persona() {
		super();
	}
	 
	public Persona(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public String getNombreCompleto() {
		return nombre + " " + apellido1 + " " + apellido2;
	}
	
	public String getNombreCompletoFormato() {
		return apellido1 + " " + apellido2 + ", " + nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
