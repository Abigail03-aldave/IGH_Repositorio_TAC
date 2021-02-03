package Pruebas;

import Servicios.Servicios;

public class Prueba {
	public static void main (String[] args){
		//Datos
		double precioCajas = 30.00;
		int cantidadCajas = 200;
		double porcentaje=60;
		
		// Proceso
				Servicios service = new Servicios();
				double gastosTotales = service.CalcGastosTotales(cantidadCajas, precioCajas);
				double ingresosTotales = service.CalcIngresosTotales(gastosTotales, porcentaje);
				double ganancia = service.CalcGanancias(gastosTotales, ingresosTotales);
				double precioVenta = service.CalcPrecioVenta(ingresosTotales, cantidadCajas);
		// Reporte
				System.out.println("Gastos Totales: " + gastosTotales);
				System.out.println("Ingresos Totales: " + ingresosTotales);
				System.out.println("Ganancia: " + ganancia);	
				System.out.println("Precio Venta: " + precioVenta);	
	}
	
	

}
