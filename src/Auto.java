public class Auto {

    String marcaAuto;
    String modeloAuto;
    String colorAuto;

    public Auto(String marcaAuto, String modeloAuto, String colorAuto) {
        this.marcaAuto = marcaAuto;
        this.modeloAuto = modeloAuto;
        this.colorAuto = colorAuto;
    }

    public String getMarcaAuto() {
        return marcaAuto;
    }

    public void setMarcaAuto(String marcaAuto) {
        this.marcaAuto = marcaAuto;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    public void mostrarAuto() {
        System.out.println("Marca: " + marcaAuto);
        System.out.println("Modelo: " + modeloAuto);
        System.out.println("Color: " + colorAuto);
    }
}