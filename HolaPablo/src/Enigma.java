import javax.swing.JOptionPane;


public class Enigma {
	
	
	public static void main(String[] args) {
		
	int a=Integer.parseInt(JOptionPane.showInputDialog("escribe un valor para generar el odificador"));
	int b=Integer.parseInt(JOptionPane.showInputDialog("escribe otro valor para generar el odificador"));
	String texto=JOptionPane.showInputDialog(null, "escribe la frase a codificar");
	
	cesarAfin cesarafin=new cesarAfin();
	
	cesarafin.encriptador(a, b, texto);
	String texto2=JOptionPane.showInputDialog(null, "escribe la frase a decodificar");
	cesarafin.desEncriptador(a, b, texto2);
	}

}
