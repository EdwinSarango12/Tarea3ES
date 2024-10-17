public class Persona {

    String nombrePersona;
    String apellidoPersona;
    int edadPersona;

    public Persona(String nombrePersona, String apellidoPersona, int edadPersona) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombrePersona);
        System.out.println("Apellido: " + apellidoPersona);
        System.out.println("Edad: " + edadPersona);
    }
}