package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.Auto;
import model.Moto;
import model.Vehiculo;

public class Test {

	public static void main(String[] args) {
		List<Vehiculo> listaVehiculos = getVehiculos();

		listaVehiculos.stream().forEach(System.out::println);
		System.out.println("=============================");

		Vehiculo caro = listaVehiculos.stream().max(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
		System.out.println("Vehiculo mas caro: " + caro.getMarca() + " " + caro.getModelo());

		Vehiculo barato = listaVehiculos.stream().min(Comparator.comparingDouble(Vehiculo::getPrecio)).get();
		System.out.println("Vehiculo mas barato: " + barato.getMarca() + " " + barato.getModelo());

		Vehiculo letraY = listaVehiculos.stream().filter(v -> v.getModelo().contains("Y")).findFirst().get();
		System.out.println("Vehiculo que contiene en el modelo la letra 'Y': " + letraY.getMarca() + " "
				+ letraY.getModelo() + " $" + letraY.getPrecio());

		System.out.println("=============================");

		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		listaVehiculos.stream().sorted((p1, p2) -> p2.getPrecio().compareTo(p1.getPrecio()))
				.forEach(vehiculo -> System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo()));
	}

	private static List<Vehiculo> getVehiculos() {
		List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
		listaVehiculos.add(new Auto("Peugeot", "206", 20000.0d, 4));
		listaVehiculos.add(new Moto("Honda", "Titan", 60000, 125));
		listaVehiculos.add(new Auto("Peugeot", "208", 2500000, 5));
		listaVehiculos.add(new Moto("Yamaha", "YBR", 80500.50d, 160));
		return listaVehiculos;
	}
}
