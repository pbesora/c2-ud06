import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para saber si es primo:"));
		
		if(esPrimo(num))
			JOptionPane.showMessageDialog(null, num + " es primo.");
		else
			JOptionPane.showMessageDialog(null, num + " NO es primo.");

	}

	
	public static boolean esPrimo(int num) {
		
		if(num==0 || num==1)	//no son primos
			return false;
		
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		
		 return true;
	}
}
