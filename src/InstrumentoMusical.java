public class InstrumentoMusical {

    String tipoInstrumento;
    String tonoInstrumento;
    String timbreInstrumento;

    public InstrumentoMusical(String tipoInstrumento, String tonoInstrumento, String timbreInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
        this.tonoInstrumento = tonoInstrumento;
        this.timbreInstrumento = timbreInstrumento;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public String getTonoInstrumento() {
        return tonoInstrumento;
    }

    public void setTonoInstrumento(String tonoInstrumento) {
        this.tonoInstrumento = tonoInstrumento;
    }

    public String getTimbreInstrumento() {
        return timbreInstrumento;
    }

    public void setTimbreInstrumento(String timbreInstrumento) {
        this.timbreInstrumento = timbreInstrumento;
    }
    public void mostrarInstrumento() {
        System.out.println("Tipo: " + tipoInstrumento);
        System.out.println("Tono: " + tonoInstrumento);
        System.out.println("Timbre: " + timbreInstrumento);
    }
}
