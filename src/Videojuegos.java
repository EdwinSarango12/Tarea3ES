public class Videojuegos {

    String nombreVideojuego;
    String generoVideojuego;
    int anioVideojuego;

    public Videojuegos(String nombreVideojuego, String generoVideojuego, int anioVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
        this.generoVideojuego = generoVideojuego;
        this.anioVideojuego = anioVideojuego;
    }

    public String getNombreVideojuego() {
        return nombreVideojuego;
    }

    public void setNombreVideojuego(String nombreVideojuego) {
        this.nombreVideojuego = nombreVideojuego;
    }

    public String getGeneroVideojuego() {
        return generoVideojuego;
    }

    public void setGeneroVideojuego(String generoVideojuego) {
        this.generoVideojuego = generoVideojuego;
    }

    public int getAnioVideojuego() {
        return anioVideojuego;
    }

    public void setAnioVideojuego(int anioVideojuego) {
        this.anioVideojuego = anioVideojuego;
    }

    public void mostrarVideojuego() {
        System.out.println("Nombre: " + nombreVideojuego);
        System.out.println("Genero: " + generoVideojuego);
        System.out.println("Anio: " + anioVideojuego);
    }
}