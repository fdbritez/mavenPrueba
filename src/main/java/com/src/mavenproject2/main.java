/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.mavenproject2;

/**
 *
 * @author Sandra
 */
public class main {
    public static void main(String[] args) {
       // System.out.println("HOLA MUNDO.!!!");
       persona p = new persona();
       p.setIdPersona(1);
       p.setNombre("Fernando");
       p.setEdad(35);
       // System.out.println(p.toString());
        System.out.println("codigo:" + p.getIdPersona() +" "+ "Nombre:" + p.getNombre()+" "+ "Edad:"+ p.getEdad());
    }
  
}
