package rebeldes;

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Exercicio1 {
	
	//Exercicio 3
	public static void main(String[] args) 
	{
		Random randola = new Random();
		ArrayList<Integer> listinha = new ArrayList<Integer>();
		FileOutputStream  out1 = null;
		FileOutputStream  out2 = null; //cria
		int x = 0;
		
		for(int a =0; a<=10; a++) 
		{			
			listinha.add(randola.nextInt(100));
		}
		
		listinha.sort(Comparator.naturalOrder());
		try 
		{ 
			out1 = new FileOutputStream("par.txt");
			out2 = new FileOutputStream("impar.txt");
				for(int b=0; b<=10; b++) 
				{			
					if(listinha.get(x)%2==0) {
					out1.write(listinha.get(x));
					System.out.println("Par: " + listinha.get(x));
					}else {
					out2.write(listinha.get(x));
					System.out.println("Impar: " + listinha.get(x));
					}
					x++;
				}				
		} catch(IOException e) 
		{
			e.printStackTrace();
		}
			try {
				out1.close();
				out2.close();
					
			}catch(IOException e) 
			{
				e.printStackTrace();
			}


	}
}
	
	//Exercicio 2
//	public static void main(String[] args) 
//	{
//		Scanner scan = new Scanner(System.in);
//		FileInputStream in = null; //le
//		FileOutputStream  out1 = null;
//		FileOutputStream  out2 = null;//cria
//		Integer binario;
//		
//		try {
//			
//			in = new FileInputStream("entrada.txt");
//			out1 = new FileOutputStream("maior.txt");
//			out2 = new FileOutputStream("menor.txt");
//			
//			while((binario = in.read()) != -1) 
//			{
//				if(binario > 128 )
//				{
//					out1.write(binario);
//				} 
//				else 
//				{
//					out2.write(binario);
//				}
//			}			
//			} catch(IOException e)
//				{
//					e.printStackTrace();
//				}
//				try {
//				in.close();
//				out1.close();
//				out2.close();
//				
//			}catch(IOException e) 
//				{
//				e.printStackTrace();
//				}
//		
//	}

	//Exercicio 1
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		boolean continuar = true;	
//		FileInputStream leitura = null; //le
//		Integer binario;
//		
//		do {
//			System.out.println("Insira o nome do arquivo: ");
//			String nomeArquivo = scan.nextLine();
//		try {
//			leitura = new FileInputStream(nomeArquivo);
//			continuar = false;
//			while((binario = leitura.read()) != -1) {
//				System.out.println(binario);
//			}			
//			
//		} catch(IOException e){
//			continuar = true;
//			e.printStackTrace();
//		}
//		}while(continuar == true);
//		try {
//			leitura.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}

