package Kalkulator;
import java.util.Scanner;
import static java.lang.Math.*;

public class Kalkulator 
{
	public static void main(String[] args) {
		
		int liczba1;			//zmienne do licznia
		double liczba2;
		String dzilanie;			//rodzaj dzia�ania
		int wyjscie;
		do {
			
		
		
	 Scanner wej = new Scanner(System.in); 
		 System.out.println("Podaj pierwsz� liczb�:"); 
	     liczba1 = wej.nextInt();
	     
	     System.out.println("Dodawanie dw�ch liczb - wci�nij +");
	     System.out.println("Odejmowanie dw�ch liczb - wci�nij -");
	     System.out.println("Mno�enie dw�ch liczb - wci�nij *");
	     System.out.println("Dzielenie dw�ch liczb - wci�nij /");
	     System.out.println("Operacaja modulo - wci�nij %");
	     System.out.println("Operacaja potegowanie - wci�nij ^ ");
	     System.out.println("Operacaja potegowanie - wci�nij P ");

	     dzilanie = wej.next();
	     
	    
	     switch(dzilanie)     // w zale�no�ci od wyboru wykonujemy dan� operacj�
	     {
	         case "+":    // dodawanie dw�ch zmiennych
	         {
	        	 System.out.println("Podaj drug� liczb�:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 + liczba2);
	             break;
	         }
	         case "-":    // odejmowanie dw�ch zmiennych
	         {
	        	 System.out.println("Podaj drug� liczb�:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 - liczba2);
	             break;
	         }
	         case "*":    // mno�enie dw�ch zmiennych
	         {
	        	 System.out.println("Podaj drug� liczb�:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 * liczba2);
	             break;
	         }
	         case "/":   // sprawdzenie, czy druga zmienna nie jest zerem oraz
	         {           // dzielenie dw�ch zmiennych 
	        	 System.out.println("Podaj drug� liczb�:"); 
                 liczba2 = wej.nextInt();
	             if(liczba2 !=0)
	             {
	            	 
	            	 System.out.println(liczba1 / liczba2);
	                 break;
	             }
	             else
	             {
	                 System.out.println("Nie dzielimy przez zero!!!");
	             }
	             break;
	         }
	         case "%":  // jw. ale tym razem operacja modulo
	         { 	
	        	 System.out.println("Podaj drug� liczb�:"); 
	        	 liczba2 = wej.nextInt();
	             if(liczba2 !=0)  // r�wnie� sprawdzenie warunku dzielenia przez 0
	            	 
	             {
	            	
	            	 System.out.println(liczba1 % liczba2);
	                 break;
	             }
	             else {
	                 System.out.println("Nie dzielimy przez zero!!");
	             }
	             

	         } 
	         case "^": // potegowanie
             {
            	 System.out.println("Podaj wyk�adnik:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println (pow(liczba1, liczba2));
	             break; 
             }
	         case "P": // potegowanie
             {
            
	        	 System.out.println (sqrt(liczba1));
	             break; 
             }
	        
	     }
	     System.out.println("Wyjdz wcisnij:1"); 
	     System.out.println("Kontynuluj wcisnij: dowoln� cyfre");
	     wyjscie = wej.nextInt();
	  
	     }
	while(wyjscie != 1);
	

	}
	
}

	     
	