package futbol;

@SuppressWarnings("rawtypes")
public class Futbolista implements Comparable {
    // Atributos privados
    private String nombre;
    private int edad;
    private String posicion;

    // Constructor
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Constructor por defecto
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    // Método compareTo usando Object
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Futbolista) {
            Futbolista otroFutbolista = (Futbolista) obj;
            int resultado = this.nombre.compareTo(otroFutbolista.nombre);
            if (resultado == 0) {
                resultado = Integer.compare(this.edad, otroFutbolista.edad);
            }
            return resultado;
        } else {
            throw new IllegalArgumentException("El objeto comparado no es un Futbolista");
        }
    }

    // Otros métodos (getters, setters, etc.)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista that = (Futbolista) obj;
        return edad == that.edad && nombre.equals(that.nombre) && posicion.equals(that.posicion);
    }

	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}

    
}
