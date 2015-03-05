package Fichero;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dpazolopez
 */

public class LeerFichero {

    Scanner sc;

    public void leerLinea(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerUno(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNext()) {
                respuesta = sc.next();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerNumeros(String nombre) {
        int respuesta;
        try {
            sc = new Scanner(new File(nombre));
            while (sc.hasNextInt()) {
                respuesta = sc.nextInt();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }

    public void leerConDelimitador(String nombre) {
        String respuesta;
        try {
            sc = new Scanner(new File(nombre)).useDelimiter(",");
            while (sc.hasNextLine()) {
                respuesta = sc.nextLine();
                System.out.println(respuesta);
            }
        } catch (IOException ex) {
            System.err.println("Error de Lectura" + ex.toString());
        } finally {
            sc.close();
        }
    }
}

