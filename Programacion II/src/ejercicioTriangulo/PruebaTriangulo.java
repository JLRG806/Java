package ejercicioTriangulo;

import java.util.Scanner;

public class PruebaTriangulo {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Cantidad de triangulos");
		int cantidadTriangulos = input.nextInt();
		Triangulo[] obj = new Triangulo[cantidadTriangulos];

		for (int i = 0; i < obj.length; i++) {
			obj[i] = new Triangulo();

			System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			System.out.println("Triangulo #" + (i + 1));
			System.out.println("Que desea calcular?");
			System.out.println("1) Area");
			System.out.println("2) Perimetro");
			System.out.println("Ingrese la opcion literal:");
			int opcionMenu = input.nextInt();

			switch (opcionMenu) {
			case 1:
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Area");

				System.out.println("Ingrese el valor de la Base");
				obj[i].setBase(input.nextDouble());

				System.out.println("Ingrese el valor de la Altura");
				obj[i].setH(input.nextDouble());

				System.out.println("El area dl triangulo es de: " + obj[i].calcularArea());

				input.nextLine();
				break;
			case 2:
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Perimetro");

				System.out.println("Ingrese el valor del lado A");
				obj[i].setLadoA(input.nextDouble());

				System.out.println("Ingrese el valor del lado B");
				obj[i].setLadoB(input.nextDouble());

				System.out.println("Ingrese el valor del lado C");
				obj[i].setLadoC(input.nextDouble());

				System.out.println("El perimetro del triangulo es de: " + obj[i].calcularPerimetro());

				input.nextLine();

				break;
			default:
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
				System.out.println("Opcion Incorrecta");
			}
		}

		System.exit(0);

	}
}
