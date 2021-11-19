
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
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, String numeroDeReferencia){
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        numeroReferencia = numeroDeReferencia;
        vecesPrestado = 0;
    }
    
    public void prestar(){
         vecesPrestado += 1;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
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
        if(referencia.length() > 2){
            numeroReferencia = referencia; 
        }
        else{
            System.out.println("el numero de referencia es de menos de 3 digitos");
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
        String numeroZzz = "ZZZ";
        if(numeroReferencia.length() >0){
             numeroZzz = numeroReferencia;
        }    
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas + " Su numero de referencia es " + numeroZzz + " y lo han prestado estas veces:" + vecesPrestado;
        System.out.println(informacion);
    }
    public  String getDetalles(){
        String numeroZzz = "ZZZ";
        if(numeroReferencia.length() >0){
             numeroZzz = numeroReferencia;
        } 
        String informacion = "Autor: " + autor + ", titulo: " +  titulo + ", Paginas:" + paginas + " Su numero de referencia es " + numeroZzz + " y lo han prestado estas veces:" + vecesPrestado;
        return informacion; 
    }
}
