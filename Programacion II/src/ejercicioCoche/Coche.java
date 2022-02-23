package ejercicioCoche;

public class Coche {

	// Attributes
	private Integer caballos;
	private String color;
	private String marca;
	private String matricula;
	private String modelo;
	private Integer puertas;

	// Constructor

	public Coche() {
		this.caballos = 0;
		this.color = null;
		this.marca = null;
		this.matricula = null;
		this.modelo = null;
		this.puertas = 0;

	}
	
	// Getters and setters

	public Integer getCaballos() {
		return caballos;
	}

	public String getColor() {
		return color;
	}

	public String getMarca() {
		return marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getPuertas() {
		return puertas;
	}

	public void setCaballos(Integer caballos) {
		this.caballos = caballos;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	// Methods

}
