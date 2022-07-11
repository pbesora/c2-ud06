import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {
		
		mostrarArray(crearArray());

	}
	
	public static int[] crearArray() {
		int numeros[] = new int [10];
		
		for(int i=0; i<10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(" + (i+1) + "/10):"));
		}
		
		return numeros;
	}
	
	public static void mostrarArray(int[] numeros) {
		
		for(int i=0; i<10; i++) {
			JOptionPane.showMessageDialog(null, "Array[" + i + "] = " + numeros[i]);
		}
	}

}
