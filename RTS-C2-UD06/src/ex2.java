import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		
		String resultado="";
		
		int cont = Integer.parseInt(JOptionPane.showInputDialog("Cuantos n�meros quieres generar?"));
		
		int min = Integer.parseInt(JOptionPane.showInputDialog("Valor m�nimo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Valor m�ximo"));
		
		for(int i=0; i<cont; i++) {
			resultado += generarNumerosEntre(min, max) + " ";
		}

		JOptionPane.showMessageDialog(null, "N�meros generados: " + resultado);
	}
	
	public static int generarNumerosEntre(int min, int max) {
		
		int dif = max - min + 1;
		
		dif = min + (int) (dif * Math.random());
		
		return dif;
		
	}

}
