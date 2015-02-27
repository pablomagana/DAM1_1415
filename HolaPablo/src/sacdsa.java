import javax.security.auth.callback.TextOutputCallback;
import javax.swing.JOptionPane;


public class sacdsa {
static char letras[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' '};
static int[] codigos=new int[letras.length];
static int grupo=4;
static int fila=7;
static char letra;
static String textoACodificar="";
static String textoCodificado="";

	public static void main(String[] args) {
		codificador();
		codificar(JOptionPane.showInputDialog(null,"escribe la frase que quieres codificar"));
	}	
		
		
	public static void codificador(){
		int posicion=0;
		for(int i=fila;i>0;i--){
			for(int j=grupo;j>0;j--){
				codigos[posicion]=(i*10)+j;
				posicion++;
			}
			
		}
		
		//for(int i=0;i<letras.length;i++){
		//	System.out.print(" "+codigos[i]+" ");
		//}
		//System.out.println();
	}
	
	public static void codificar(String aCodificar){
		textoACodificar=aCodificar;
		for(int i=0;i<textoACodificar.length();i++){
			letra=textoACodificar.charAt(i);
			for(int j=0;j<letras.length;j++){
				if(letra==letras[j]){
					textoCodificado=textoCodificado+codigos[j];
				}
			}
		}
		System.out.println("el texto codificado es: "+textoCodificado);
	}
}
