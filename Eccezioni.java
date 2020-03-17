
package eccezione;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eccezioni {


    public static void main(String[] args) {
        int i;
        int[] Vettore;
        Vettore = new int[10];
        
        Scanner tast = new Scanner(System.in);
        
        try{
        for(i=0; i<11; i++){
            System.out.println("Inserisci un valore intero = ");
            Vettore[i] = tast.nextInt();
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ERRORE, il Vettore è pieno, non si possono più inserire elementi in questo vettore");
        }
        catch(InputMismatchException e1){
            System.out.println("ERRORE, l'elemento inserito non corrisponde ad un intero");
        }
        catch(Exception e2){
            System.out.println("ERRORE, errore generale");
        }
    }
    
}
