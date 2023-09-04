import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejercicio7 {

		public void iniciar() {
			Hashtable<String, String> palabras = palabras();
			buscar(palabras);
		}
		
		public Hashtable<String, String> palabras() {
			
			Hashtable<String, String> diccionario = new Hashtable<String, String>();
			
			diccionario.put("Hello", "Hola");
			diccionario.put("House", "Casa");
			diccionario.put("Pencil", "Lapiz");
			diccionario.put("Table", "Mesa");
			diccionario.put("Shoes", "Zapatos");
			
			return diccionario;
		}
		
		public void buscar(Hashtable<String, String> palabras) {
			
			String cual = "";
			String continuar="";
			
			do {
				cual = JOptionPane.showInputDialog("Ingresa la palabra que quieres traducir");
				
				if (palabras.containsKey(cual)) {
					JOptionPane.showMessageDialog(null,"<<<<<<<<<Traduccion>>>>>>\n\n"+cual+" = "+ palabras.get(cual));
				} else {
					JOptionPane.showMessageDialog(null, "No existe");
				}
				
				continuar=JOptionPane.showInputDialog("Ingrese SI, si desea continuar");
			} while (continuar.equalsIgnoreCase("SI"));
		}
}
