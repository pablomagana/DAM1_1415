import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



public class LeArchius {

	public static void main(String[] args) {
		String nomFitxer;
		File f;
		//llegirem del teclat
		Scanner sc=new Scanner(System.in);//System.in es el archiur de entrada
		System.out.println("introdueix el nom del fitxer: ");
		
		nomFitxer= sc.nextLine();
		sc.close();//tanquem el fitxer de la entrada estandar
		
		f=new File("C:\\Users\\pablo\\Desktop\\ejemplo\\"+nomFitxer);
		FileReader fr;
		
		try {
			fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String linea;
			String ordenar[]=new String[3];
			int indice=0;
			while((linea=br.readLine())!=null){
				ordenar[indice]=linea;
				indice++;
			}
			 ordenarArray(ordenar);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		//ordeno el array de nombres
		}
	private static void ordenarArray(String[] noms){
		String Arrayn[]=noms;
		Arrays.sort(Arrayn);
		for(int i=0;i<noms.length;i++){
			System.out.println(Arrayn[i]);
		}
	}
}
