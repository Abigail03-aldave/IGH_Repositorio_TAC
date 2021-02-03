package Servicios;

public class Servicios {
	
	public double CalcGastosTotales(int cantidadCajas, double precioCajas){
		double gastos;
		gastos=cantidadCajas*precioCajas*1.05;
		
		return gastos;
	}
	public double CalcIngresosTotales(double gastos, double porcentaje){
		double ingreso;
		
		ingreso=gastos*(100+porcentaje)/100;
		
		return ingreso;
	}
	public double CalcGanancias(double gastos, double ingresoTotal){
		double ganancia;
		ganancia= ingresoTotal - gastos;
		return ganancia;
	}
	public double CalcPrecioVenta(double ingresoTotal, int cantidadCajas){
		double precioVenta;
		precioVenta=ingresoTotal/cantidadCajas;
		return precioVenta;
	}
}
