import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero positivo para contar las cifras:"));
		
		if(num>=0)
			JOptionPane.showMessageDialog(null, num + " tiene " + numeroDeCifras(num) + " cifras.");
		else
			JOptionPane.showMessageDialog(null, num + "no cumple los requisitos");
	}
	
	public static int numeroDeCifras(int num) {
		
		int digitos = 1;
		
		while(num>9) {
			num = num/10;
			digitos++;
		}
		
		return digitos;
	}

}
