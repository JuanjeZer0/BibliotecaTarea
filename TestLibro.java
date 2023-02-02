
package Biblioteca.Libro;

public class TestLibro {
    public static void main(String[] args) {
  Libro libro1 = new Libro("Grey", "La vida de Pi", 3, 2);
  System.out.println(libro1);
  
  boolean prestamohecho = libro1.Prestamo();
  if (prestamohecho) {
    System.out.println("Préstamo realizado con éxito");
  } else {}

    }
}