public class Cancion {

    //Atributos
    String nombreCancion;
    String artistaCancion;
    String duracionCancion;

    //metodos

    //constructor
    public Cancion(String nombre, String artistaCancion, String duracionCancion) {
        this.nombreCancion = nombre;
        this.artistaCancion = artistaCancion;
        this.duracionCancion = duracionCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getArtistaCancion() {
        return artistaCancion;
    }

    public void setArtistaCancion(String artistaCancion) {
        this.artistaCancion = artistaCancion;
    }

    public String getDuracionCancion() {
        return duracionCancion;
    }

    public void setDuracionCancion(String duracionCancion) {
        this.duracionCancion = duracionCancion;
    }

    public void mostrarCancion() {
        System.out.println("Nombre: " + nombreCancion);
        System.out.println("Artista: " + artistaCancion);
        System.out.println("Duracion: " + duracionCancion);
    }
}