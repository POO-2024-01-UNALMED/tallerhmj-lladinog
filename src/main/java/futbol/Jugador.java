package futbol;

public class Jugador extends Futbolista {
    // Atributos públicos
    public short golesMarcados;
    public byte dorsal;

    // Constructor con todos los atributos
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion); // Llama al constructor de la clase padre
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // Constructor por defecto
    public Jugador() {
        super("Maradona", 30, "delantero"); // Llama al constructor por defecto de la clase padre
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    // Implementación del método compareTo para comparar por diferencia de edad
    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return Math.abs(this.getEdad() - otroFutbolista.getEdad());
    }

    // Sobrescribir el método toString para la impresión personalizada
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + 
               " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }

    // Implementación del método abstracto jugarConLasManos
    @Override
    public boolean jugarConLasManos() {
        return false; // Por defecto, los jugadores no pueden jugar con las manos
    }
}
