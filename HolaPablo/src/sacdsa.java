import javax.swing.JOptionPane;


public class sacdsa {
static char letras[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z',' ','?','!',',','@'};
static int[] codigos=new int[letras.length];
static int grupo=4;
static int fila=8;
static char letra;
static String textoNoCodificado="";
static String textoCodificado="";

	public static void main(String[] args) {
		//System.out.println(letras.length);
		codificador();
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog(null," 1 para codificar y 2 para decodificar"));
		if(opcion==1){
			codificar(JOptionPane.showInputDialog(null,"escribe la frase que quieres codificar"));
		}else{
			decodificar(JOptionPane.showInputDialog(null,"escribe la frase que quieres decodificar"));
		}
	}	
		
		
	public static void codificador(){
		
		grupo=3;
		for(int g=0;g<(letras.length)/2;g++){
			if(grupo==3){
				codigos[g]=(fila*10)+grupo;
				grupo=1;
			}else{
				codigos[g]=(fila*10)+grupo;
				grupo=3;
				fila--;
			}
		}
		grupo=4;
		fila=8;
		for(int g=(letras.length)/2;g<letras.length;g++){
			if(grupo==4){
				codigos[g]=(fila*10)+grupo;
				grupo=2;
			}else{
				codigos[g]=(fila*10)+grupo;
				grupo=4;
				fila--;
			}
		}
		/*
		for(int i=0;i<letras.length;i++){
		System.out.print(" "+codigos[i]+" ");
		}
		System.out.println();
		for(int i=0;i<letras.length;i++){
			System.out.print(" "+letras[i]+"  ");
		}
		*/
	}
	
	public static String codificar(String aCodificar){
		textoNoCodificado=aCodificar;
		for(int i=0;i<textoNoCodificado.length();i++){
			letra=textoNoCodificado.charAt(i);
			for(int j=0;j<letras.length;j++){
				if(letra==letras[j]){
					textoCodificado=textoCodificado+codigos[j];
				}
			}
		}
		System.out.println("el texto codificado es: "+textoCodificado);
		return textoCodificado;
	}
	
	public static String decodificar(String aDecodificar){
		textoCodificado=aDecodificar;
		textoNoCodificado="";
		int posicion=0;
		String par="";
		int decodeTemporal;
		int ciclos=0;
		
		while(ciclos<textoCodificado.length()){
			par="";
			
			for(int i=0;i<2;i++){
				par=par+textoCodificado.charAt(posicion);
				posicion++;
				ciclos++;
			}
			decodeTemporal=Integer.parseInt(par);
			for(int w=0;w<letras.length;w++){
				if(decodeTemporal==codigos[w]){
					//System.out.print(letras[w]);
					textoNoCodificado=textoNoCodificado+letras[w];
				}
			}
		}
		
		System.out.println("El texto descodificado es:"+textoNoCodificado);
		return textoNoCodificado;
	}
}
