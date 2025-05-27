public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() { return estrategia; }
    public void setEstrategia(String estrategia) { this.estrategia = estrategia; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Entrenador: " + getNombre() + " " + getApellido() +
                ", Edad: " + getEdad() + ", Estrategia: " + estrategia);
    }

}