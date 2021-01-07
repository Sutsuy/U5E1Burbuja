package BurbujaListas;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> Lista = new ArrayList <Integer> ();
		Lista.add(9);
		Lista.add(1);
		Lista.add(4);
		Lista.add(3);
		Lista.add(10);
		Lista.add(7);
		Lista.add(5);
		

		System.out.println("Arreglo deserdenado");
		
		for(int i=0;i<Lista.size();i++)
		{
			System.out.print(Lista.get(i)+ "|"); //for para mostrar desarreglado 
		}
		
		
		
		for(int i=0;i<Lista.size()-1;i++)//-1 por que se hace una iteracion , recorrer para cada una interacion 
		{
			for(int j=0;j<Lista.size()-1;j++)//for interior , para hacer la comparacion del elementyo que se va a comparar 
			{
				
			if(Lista.get((j))>Lista.get((j+1)))
			{
			int auxiliar =Lista.get((j+1)); //guardar el numero 1  en el auxiliar
			
		     Lista.set(j+1,Lista.get(j));
		     Lista.set(j,auxiliar);
			}
				
				
			}
		
		}
		
		
		System.out.println("\n\n\n************************");
		System.out.println(" Lista ordenado");
	for(int i=0;i<Lista.size();i++)
		{
		
			System.out.print(Lista.get((i))+"|"); 
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
