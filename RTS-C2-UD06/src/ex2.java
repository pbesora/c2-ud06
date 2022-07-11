import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		
		String resultado="";
		
		int cont = Integer.parseInt(JOptionPane.showInputDialog("Cuantos números quieres generar?"));
		
		int min = Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Valor máximo"));
		
		for(int i=0; i<cont; i++) {
			resultado += generarNumerosEntre(min, max) + " ";
		}

		JOptionPane.showMessageDialog(null, "Números generados: " + resultado);
	}
	
	public static int generarNumerosEntre(int min, int max) {
		
		int dif = max - min + 1;
		
		dif = min + (int) (dif * Math.random());
		
		return dif;
		
	}

}
