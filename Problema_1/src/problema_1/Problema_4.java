package problema_1;

import java.util.Scanner;

public class Problema_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);       
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = teclado.nextLine();
            for(String estudiante : estudiantes) {
                if(estudiante.startsWith(inicial)) {
                   bandera = false;
                   System.out.println("Inicial encontrada nombre del estudiante es: "+estudiante);
                   break;
                }
            }
        }
        
    }
    
}
