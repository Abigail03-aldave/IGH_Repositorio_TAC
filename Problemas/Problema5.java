package IGH_E01;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Programa02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Datos
		int cantidad;
		double precio,importeVenta, impuestoLey,totalVenta;
		String producto;
		
		
		//Entrada de datos
		cantidad=20;
		precio=19.0;
		producto= "Detergente";
		
		
		//proceso
		totalVenta=precio*cantidad;
		importeVenta=totalVenta/1.18;
		impuestoLey=totalVenta - importeVenta ;
	
		
		//imprimir datos
		System.out.println("El nombre del producto es ...."+ producto);
		System.out.println("El total de la venta es ...."+ totalVenta);
		System.out.println("El importe de venta ...."+ importeVenta);
		System.out.println("El impuesto de Ley es ...."+ impuestoLey);
		
	}

	

}
