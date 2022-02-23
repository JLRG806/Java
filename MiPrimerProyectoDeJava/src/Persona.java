 
public class Persona {
	
	//Attributes
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String tel;
	
	//Constructors
	
	public Persona() {
		nombre = null;
		apellido1 = null;
		apellido2 = null;
		tel = null;		
	}
	
	//Methods
	
	public void setName(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSecondName1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public void setSecondName2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public void setTelephone(String tel) {
		this.tel = tel;
	}
		
	public String getName() {
		return this.nombre;
	}
	
	public String getSecondName1() {
		return this.apellido1;
	}
	
	public String getSecondName2() {
		return this.nombre;
	}
	
	public String getTelephone() {
		return this.tel;
	}
	
	
			
}