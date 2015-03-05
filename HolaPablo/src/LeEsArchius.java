import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LeEsArchius {
	static Scanner sc;
	
	public static void main(String[] args) {
		String nomFitxer="";
		//llegirem del teclat
		sc=new Scanner(System.in);//System.in es el archiur de entrada
		System.out.println("introdueix el nom del fitxer: ");
		nomFitxer= sc.nextLine();
		//leer(nomFitxer);
		leer(nomFitxer);
		sc.close();//tanquem el fitxer de la entrada estandar
	}	
		
	private static void escribir(String nomFitxer){
		try {
			String nomAAfegir=disMeNom();
			FileWriter fw;
			fw= new FileWriter("C:\\Users\\pablo\\Desktop\\ejemplo\\"+nomFitxer,true);
			//si le paso true significa que puede añadir al final del archivo
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write(nomAAfegir);
			bw.newLine();
			bw.write(nomAAfegir.toUpperCase());
			bw.newLine();
			bw.close();
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leer(String nomFitxer){
		File f;
		f = new File("C:\\Users\\pablo\\Desktop\\ejemplo\\"+nomFitxer);
		
		
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			ArrayList <String> aNoms= new ArrayList <String>();
			String linea;
	        
	        System.out.println("Contingut del fitxer");
	        while((linea=br.readLine())!=null){
	        	aNoms.add(linea);
	            //System.out.println(linea);
	            
	        }
	        for(int j=0;j<aNoms.size();j++){
	        	System.out.println(aNoms.get(j));
	        }
	        fr.close();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String disMeNom(){
		System.out.println("disme un nom: ");
		sc=new Scanner(System.in);
		String nom=sc.nextLine();
		return nom;
	}
	
	private static void ordenarArray(String[] noms){
		String Arrayn[]=noms;
		Arrays.sort(Arrayn);
		for(int i=0;i<noms.length;i++){
			System.out.println(Arrayn[i]);
		}
	}
}
