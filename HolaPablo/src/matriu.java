//import javax.swing.JOptionPane;
public class matriu {
	private char sopaDeLletres[][];
    private final int FILES=3;
    private final int COLUMNES=5;
    
    public matriu(){
    	sopaDeLletres= new char[FILES][COLUMNES];
    }
	public static void main(String[] args) {
	
		matriu m = new matriu();
		m.ompliMatriuDeLletres();
    	m.mostraMatriuDeLletres();

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
	                System.out.print(""+sopaDeLletres[i][j]+"-");
	                //JOptionPane.showMessageDialog(null,""+sopaDeLletres[i][j]+"-");
	            }
	            System.out.println("");
	        }
	 }
}
