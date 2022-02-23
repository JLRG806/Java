package ejercicioTriangulo;

public class Triangulo {

	/**
	 * Crear una clase Rectangulo, con atributos base y altura. Crear también el
	 * constructor de la clase y los métodos necesarios para calcular el área y el
	 * perímetro. Crear otra clase PruebaRectangulo que pruebe varios rectángulos y
	 * muestre por pantalla sus áreas y perímetros.
	 */

	private double ladoA;
	private double ladoB;
	private double ladoC;
	private double base;
	private double h;

	public Triangulo() {
		this.ladoA = 0;
		this.ladoB = 0;
		this.ladoC = 0;
		this.base = 0;
		this.h = 0;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setH(double h) {
		this.h = h;
	}

	// Methods

	public double calcularArea() {
		double areaTriangulo = (base * h) / 2;
		return areaTriangulo;
	}

	public double calcularPerimetro() {
		double perimetroTriangulo = ladoA + ladoB + ladoC;
		return perimetroTriangulo;
	}

}
