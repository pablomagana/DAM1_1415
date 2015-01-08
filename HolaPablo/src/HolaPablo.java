import javax.swing.JOptionPane;


public class HolaPablo {
	private static String nombre;
	public static void main(String[] args) {
		nombre=JOptionPane.showInputDialog("tu nombre es...");
		System.out.println("hola "+nombre);

	}

}
