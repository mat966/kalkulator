package Kalkulator;
import java.util.Scanner;
import static java.lang.Math.*;

public class Kalkulator 
{
	public static void main(String[] args) {
		
		int liczba1;			//zmienne do licznia
		double liczba2;
		String dzilanie;			//rodzaj dzia³ania
		int wyjscie;
		do {
			
		
		
	 Scanner wej = new Scanner(System.in); 
		 System.out.println("Podaj pierwsz¹ liczbê:"); 
	     liczba1 = wej.nextInt();
	     
	     System.out.println("Dodawanie dwóch liczb - wciœnij +");
	     System.out.println("Odejmowanie dwóch liczb - wciœnij -");
	     System.out.println("Mno¿enie dwóch liczb - wciœnij *");
	     System.out.println("Dzielenie dwóch liczb - wciœnij /");
	     System.out.println("Operacaja modulo - wciœnij %");
	     System.out.println("Operacaja potegowanie - wciœnij ^ ");
	     System.out.println("Operacaja potegowanie - wciœnij P ");

	     dzilanie = wej.next();
	     
	    
	     switch(dzilanie)     // w zale¿noœci od wyboru wykonujemy dan¹ operacjê
	     {
	         case "+":    // dodawanie dwóch zmiennych
	         {
	        	 System.out.println("Podaj drug¹ liczbê:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 + liczba2);
	             break;
	         }
	         case "-":    // odejmowanie dwóch zmiennych
	         {
	        	 System.out.println("Podaj drug¹ liczbê:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 - liczba2);
	             break;
	         }
	         case "*":    // mno¿enie dwóch zmiennych
	         {
	        	 System.out.println("Podaj drug¹ liczbê:"); 
	             liczba2 = wej.nextInt();
	        	 System.out.println(liczba1 * liczba2);
	             break;
	         }
	         case "/":   // sprawdzenie, czy druga zmienna nie jest zerem oraz
	         {           // dzielenie dwóch zmiennych 
	        	 System.out.println("Podaj drug¹ liczbê:"); 
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
	        	 System.out.println("Podaj drug¹ liczbê:"); 
	        	 liczba2 = wej.nextInt();
	             if(liczba2 !=0)  // równie¿ sprawdzenie warunku dzielenia przez 0
	            	 
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
            	 System.out.println("Podaj wyk³adnik:"); 
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
	     System.out.println("Kontynuluj wcisnij: dowoln¹ cyfre");
	     wyjscie = wej.nextInt();
	  
	     }
	while(wyjscie != 1);
	

	}
	
}

	     
	