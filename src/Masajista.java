public class Masajista extends Persona {
    private String titulacion;

    public Masajista(String nombre, String apellido, int edad, String titulacion) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
    }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Masajista: " + getNombre() + " " + getApellido() +
                ", Edad: " + getEdad() + ", Titulación: " + titulacion);
    }
}
