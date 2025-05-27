public class Futbolista extends Persona {
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, String posicion) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
    }

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Futbolista: " + getNombre() + " " + getApellido() +
                ", Edad: " + getEdad() + ", Posición: " + posicion);
    }
}
