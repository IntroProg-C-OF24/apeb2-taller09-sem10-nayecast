package problema_1;
public class Problema_3 {
    public static void main(String[] args) {
        double[] promedio = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez",
                                 "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promCualitativos = new String[7];
        
        for (int i = 0; i < promCualitativos.length; i++) {
            if (promedio[i] >= 0 && promedio[i] <= 5.9) {
                promCualitativos[i] = "Regular";
                
            } else if (promedio[i] >= 6 && promedio[i] <= 8.9) {
                promCualitativos[i] = "Bueno";
                
            } else { 
                promCualitativos[i] = "Sobresaliente";
            }
            
            System.out.printf("%s promedio: %.2f promedio cualitativo: %s \n", estudiantes[i], promedio[i], promCualitativos[i]);
        }
    }
    
}
