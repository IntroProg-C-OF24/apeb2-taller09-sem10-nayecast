package problema_1;
public class Problema_2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double suma = 0.0, mediaArit = 0;
        for (int num : arreglo) {
            suma += num;
        }
        mediaArit = suma / arreglo.length;
        System.out.printf("La media aritmetica es: %.2f", mediaArit);
        System.out.println(" ");
        System.out.println("Numeros por encima de la media aritmética: ");

        for (int numero : arreglo) {
            if (numero > mediaArit) {
                System.out.println(numero);
            }
        }
        System.out.println(" ");
        System.out.println("Numeros por debajo de la media aritmética: ");
        for (int num : arreglo) {
            if (num < mediaArit) {
                System.out.println(num);
            }

        }

    }

}
