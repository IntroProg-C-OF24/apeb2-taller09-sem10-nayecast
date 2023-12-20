package problema_1;

public class Problema_5 {

    public static void main(String[] args) {
        int limEst = 28;
        double notasEst[] = new double[limEst];
        double sumaNotas = 0, promedio, notaMayor, notaMenor;
        int mejorEst = 0,peorEst = 0;
        
        for (int i = 0; i < notasEst.length; i++) 
            notasEst[i] = (double) (Math.random() * (9 - 0 + 1) + 0);
        
        System.out.println("LISTADO DE NOTAS");
        for (int i = 0; i < notasEst.length; i++) 
            System.out.printf("%s %d: %.2f \n", "Nota del Est", (i + 1), notasEst[i]);
        
        for (int i = 0; i < notasEst.length; i++) 
            sumaNotas += notasEst[i];
        
        promedio = sumaNotas / notasEst.length;
        System.out.printf("Promedio: %.2f \n ", promedio);
        notaMayor = notasEst[0];
        notaMenor = notasEst[0];
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] > notaMayor) 
                notaMayor = notasEst[i];
                mejorEst = i;
            if (notasEst[i] < notaMenor) 
                notaMenor = notasEst[i];  
                peorEst = i;
        }
      
        System.out.printf("Nota Mayor: %.2f \n" , notaMayor);
        System.out.printf("Nota Menor: %.2f \n" , notaMenor);
       
        System.out.println("Estudiante con nota mayor al promedio");
        for (int i = 0; i < notasEst.length; i++) 
            if(notasEst[i]>promedio)
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), notasEst[i]);
        
        
        System.out.println("Estudiantes con nota menor al promedio:");
        for (int i = 0; i < notasEst.length; i++) {
            if (notasEst[i] < promedio) {
                System.out.printf("Estudiante %d: %.2f\n", (i + 1), notasEst[i]);
            
        }
        }
        System.out.printf("El estudiante con la mejor calificacion es el numero %d con una nota de: %.2f \n", (mejorEst + 1), notaMayor);
        System.out.printf("El estudiante con la peor calificacion es el numero %d con una nota de: %.2f \n", (peorEst + 1), notaMenor);
    }
    
}

            
        