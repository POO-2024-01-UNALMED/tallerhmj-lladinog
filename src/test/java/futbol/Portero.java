package futbol;

public class Portero extends Futbolista {
    // Atributos públicos
    public short golesRecibidos;
    public byte dorsal;

    // Constructor que inicializa todos los atributos
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero"); // La posición siempre es "Portero"
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    // Constructor por defecto
    public Portero() {
        super("Maradona", 30, "Portero"); // Llama al constructor por defecto de Futbolista
        this.golesRecibidos = 0;
        this.dorsal = 1;
    }

    // Implementación del método compareTo para retornar la diferencia de golesRecibidos
    @Override
    public int compareTo(Object obj) {
        if (obj instanceof Portero) {
            Portero otro = (Portero) obj;
            return Math.abs(this.golesRecibidos - otro.golesRecibidos);
        }
        throw new ClassCastException("El objeto no es de tipo Portero");
    }

    // Sobrescribir el método toString para incluir golesRecibidos y dorsal
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() +
               ", y juega de " + getPosicion() + " con el dorsal " + dorsal +
               ". Le han marcado " + golesRecibidos;
    }

    // Implementación del método jugarConLasManos (debe ser verdadero para Portero)
    @Override
    public boolean jugarConLasManos() {
        return true;
    }
}
