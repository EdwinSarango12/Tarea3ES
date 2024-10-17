import java.beans.Introspector;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Cancion
        System.out.println("--------Canciones--------");
        System.out.println("Ingrese el nombre de la cancion: ");
        String nombreCancion = sc.nextLine();
        System.out.println("Ingrese el artista: ");
        String artista = sc.nextLine();
        System.out.println("Ingrese la duracion: ");
        String duracion = sc.nextLine();
        Cancion miCancion = new Cancion("","","");

        miCancion.setNombreCancion(nombreCancion);
        miCancion.setArtistaCancion(artista);
        miCancion.setDuracionCancion(duracion);
        miCancion.mostrarCancion();

        //Serie
        System.out.println("--------Serie--------");
        System.out.println("Ingrese el nombre de la serie: ");
        String nombreSerie = sc.nextLine();
        System.out.println("Ingrese la casa productora de la serie: ");
        String casa = sc.nextLine();
        System.out.println("Ingrese la duracion de la serie: ");
        String duracionSerie = sc.nextLine();
        Serie miSerie = new Serie("","","");

        miSerie.setNombreSerie(nombreSerie);
        miSerie.setProductoraSerie(casa);
        miSerie.setDuracionSerie(duracionSerie);
        miSerie.mostrarSerie();

        //Videojuego
        System.out.println("--------Serie--------");
        System.out.println("Ingrese el nombre del videojuego: ");
        String nombreVideojuego = sc.nextLine();
        System.out.println("Ingrese el genero del videojuego: ");
        String genero = sc.nextLine();
        System.out.println("Ingrese el año del videojuego: ");
        int anio = sc.nextInt();
        Videojuegos miVideojuego = new Videojuegos("","",0);

        miVideojuego.setNombreVideojuego(nombreVideojuego);
        miVideojuego.setGeneroVideojuego(genero);
        miVideojuego.setAnioVideojuego(anio);
        miVideojuego.mostrarVideojuego();

        //Persona
        System.out.println("--------Persona--------");
        System.out.println("Ingrese el nombre de la persona: ");
        String nombrePersona = sc.nextLine();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellidoPersona = sc.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edadPersona = sc.nextInt();
        Persona miPersona = new Persona("","",0);

        miPersona.setNombrePersona(nombrePersona);
        miPersona.setApellidoPersona(apellidoPersona);
        miPersona.setEdadPersona(edadPersona);
        miPersona.mostrarPersona();

        //Auto
        System.out.println("--------Auto--------");
        System.out.println("Ingrese el nombre del auto: ");
        String marcaAuto = sc.nextLine();
        System.out.println("Ingrese la marca del auto: ");
        String modeloAuto = sc.nextLine();
        System.out.println("Ingrese el color del auto: ");
        String colorAuto = sc.nextLine();
        Auto miAuto = new Auto("","","");

        miAuto.setMarcaAuto(marcaAuto);
        miAuto.setModeloAuto(modeloAuto);
        miAuto.setColorAuto(colorAuto);
        miAuto.mostrarAuto();

        //Transporte
        System.out.println("--------Transporte--------");
        System.out.println("Ingrese el tipo de transporte: ");
        String tipoTransporte = sc.nextLine();
        System.out.println("Ingrese el modelo: ");
        String modeloTransporte = sc.nextLine();
        System.out.println("Ingrese la marca: ");
        String marcaTransporte = sc.nextLine();
        Transporte miTransporte = new Transporte("","","");

        miTransporte.setTipoTransporte(tipoTransporte);
        miTransporte.setModeloTransporte(modeloTransporte);
        miTransporte.setMarcaTransporte(marcaTransporte);
        miTransporte.mostrarTransporte();

        //Materia
        System.out.println("--------Materia--------");
        System.out.println("Ingrese el nombre de la materia: ");
        String nombreMateria = sc.nextLine();
        System.out.println("Ingrese la descripcion de la materia: ");
        String descripcionMateria = sc.nextLine();
        System.out.println("Ingrese el tipo de materia: ");
        String tipoMateria = sc.nextLine();
        Materia miMateria = new Materia("","","");

        miMateria.setNombreMateria(nombreMateria);
        miMateria.setDescripcionMateria(descripcionMateria);
        miMateria.setCategoriaMateria(tipoMateria);
        miMateria.mostrarMateria();

        //Zapato
        System.out.println("--------Zapato--------");
        System.out.println("Ingrese la talla de zapato: ");
        float tallaZapato = sc.nextFloat();
        System.out.println("Ingrese la marca: ");
        String marcaZapato = sc.nextLine();
        System.out.println("Ingrese el color: ");
        String colorZapato = sc.nextLine();
        Zapato miZapato = new Zapato(0.0F,"","");

        miZapato.setTallaZapato(tallaZapato);
        miZapato.setMarcaZapato(marcaZapato);
        miZapato.setColorZapato(colorZapato);
        miZapato.mostrarZapato();

        //Instrumento
        System.out.println("--------Instrumento--------");
        System.out.println("Ingrese un Tipo de instrumento");
        String tipoInstrumento = sc.nextLine();
        System.out.println("Ingrese el Tono: ");
        String tonoInstrumento = sc.nextLine();
        System.out.println("Ingrese el Timbre: ");
        String timbreInstrumento = sc.nextLine();
        InstrumentoMusical miInstrumento = new InstrumentoMusical("","","");

        miInstrumento.setTipoInstrumento(tipoInstrumento);
        miInstrumento.setTimbreInstrumento(timbreInstrumento);
        miInstrumento.setTonoInstrumento(tonoInstrumento);
        miInstrumento.mostrarInstrumento();

        //Pelicula
        System.out.println("--------Pelicula--------");
        System.out.println("Ingrese el nombre de la pelicula: ");
        String nombrePelicula = sc.nextLine();
        System.out.println("Ingrese el autor de la pelicula: ");
        String autorPelicula = sc.nextLine();
        System.out.println("Ingrese el genero de la pelicula: ");
        String generoPelicula = sc.nextLine();
        Pelicula miPelicula = new Pelicula("","","");

        miPelicula.setTitulo(nombrePelicula);
        miPelicula.setAutor(autorPelicula);
        miPelicula.setGenero(generoPelicula);
        miPelicula.mostrarPelicula();

    }
}