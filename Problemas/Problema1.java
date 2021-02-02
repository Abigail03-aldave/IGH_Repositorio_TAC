package IGH_E01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Proyecto01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Datos
				int a,b; 
				int suma,resta,division,multiplicacion; 
				
				//Entrada de datos
				a=10;
				b=5;
				//proceso
				suma= a+b;
				resta=a-b;
				division=a/b;
				multiplicacion=a*b;
				
				//imprimir datos
				System.out.println("La suma es ...."+ suma);
				System.out.println("La resta es ...."+ resta);
	}

	


}
