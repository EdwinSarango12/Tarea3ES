public class Zapato {

    float tallaZapato;
    String marcaZapato;
    String colorZapato;

    public Zapato(float tallaZapato, String marcaZapato, String colorZapato ) {
        this.tallaZapato = tallaZapato;
        this.marcaZapato = marcaZapato;
        this.colorZapato = colorZapato;
    }

    public float getTallaZapato() {
        return tallaZapato;
    }

    public void setTallaZapato(float tallaZapato) {
        this.tallaZapato = tallaZapato;
    }

    public String getMarcaZapato() {
        return marcaZapato;
    }

    public void setMarcaZapato(String marcaZapato) {
        this.marcaZapato = marcaZapato;
    }

    public String getColorZapato() {
        return colorZapato;
    }

    public void setColorZapato(String colorZapato) {
        this.colorZapato = colorZapato;
    }

    public void mostrarZapato() {
        System.out.printf("Talla Zapato: ",getTallaZapato());
        System.out.printf("Marca Zapato: ",getMarcaZapato());
        System.out.printf("Color: ",getColorZapato());
    }
}