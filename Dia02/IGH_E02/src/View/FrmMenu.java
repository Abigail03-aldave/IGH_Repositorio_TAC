package View;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Servicios.Servicios;

public class FrmMenu extends JFrame implements ActionListener {

	private JPanel Panel;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JTextField txtPorcentaje;
	private JTextField txtGastos;
	private JTextField txtIngresos;
	private JTextField txtGanancia;
	private JTextField txtPrecioPorCaja;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMenu frame = new FrmMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 450);
		Panel = new JPanel();
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		Panel.setLayout(null);
		
		JLabel lblSistemaDeCalculo = new JLabel("SISTEMA DE CALCULO");
		lblSistemaDeCalculo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSistemaDeCalculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSistemaDeCalculo.setBounds(10, 11, 632, 31);
		Panel.add(lblSistemaDeCalculo);
		
		JLabel lblCantidadDeCajas = new JLabel("Cantidad de Cajas de fresa");
		lblCantidadDeCajas.setBounds(26, 69, 189, 14);
		Panel.add(lblCantidadDeCajas);
		
		JLabel lblPrecioDeCompra = new JLabel("Precio de compra por caja ");
		lblPrecioDeCompra.setBounds(26, 109, 137, 14);
		Panel.add(lblPrecioDeCompra);
		
		JLabel lblPorcentajeDeGanancia = new JLabel("Porcentaje de ganancia ");
		lblPorcentajeDeGanancia.setBounds(26, 152, 166, 14);
		Panel.add(lblPorcentajeDeGanancia);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(206, 66, 123, 20);
		Panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(206, 106, 123, 20);
		Panel.add(txtPrecio);
		
		txtPorcentaje = new JTextField();
		txtPorcentaje.setColumns(10);
		txtPorcentaje.setBounds(206, 149, 123, 20);
		Panel.add(txtPorcentaje);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 198, 613, 185);
		Panel.add(panel);
		panel.setLayout(null);
		
		JLabel lblGastosTotales = new JLabel("Gastos totales");
		lblGastosTotales.setBounds(41, 27, 146, 14);
		panel.add(lblGastosTotales);
		
		JLabel lblIngresosTotales = new JLabel("Ingresos totales");
		lblIngresosTotales.setBounds(41, 55, 146, 14);
		panel.add(lblIngresosTotales);
		
		JLabel lblGanancia = new JLabel("Ganancia");
		lblGanancia.setBounds(41, 94, 46, 14);
		panel.add(lblGanancia);
		
		JLabel lblPrecioPorVenta = new JLabel("Precio por venta por caja");
		lblPrecioPorVenta.setBounds(41, 140, 202, 14);
		panel.add(lblPrecioPorVenta);
		
		txtPrecioPorCaja = new JTextField();
		txtPrecioPorCaja.setBounds(182, 137, 123, 20);
		panel.add(txtPrecioPorCaja);
		txtPrecioPorCaja.setEditable(false);
		txtPrecioPorCaja.setColumns(10);
		
		txtGanancia = new JTextField();
		txtGanancia.setBounds(182, 91, 123, 20);
		panel.add(txtGanancia);
		txtGanancia.setEditable(false);
		txtGanancia.setColumns(10);
		
		txtIngresos = new JTextField();
		txtIngresos.setBounds(182, 52, 123, 20);
		panel.add(txtIngresos);
		txtIngresos.setEditable(false);
		txtIngresos.setColumns(10);
		
		txtGastos = new JTextField();
		txtGastos.setBounds(182, 24, 123, 20);
		panel.add(txtGastos);
		txtGastos.setEditable(false);
		txtGastos.setColumns(10);
		
		btnCalcular = new JButton("Calcular ");
		btnCalcular.addActionListener(this);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnCalcular.setBounds(456, 69, 146, 31);
		Panel.add(btnCalcular);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(e);
		}
	}
	protected void actionPerformedBtnCalcular(ActionEvent e) {
		
		//Variables
		double gastosTotales, ingresoTotales,ganancia,precioVenta, precioCajas,porcentaje;
		int cantidadCajas;
		//Datos
				precioCajas = Double.parseDouble(txtPrecio.getText());
				cantidadCajas = Integer.parseInt(txtCantidad.getText());
				porcentaje= Double.parseDouble(txtPorcentaje.getText());
				
				// Proceso
				Servicios service = new Servicios();
				gastosTotales = service.CalcGastosTotales(cantidadCajas, precioCajas);
				ingresoTotales = service.CalcIngresosTotales(gastosTotales, porcentaje);
				ganancia = service.CalcGanancias(gastosTotales, ingresoTotales);
				precioVenta = service.CalcPrecioVenta(ingresoTotales, cantidadCajas);
				// Reporte
				txtGastos.setText(""+gastosTotales);
				txtIngresos.setText(""+ingresoTotales);
				txtGanancia.setText(""+ganancia);
				txtPrecioPorCaja.setText(""+precioVenta);
		
			
	}
}
