import java.util.Scanner;

public class PalabrasporPantalla {
    
    public static void main(String[] args) {
     
        var entrada = new Scanner(System.in);
        System.out.println("Introduza palabra 1: ");
        var palabra = entrada.nextLine();
      
        System.out.println("Introduza palabra 2: ");
        var palabra1 = entrada.nextLine();
        
        System.out.println("Introduza palabra 3: ");
        var palabra2 = entrada.nextLine();
        System.out.println(" " + palabra + " " + palabra1 + " " +  palabra2);
        

       

       
        entrada.close();
    }
}
