package ejercicioTiempo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tiempo {

	// Attributes

	private Integer horas;
	private Integer minutos;
	private Integer segundos;

	// Constructor

	public Tiempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}

	// Methods

	public String actualTime() {
		LocalTime time = LocalTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = time.format(myFormatObj);
		return formattedTime;
	}

}
