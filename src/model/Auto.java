
package model;

public class Auto extends Vehiculo {
	public int puertas;

	public Auto(String marca, String modelo, double precio, int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Marca: " + this.marca + " // Modelo: " + this.modelo + " // " + "Puertas: " + this.puertas
				+ " // Precio: $ " + this.precio;
	}
}
