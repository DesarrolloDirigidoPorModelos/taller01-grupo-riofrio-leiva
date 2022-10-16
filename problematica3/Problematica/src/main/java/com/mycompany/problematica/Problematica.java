/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problematica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Daniel Leiva, Francisco Geovanny Riofrio Terrazas

 */
public class Problematica {

    public static void main(String[] args) {
        List<Cliente> listaClientes = new ArrayList();
        Cliente cliente1= new Cliente(1,"Daniel","1104050607","Tebaida");
        Cliente cliente2= new Cliente(2,"Francisco Riofrío","1104080910","Los Molinos");
        //System.out.println(cliente.cantidadMedidor());
        cliente1.addMedidor(2, "ACREL", "EEUU y Alemania", 32.45);
        cliente1.addMedidor(3, "BENDER", "Benjamin Carrió y Jose ARtigas", 63.45);
        
        cliente2.addMedidor(2, "BENDER", "10 de Agosto y Bernando", 50.00);
        
        System.out.println("Clientes");
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        System.out.println(listaClientes);
        System.out.println("NUMEROS DE MEDIDORES");
        System.out.println("el cliente 1 "+listaClientes.get(0).getNombres()+" tiene "+listaClientes.get(0).numberOfMedidors()+" medidores");
        System.out.println("Lista de Medidores");
        System.out.println(listaClientes.get(0).getMedidors());
        System.out.println("el cliente 2 "+listaClientes.get(1).getNombres()+" tiene "+listaClientes.get(1).numberOfMedidors()+" medidores");
        System.out.println("Lista de Medidores");
        System.out.println(listaClientes.get(1).getMedidors());
        
        
        
        
        
        
        
        
        
    }
}
