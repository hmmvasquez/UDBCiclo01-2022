import java.util.*;
  class ejemplo1 {
    public static void main(String[] args) {
      //Creamos un objeto de la clase scanner
      Scanner in = new Scanner(System.in);

      //Obtenemos el primer dato
      System.out.println("¿Como te llamas?");
      String nombre = in .nextLine();

      //Obtenemos el segundo dato
      System.out.println("¿Cuantos años tienes?");
      int edad = in .nextInt();

      //monstrar el resultado en la consola
      System.out.println("Hola, "+nombre+". El año que viene tendras "+edad+" años");
    }
  }