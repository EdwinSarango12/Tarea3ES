public class Libro {

    //Primer repaso//
    //Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //metodos
    //constructor

    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public void imprimir() {
        System.out.println("El tìtulo es: " + this.titulo);
        System.out.println("El autor es: " + this.autor);
        System.out.println("La editorial es: " + this.editorial);
        System.out.println("El nùmero de pàginas son: " + this.paginas);
        System.out.println("\t********\t");
    }
    public int imprimircubierta(){
        return this.paginas+5;

    }
}