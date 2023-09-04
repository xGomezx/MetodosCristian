import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	
	public void iniciar() {
		acciones();
	}
	
	public void acciones() {
		String mensaje = "";
		int opcion;
		mensaje += "Elije que accion deseas realizar mediante el numero de cada accion\n\n";
		mensaje += "1: Asignar estudiante y nota\n";
		mensaje += "2: Consultar estudiante y nota\n";
		mensaje += "3: Salir\n\n";
		mensaje += "Ingrese la opcion que desee";
		do {

			opcion=Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			
			switch (opcion) {
			case 1:
				agregar();
				break;
			case 2:
				consultar();
				break;
			case 3:
				opcion=3;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida","ERROR",JOptionPane.WARNING_MESSAGE);
				break;
			}
	
		} while (opcion!=3);
		
	}
	Hashtable<String, Double> info = new Hashtable<String, Double>();
	
	public void agregar() {
		
		String nombre="",continuar="";
		Double nota = 0.0;
		
		do {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del estduiante");
			nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
			
			info.put(nombre, nota);
			continuar=JOptionPane.showInputDialog("Ingrese SI, si desea agregar otro estudiante");
			
		} while (continuar.equalsIgnoreCase("si"));
		iniciar();
	}
	
	public void consultar() {
		String cual = "";
		String continuar="";
		
		do {
			cual = JOptionPane.showInputDialog("Ingresa el estudiante que deseas consultar");
			
			if (info.containsKey(cual)) {
				JOptionPane.showMessageDialog(null,"<<<<<<<<<Informacion>>>>>>\n\n"+cual+" nota: "+ info.get(cual));
			} else {
				JOptionPane.showMessageDialog(null, "El estudiante no existe intenta de nuevo");
			}
			
			continuar=JOptionPane.showInputDialog("Ingrese SI, si desea buscar otro estudiante");
		} while (continuar.equalsIgnoreCase("SI"));
		iniciar();
	}
}
