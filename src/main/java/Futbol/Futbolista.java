package Futbol;

//Implementa la interface Comparable
public abstract class Futbolista implements Comparable<Futbolista> {
 // Atributos privados
 private String nombre;
 private int edad;
 private final String posicion; // final para que no pueda cambiar después de inicializarse

 // Constructor con todos los atributos
 public Futbolista(String nombre, int edad, String posicion) {
     this.nombre = nombre;
     this.edad = edad;
     this.posicion = posicion;
 }

 // Constructor por defecto
 public Futbolista() {
     this("Maradona", 30, "delantero"); // Llama al constructor anterior
 }

 // Sobrescribir el método toString para la impresión personalizada
 @Override
 public String toString() {
     return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
 }

 // Método equals para comparar dos objetos Futbolista
 public boolean equals(Futbolista f) {
     if (f == null) {
         return false;
     }
     return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
 }

 // Método abstracto jugarConLasManos
 public abstract boolean jugarConLasManos();

 // Métodos get y set para los atributos
 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public int getEdad() {
     return edad;
 }

 public void setEdad(int edad) {
     this.edad = edad;
 }

 public String getPosicion() {
     return posicion;
 }

 // Implementación del método compareTo de la interface Comparable
 @Override
 public int compareTo(Futbolista otroFutbolista) {
     return this.nombre.compareTo(otroFutbolista.nombre);
 }
}
