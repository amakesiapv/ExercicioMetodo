package dio.exercicio;

public class Quadrilatero {
    public static void area (double lado) {
        System.out.println("A área do quadrado:" + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("A área do retangulo:" + lado1 * lado2);
    }
    public static void area(double ladoMaior, double ladoMenor, double altura){
        System.out.println("A area do trapezio:" + ((ladoMaior+ladoMenor)*altura)/2);
    }

   // public static void area (double lado1, double lado2) {
   //     System.out.println("A área do retângulo é: " lado1 * lado2);
   // }
   // public static void area (double ladoMaior, double ladoMenor, double altura) {
    //    System.out.println("A área do trapézio é: " ((ladoMaior + ladoMenor) * altura) / 2);
 //   }
}
