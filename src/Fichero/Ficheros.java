package Fichero;

/**
 * ** @author dpazolopez ***
 */
public class Ficheros {

    public static void main(String[] args) {
        LeerFichero obj = new LeerFichero();
        obj.leerLinea("texto.txt");
        obj.leerConDelimitador("numeros.txt");
    }
}
