import javax.swing.JOptionPane;

public class Ejercicio3 {
	
	public void iniciar() {
		int num = aleatorio();
		JOptionPane.showMessageDialog(null,"Numero aleatorio entre 1 y 100\n" +num);
	}
	
	public int aleatorio() {
		int num = (int) (Math.random()*100+1);
		return num;
	}
}
