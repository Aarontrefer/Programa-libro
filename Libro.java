
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, String numeroDeReferencia)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        numeroReferencia = numeroDeReferencia;
    }
    
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    public void setNumeroReferencia(String referencia){
        numeroReferencia = referencia;
        if(numeroReferencia.length() > 2){
            numeroReferencia = numeroReferencia;
        }
        else{
            numeroReferencia = "";
            System.out.println("el numero de referencia e de menos de 3 digitos");
        }
    }
    
    public void imprimeAutor(){
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas;
        System.out.println(informacion);
    }
    public void imprimeTitulo(){
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas + "Su numero de referencia es " + numeroReferencia;
        System.out.println(informacion);
    }
    
    public int getPaginas(){
        return paginas;
    }
    
    public void impimirDetalles(){
        if(numeroReferencia.length() ==0){
            numeroReferencia = "ZZZ";
        }
        
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas + " Su numero de referencia es " + numeroReferencia;
        System.out.println(informacion);
    }
    public  String getDetalles(){
        if(numeroReferencia.length() ==0){
            numeroReferencia = "ZZZ";
        }
        
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas + " Su numero de referencia es " + numeroReferencia;
        return informacion; 
    }
}
