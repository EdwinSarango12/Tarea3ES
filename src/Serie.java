public class Serie {

    //Atributos
    String nombreSerie;
    String productoraSerie;
    String duracionSerie;

    public Serie(String nombreSerie, String productoraSerie, String duracionSerie){
        this.nombreSerie = nombreSerie;
        this.productoraSerie = productoraSerie;
        this.duracionSerie = duracionSerie;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getProductoraSerie() {
        return productoraSerie;
    }

    public void setProductoraSerie(String productoraSerie) {
        this.productoraSerie = productoraSerie;
    }

    public String getDuracionSerie() {
        return duracionSerie;
    }

    public void setDuracionSerie(String duracionSerie) {
        this.duracionSerie = duracionSerie;
    }

    public void mostrarSerie(){
        System.out.println("Nombre: " + nombreSerie);
        System.out.println("Productora: " + productoraSerie);
        System.out.println("Duracion: " + duracionSerie);
    }
}