public class calculadora {
 public int sumar(int a, int b) {
 return a + b;
 }
 public static void main(String[] args) {
 calculadora calc = new calculadora();
 int resultado = calc.sumar(5, 10);
 System.out.println("La suma de 5 + 10 es: " + resultado);
 }
}