import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		
		String forma = JOptionPane.showInputDialog("Figura para calcular el area(C�rculo-1, Cuadrado-2 o Tri�ngulo-3)");
		
		switch(forma) {
			case "1":
				double radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del c�rculo:"));
				JOptionPane.showMessageDialog(null, "El �rea del c�rculo es " + String.format("%,.2f",areaCirculo(radio)));
				break;
			case "2":
				double lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado:"));
				JOptionPane.showMessageDialog(null, "El �rea del cuadrado es " + String.format("%,.2f",areaCuadrado(lado)));
				break;
			case "3":
				double base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del tri�ngulo:"));
				double altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del tri�ngulo:"));
				JOptionPane.showMessageDialog(null, "El �rea del cuadrado es " + String.format("%,.2f",areaTriangulo(base, altura)));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Esta opci�n no es v�lida");
				break;
		}

	}

	public static double areaCirculo(double radio) {
		
		double resultado = (radio * radio) * Math.PI;
		
		return resultado;
	}
	
	public static double areaCuadrado(double lado) {
		
		double resultado = lado * lado;
		
		return resultado;
	}

	public static double areaTriangulo(double base, double altura) {
	
		double resultado = (base * altura)/2;
		
		return resultado;
	}
}
