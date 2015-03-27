
public class cesarAfin {
	int c;
	String textoBase;
	String textoADevolver;
	char[] lletres={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	int[] desordenatNombres=new int[27];
	
	public cesarAfin(){
		super();
	}
	
	public String encriptador(int a,int b,String texto){
		this.textoBase=texto;
		this.textoADevolver="";
		//for(int i=0;i<lletres.length;i++){
			//c=((a*i)+b)%27;
			//desordenatNombres[i]=c;
		//}
		for(int i=0;i<textoBase.length();i++){
			for(int j=0;j<lletres.length;j++){
				if(textoBase.charAt(i)==lletres[j]){
					c=((a*j)+b)%27;
					textoADevolver=textoADevolver+lletres[c];
				};
			}
		}
		System.out.println(textoADevolver);
		return textoADevolver;
	}
	
	public String desEncriptador(int a,int b,String texto){
		this.textoBase=texto;
		this.textoADevolver="";
		int x;
		for(int i=0;i<textoBase.length();i++){
			for(int j=0;j<lletres.length;j++){
				if(textoBase.charAt(i)==lletres[j]){
					c=((a*j)+b)%27;
					x=((c-b)*(1/a))%27;
					System.out.println("c="+c+",x"+x);
					textoADevolver=textoADevolver+lletres[x];
					
				}
			}
		}
		System.out.println(textoADevolver);
		return textoADevolver;
	}
	
}
