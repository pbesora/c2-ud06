import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para calcular el factorial:"));
		
		JOptionPane.showMessageDialog(null, "El factorial de " + num + " es " + String.format("%,d", calcularFactorial(num)));

	}
	
	public static int calcularFactorial(int num) {
		
		int resultado=1;
		
		if(num==0)
			return 0;
		
		for(int i=1; i<=num; i++) {
			resultado = resultado * i;
		}
		
		return resultado;
	}

}
