/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.integrador.java;

import java.io.IOException;

/**
 *
 * @author Tomas Langhi 
 */
public class ProyectoIntegradorJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Servidor serv = new Servidor();
        serv.startServer();
    }
    
}
