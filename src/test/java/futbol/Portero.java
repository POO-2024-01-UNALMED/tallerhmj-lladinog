package futbol;

public class Portero extends Futbolista {
    // Atributos públicos
    public short golesRecibidos;
    public byte dorsal;

    // Constructor con todos los atributos
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero"); // La posición siempre será "Portero"
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // Implementación del método compareTo para comparar por diferencia de goles recibidos
    @Override
    public int compareTo(Futbolista otroFutbolista) {
        if (otroFutbolista instanceof Portero) {
            Portero otroPortero = (Portero) otroFutbolista;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        } else {
            throw new IllegalArgumentException("Solo se pueden comparar porteros entre sí.");
        }
    }

    // Sobrescribir el método toString para la impresión personalizada
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
    }

    // Implementación del método abstracto jugarConLasManos
    @Override
    public boolean jugarConLasManos() {
        return true; // Los porteros pueden jugar con las manos
    }
}

