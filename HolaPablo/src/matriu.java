import javax.swing.JOptionPane;


public class matriu {
	private char sopaDeLletres[][];
    private final int FILES=3;
    private final int COLUMNES=5;
    public matriu(){
    	sopaDeLletres= new char[FILES][COLUMNES];
    	ompliMatriuDeLletres();
    	mostraMatriuDeLletres();
    }
	public static void main(String[] args) {
		
	}
	public void ompliMatriuDeLletres(){
		char lletra='A';
        for(int i=0;i<FILES;i++){
            for(int j=0;j<COLUMNES;j++){
                sopaDeLletres[i][j]=lletra++;
            }
        }
	}
	 public void mostraMatriuDeLletres(){
	        for(int i=0;i<FILES;i++){
	            for(int j=0;j<COLUMNES;j++){
	                //System.out.print(""+sopaDeLletres[i][j]+"-");
	                JOptionPane.showMessageDialog(null,""+sopaDeLletres[i][j]+"-");
	            }
	            System.out.println();
	        }
	 }
}
