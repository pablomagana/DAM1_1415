
public class sacdsa {

	public static void main(String[] args) {
		char letras[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' '};
		int[] codigos=new int[letras.length];
		int grupo=4;
		int fila=7;
		
		int posicion=0;
		for(int i=fila;i>0;i--){
			for(int j=grupo;j>0;j--){
				codigos[posicion]=(i*10)+j;
				posicion++;
			}
			
		}
		
		for(int i=0;i<letras.length;i++){
			System.out.print(" "+codigos[i]+" ");
		}
		System.out.println();
		String textoACodificar="hola mundo";
		String textoCodificado="";
		char letra;
		for(int i=0;i<textoACodificar.length();i++){
			letra=textoACodificar.charAt(i);
			for(int j=0;j<letras.length;j++){
				if(letra==letras[j]){
					textoCodificado=textoCodificado+letras[j];
				}
			}
		}
		System.out.println("el texto codificado es: "+textoCodificado);
	}
}
