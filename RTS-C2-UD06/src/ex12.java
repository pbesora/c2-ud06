import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		
		int size, digito;
		
		size = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de la array:"));
		digito = Integer.parseInt(JOptionPane.showInputDialog("Introduce el último dígito para filtrar:"));
		
		
		mostrarResultado(crearArray(size), digito);

	}

	
	public static int[] crearArray(int size) {
		
		int num;
		int numeros[] = new int[size];
		
		for(int i=0; i<size; i++) {
			num=0;
			num = 1 + (int) (301 * Math.random());	
			numeros[i]= num;
		}
		
		return numeros;
	}
	
	public static void mostrarResultado(int[] array, int ultimo) {
		
		int[] resultado = new int[array.length];
		int newSize=0;
		String text="";
		
		if(ultimo<10 && ultimo>=0) {		//mira que sea un solo digito positivo
			for(int i=0; i<array.length; i++) {
				if((array[i]%10) == ultimo) {
					resultado[newSize] = array[i];
					newSize++;
				}
			}
			
			if(newSize!=0) {						//si ha encontrado algun valor lo muestra
				for(int i=0; i<newSize; i++) {		
					text = text + "  " + resultado[i];
				}
				JOptionPane.showMessageDialog(null, "NuevoArray =" + text);
			}else {
				JOptionPane.showMessageDialog(null, "No se han encotrado valores válidos."); //si no muestra este mensaje
			}
		}else {
			JOptionPane.showMessageDialog(null, "Dígito incorrecto.");
		}
		
	}
}
