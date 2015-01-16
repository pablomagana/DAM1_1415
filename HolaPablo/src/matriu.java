public class matriu {
	private static char matriua[][];
    private static final int FILES=15;
    private static final int COLUMNES=15;
    private static String paraules[]={"IVAN","HA","FOTUT","EL","MAC"};
    private char lletres[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public matriu(){
    	matriua= new char[FILES][COLUMNES];
    	
    }
	public static void main(String[] args) {
		inicializaMatriu();
		mostraMatriu();
	}
	public static void inicializaMatriu(){
		for(int i=0;i<FILES;i++){
			for(int j=0;j<COLUMNES;j++){
				matriua[i][j]='*';
			}
		}
	}
	public static void ompliMatriu(){
		char lletra=0;
        for(int i=0;i<FILES;i++){
            for(int j=0;j<COLUMNES;j++){
                matriua[i][j]=RamndomNumber;         	
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
