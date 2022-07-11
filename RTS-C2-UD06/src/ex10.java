import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {

		int min =  Integer.parseInt(JOptionPane.showInputDialog("Valor mínimo del array:"));
		int max =  Integer.parseInt(JOptionPane.showInputDialog("Valor máximo del array:"));
		
		mostrarResultado(crearArray(min, max));

	}

	public static boolean esPrimo(int num) {
		
		if(num==0 || num==1)	
			return false;
		
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		
		 return true;
	}
	
	public static int[] crearArray(int min, int max) {
		
		int dif = max - min + 1;
		int num;
		int size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la array"));
		
		int numeros[] = new int[size];
		
		for(int i=0; i<size; i++) {
			num=0;
			do {
				num = min + (int) (dif * Math.random());		//busca los primos
				
			}while(!esPrimo(num));
			
			numeros[i]= num;
		}
		
		return numeros;
	}
	
	public static void mostrarResultado(int[] numeros) {
		
		int max=0;
		
		for(int i=0; i<numeros.length; i++) {
			JOptionPane.showMessageDialog(null, "Array[" + i + "] = " + numeros[i]);
			
			if(numeros[i]>max)			//guarda el valor maximo
				max = numeros[i];
		}
		
		JOptionPane.showMessageDialog(null, "Número máximo: " + max);
		
	}
	
	
}
