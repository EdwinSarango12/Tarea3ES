public class Transporte {

    String tipoTransporte;
    String marcaTransporte;
    String modeloTransporte;

    public Transporte(String tipoTransporte, String marcaTransporte, String modeloTransporte) {
        this.tipoTransporte = tipoTransporte;
        this.marcaTransporte = marcaTransporte;
        this.modeloTransporte = modeloTransporte;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getMarcaTransporte() {
        return marcaTransporte;
    }

    public void setMarcaTransporte(String marcaTransporte) {
        this.marcaTransporte = marcaTransporte;
    }

    public String getModeloTransporte() {
        return modeloTransporte;
    }

    public void setModeloTransporte(String modeloTransporte) {
        this.modeloTransporte = modeloTransporte;
    }

    public void mostrarTransporte() {
        System.out.println("Tipo Transporte: " + tipoTransporte);
        System.out.println("Marca Transporte: " + marcaTransporte);
        System.out.println("Modelo Transporte: " + modeloTransporte);
    }
}