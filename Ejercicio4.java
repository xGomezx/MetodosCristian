import javax.swing.JOptionPane;

public class Ejercicio4 {
	
	public void iniciar() {
		int numeros[] = ingresarNumeros();
		int mayor=numMayor(numeros);
		JOptionPane.showMessageDialog(null,"El numero mayor es el: "+ mayor);
	}
	
	public int[] ingresarNumeros() {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea ingresar"));
		
		int numeros[]= new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)));
		}
		return numeros;
		
	}
	
	public int numMayor(int numeros[]) {
		
		int mayor=0;
		for (int i = 0; i < numeros.length; i++) {
			mayor = numeros[i];
			
			for (int j = 0; j < numeros.length; j++) {
				if (mayor<numeros[j]) {
					mayor = numeros[j];
				}
			}
		}
		
		return mayor;
	}
}
	
