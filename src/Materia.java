public class Materia{
String nombreMateria;
String descripcionMateria;
String categoriaMateria;

public Materia(String nombreMateria, String descripcionMateria, String categoriaMateria) {
    this.nombreMateria = nombreMateria;
    this.descripcionMateria = descripcionMateria;
    this.categoriaMateria = categoriaMateria;
}

public String getNombreMateria() {
    return nombreMateria;
}

public void setNombreMateria(String nombreMateria) {
    this.nombreMateria = nombreMateria;
}

public String getDescripcionMateria() {
    return descripcionMateria;
}

public void setDescripcionMateria(String descripcionMateria) {
    this.descripcionMateria = descripcionMateria;
}

public String getCategoriaMateria() {
    return categoriaMateria;
}

public void setCategoriaMateria(String categoriaMateria) {
    this.categoriaMateria = categoriaMateria;
}

public void mostrarMateria() {
    System.out.println("Nombre Materia: "+nombreMateria);
    System.out.println("Descripcion Materia: "+descripcionMateria);
    System.out.println("Categoria Materia: "+categoriaMateria);
    }
}
