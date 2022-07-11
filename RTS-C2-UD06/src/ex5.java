import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número decimal para pasarlo a binario:"));

		JOptionPane.showMessageDialog(null, num + " en binario es " + decimalABinario(num));
	}

	public static String decimalABinario(int num) {
		
		String resultado = "";
		
		if(num==0)			//0 no entraria en el bucle
			return "0";
		
		
		while(num>0) {
			resultado = num%2 + resultado;		//genera la string invertida
			num = num/2;
		}
		
		
		return resultado;
	}
	
}
