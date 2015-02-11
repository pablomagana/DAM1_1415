public class matriu {
	private static char matriua[][];
    private static final int FILES=15;
    private static final int COLUMNES=15;
    //private static String paraules[]={"IVAN","HA","FOTUT","EL","MAC"};
    private static char lletres[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public matriu(){
    	
    }
	public static void main(String[] args) {
		matriua= new char[FILES][COLUMNES];	
    	inicializaMatriu();
		ompliMatriu();
		mostraMatriu();
	}
	public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
	public static void inicializaMatriu(){
		for(int i=0;i<COLUMNES;i++){
			for(int j=0;j<FILES;j++){
				matriua[i][j]='*';
			}
		}
	}
	public static void ompliMatriu(){
        for(int i=0;i<COLUMNES;i++){
            for(int j=0;j<FILES;j++){
            	int nume=generaNumeroAleatorio(0,lletres.length-1);
            	
                matriua[i][j]=lletres[nume];
           	}
        }
	}
	 public static void mostraMatriu(){
	        for(int i=0;i<FILES;i++){
	            for(int j=0;j<COLUMNES;j++){
	                System.out.print(""+matriua[i][j]+" ");
	            }
	            System.out.println("");
	        }
	 }
}
