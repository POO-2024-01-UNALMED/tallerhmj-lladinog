package futbol;

public class Jugador extends Futbolista {
    // Atributos públicos
    public short golesMarcados;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    // Constructor por defecto
    public Jugador() {
        super(); // Llama al constructor por defecto de Futbolista
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    // Implementación del método compareTo para retornar la diferencia de edad
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Futbolista) {
            Futbolista otro = (Futbolista) obj;
            return Math.abs(this.getEdad() - otro.getEdad());
        }
        throw new ClassCastException("El objeto no es de tipo Futbolista");
    }

    // Sobrescribir el método toString para incluir golesMarcados y dorsal
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() +
               ", y juega de " + getPosicion() + " con el dorsal " + dorsal +
               ". Ha marcado " + golesMarcados;
    }

    // Implementación del método jugarConLasManos (debe ser falso para Jugador)
    @Override
    public boolean jugarConLasManos() {
        return false;
    }
}
