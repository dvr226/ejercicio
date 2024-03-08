package ejercicio1;

public class televisor {
	String marca;
	int volumen, canal, tamaño;
	String[] entradas;
	boolean encendido;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public String[] getEntradas() {
		return entradas;
	}
	public void setEntradas(String[] entradas) {
		this.entradas = entradas;
	}
	public boolean encendido() {
		int a = 0;
		if (a == 1)
		return true;
		else
			return false;
	}
	public int masvolumen() {
		return volumen++;
	}
	public int menosvolumen() {
		return volumen--;
	}
	public int mascanal() {
		return canal++;
	}
	public int menoscanal() {
		return canal--;
	}
	
}
