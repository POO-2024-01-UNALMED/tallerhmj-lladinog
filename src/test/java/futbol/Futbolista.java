package futbol;

import java.util.Objects;

public abstract class Futbolista implements Comparable<Object> {
    private String nombre;
    private int edad;
    private final String posicion;

    // Constructor por defecto
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    // Constructor con parámetros
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Sobrescribir el método toString para la representación del Futbolista
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    // Implementación del método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista f = (Futbolista) obj;
        return edad == f.edad && nombre.equals(f.nombre) && posicion.equals(f.posicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, posicion);
    }

    // Implementación del método compareTo para Comparable<Object>
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Futbolista) {
            Futbolista otro = (Futbolista) obj;
            return this.nombre.compareTo(otro.getNombre());
        }
        throw new ClassCastException("El objeto no es de tipo Futbolista");
    }

    // Método abstracto jugarConLasManos
    public abstract boolean jugarConLasManos();
}
