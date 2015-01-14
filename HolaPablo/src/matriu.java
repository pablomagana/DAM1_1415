import javax.swing.JOptionPane;
public class matriu {
	private char sopaDeLletres[][];
    private final int FILES=5;
    private final int COLUMNES=6;
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
            	if(lletra<91){
                sopaDeLletres[i][j]=lletra++;
            	}else{
            		sopaDeLletres[i][j]=' ';
            	}
            }
        }
	}
	 public void mostraMatriuDeLletres(){
	        for(int i=0;i<FILES;i++){
	            for(int j=0;j<COLUMNES;j++){
	                System.out.print(""+sopaDeLletres[i][j]+" ");
	                JOptionPane.showMessageDialog(null,""+sopaDeLletres[i][j]+" ");
	            }
	            System.out.println("");
	        }
	 }
}
