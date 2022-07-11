import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {

		int min =  Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo del array:"));
		int max =  Integer.parseInt(JOptionPane.showInputDialog("Valor máximo del array:"));
		
		mostrarResultado(crearArray(min, max));

	}
	
	public static int[] crearArray(int min, int max) {
		
		int dif = max - min + 1;
		int num;
		
		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la array"));
		
		int numeros[] = new int[size];
		
		for(int i=0; i<size; i++) {
			num=0;
			num = min + (int) (dif * Math.random());	
			numeros[i]= num;
		}
		
		return numeros;
	}
	
	public static void mostrarResultado(int[] numeros) {
		
		int suma=0;
		
		for(int i=0; i<numeros.length; i++) {
			JOptionPane.showMessageDialog(null, "Array[" + i + "] = " + numeros[i]);
			suma += numeros[i];
		}
		
		JOptionPane.showMessageDialog(null, "Suma del array: " + suma);
		
	}

}
