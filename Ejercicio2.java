import javax.swing.JOptionPane;

public class Ejercicio2 {

	public void mayor10(int num){
		do {
			
		
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desee"));
			
			if (num > 10) {
				JOptionPane.showMessageDialog(null, "El numero es mayor que 10 y es el:\n"+num);
			} else {
				JOptionPane.showMessageDialog(null, "El numero es menor que 10\n intenta de nuevo");
			}
		} while (num<10);
	}
}
