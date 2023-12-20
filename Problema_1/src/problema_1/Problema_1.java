package problema_1;

import java.util.Scanner;

public class Problema_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el numero de marcas :");
        int lim = teclado.nextInt();
        teclado.nextLine();
        String[] nomMarca = new String[lim];
        
        for (int i = 0; i < lim;) {
            System.out.print("Ingrese la marca  " + (i + 1) + ": ");
            String marca = teclado.nextLine();
            
            if (! (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) ) {
                nomMarca[i] = marca;
                i++;
            } else {
                System.out.println(" Las letras A, C, T no esta dentro de los parametros, escriba otra marca.");
            }
        }
        System.out.println("Las marcasingresadas son:");
        for(int i = 0; i < nomMarca.length; i++) {
            if (nomMarca[i] != null) { 
                System.out.println("> "+ nomMarca[i]);
            }
        }
    }
}
    
         

