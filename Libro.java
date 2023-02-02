
package Biblioteca.Libro;

public class Libro {
    // título del libro, autor, número de ejemplares del libro y número de ejemplares prestados.
    
    String TituloLibro;
    String autor;
    int NumeroEjemplares;
    int EjemplaresPrestados;
    
     public Libro(){}
    
    Libro(String TituloLibro,String autor,int NumeroEjemplares,int EjemplaresPrestados){
        this.TituloLibro=TituloLibro;
        this.autor=autor;
        this.NumeroEjemplares=NumeroEjemplares;
        this.EjemplaresPrestados=EjemplaresPrestados;
    }
    
    //Set
    public void SetTituloLibro(String TituloLibro){
        this.TituloLibro=TituloLibro;
    }
    
    public void Setautor(String autor){
        this.autor=autor;
    }
    public void SetNumeroEjemplares(int NumeroEjemplares){
        this.NumeroEjemplares=NumeroEjemplares;
        
    }
    public void SetEjemplaresPrestados(int EjemplaresPrestados){
        this.EjemplaresPrestados=EjemplaresPrestados;
    }
    
    //Get
    public String GetTituloLibro(){return TituloLibro;}
    
    public String Getautor(){return autor;}
   
    public int GetNumeroEjemplares(){return NumeroEjemplares;}
    
    public int GetEjemplaresPrestados(){return EjemplaresPrestados;}
    
    //Métodos
    
    public boolean Prestamo(){
         if (NumeroEjemplares > 0) {
      NumeroEjemplares--;
      EjemplaresPrestados++;
      return true;
    } else {
      return false;
    }
    }
    
     public boolean devolucion() {
    if (EjemplaresPrestados > 0) {
      NumeroEjemplares++;
      EjemplaresPrestados--;
      return true;
    } else {
      return false;
    }
  }
    
  public String toString() {
    return "Título: " + TituloLibro + ", Autor: " + autor + ", Número de Ejemplares: " + NumeroEjemplares + ", Número de Ejemplares Prestados: " + EjemplaresPrestados;
  }
    
}
