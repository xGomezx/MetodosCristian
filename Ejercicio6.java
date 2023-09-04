import javax.swing.JOptionPane;

public class Ejercicio6 {
	
	public void iniciar() {
		
		int num1[]=pedirLista1();
		int num2[]=pedirLista2();
		
		int suma[]=suma(num1,num2);
		String mensaje="";
		for (int i = 0; i < suma.length; i++) {
			mensaje+=suma[i]+"\n";
		}
		JOptionPane.showMessageDialog(null,"El arreglo de las sumas es \n"+mensaje);
	}
	
	int cantidad;
	public int[] pedirLista1() {
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros que desea ingresar"));
		
		int numeros1[]= new int[cantidad];
		
		
		for (int i = 0; i < cantidad; i++) {
			numeros1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(i+1)+" de la primera lista"));
		}
		return numeros1;
	}
	
	public int[] pedirLista2() {
		
		int numeros2[]=new int[cantidad];
		
		for (int j = 0; j < cantidad; j++) {
			numeros2[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(j+1)+" de la segunda lista"));
		}
		
		return numeros2;
	}
	
	public int[] suma(int numeros1[], int numeros2[]) {
		
		int resultado[]=new int[cantidad];
		
		for (int i = 0; i < numeros1.length; i++) {
			resultado[i]=numeros1[i]+numeros2[i]; 
		}
		
		return resultado;
	}
}
