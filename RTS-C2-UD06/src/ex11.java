import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {

		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la array"));
		int min =  Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo del array:"));
		int max =  Integer.parseInt(JOptionPane.showInputDialog("Valor máximo del array:"));
		
		int array1[] = new int[size];
		int array2[] = new int[size];
		
		array1 = crearArray(min, max, size);
		
		System.arraycopy(array1, 0, array2, 0, size);
		
		array2 = crearArray(min, max, size);

		mostrarResultado(array1, array2, multiplicarArrays(array1, array2));
	}
	
	public static int[] crearArray(int min, int max, int size) {
		
		int dif = max - min + 1;
		int num;
		
		
		int numeros[] = new int[size];
		
		for(int i=0; i<size; i++) {
			num=0;
				num = min + (int) (dif * Math.random());	
			numeros[i]= num;
		}
		
		return numeros;
	}
	
	public static int[] multiplicarArrays(int[] array1, int[] array2) {
		
		int size = array1.length;
		int producto[] = new int[size];
		
		for(int i=0; i<size; i++) {
			producto[i] = array1[i] * array2[i];
		}
		
		return producto;
	}
	
	public static void mostrarResultado(int[] factor1, int[] factor2, int[] producto) {
		
		int size = factor1.length;
		String resultado = "";
		
		for(int i=0; i<size; i++) {		//mostrar array1
			resultado = resultado + " " + factor1[i];
		}
		JOptionPane.showMessageDialog(null, "Array1=" + resultado);
		
		resultado = "";
		for(int i=0; i<size; i++) {		//mostrar array2
			resultado = resultado + " " + factor2[i];
		}
		JOptionPane.showMessageDialog(null, "Array2=" + resultado);
		
		
		resultado = "";
		for(int i=0; i<size; i++) {		//mostrar arrayProducto
			resultado = resultado + " " + producto[i];
		}
		JOptionPane.showMessageDialog(null, "ArrayProducto=" + resultado);
	}

}
