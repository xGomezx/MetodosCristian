import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public void iniciar() {
		
		 ArrayList<Integer> numeros=pedirNumeros();
		 int mayor = numMayor(numeros);
		 JOptionPane.showMessageDialog(null, "El numero mayor de los numeros resividos es\n"+mayor);
	}
	
	public ArrayList<Integer> pedirNumeros() {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		String continuar;
		int numero = 0;
		do {
			
			numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desee"));
			num.add(numero);
			continuar = JOptionPane.showInputDialog("Ingrese SI, si desea ingresar otro numero");
			
		} while (continuar.equalsIgnoreCase("si"));
		
		return num;
	}
	
	public int numMayor( ArrayList<Integer> num) {
		
		int mayor=0;
		
		for (int i = 0; i < num.size(); i++) {
			mayor=num.get(i);
			
			for (int j = 0; j < num.size(); j++) {
				if (mayor < num.get(j)) {
					mayor = num.get(j);
				}
			}
		}
		return mayor;
	}
}
