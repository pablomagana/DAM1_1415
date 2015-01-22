
public class JulioCesar {

	public static void main(String[] args) {
		char base[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char textocod[]={'e','s','b','d','v','m','b'};
		int k=1;
		for (int i=0;i<textocod.length;i++){
			for(int j=0;j<base.length;j++){
				if(textocod[i]==base[j]){
					if((j-k)<0){
						System.out.print(base[base.length-k]);
				}else{
					System.out.print(base[j-k]);
				}
			}
		}
		}
	}
	
	
}
