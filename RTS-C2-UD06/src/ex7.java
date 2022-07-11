import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		
		double euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de euros:"));
		
		String moneda = JOptionPane.showInputDialog("Introduce la segunda moneda(dolars-1, yenes-2, libras-3):");

		cambiarEurosA(euros, moneda);

	}
	
	public static void cambiarEurosA(double euros, String moneda) {
		
		switch(moneda) {
			case "1":	//dolares
				JOptionPane.showMessageDialog(null,  String.format("%,.2f",euros) + " euros son " + String.format("%,.2f",(euros*1.28611)) + " dólares.");
				break;
			case "2":	//yenes
				JOptionPane.showMessageDialog(null,  String.format("%,.2f",euros) + " euros son " + String.format("%,.2f",(euros*129.852)) + " yenes.");
				break;
			case "3":	//libras
				JOptionPane.showMessageDialog(null,  String.format("%,.2f",euros) + " euros son " + String.format("%,.2f",(euros*0.86)) + " libras.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Moneda no válida");
				break;
		}
	}
	
	

}
