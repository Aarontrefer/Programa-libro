
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;  
    }
    
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void imprimeAutor(){
        System.out.println("Este es el autor: " + (autor) + "este es el titulo: " +  ( titulo));
    }
    public void imprimeTitulo(){
        System.out.println("Este es el autor: " + (autor) + "este es el titulo: " +  ( titulo));
    }
    
    public int getPaginas(){
        return paginas;
    }
}
