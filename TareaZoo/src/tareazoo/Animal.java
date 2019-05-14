/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareazoo;

/**
 *
 * @author steve
 */
public class Animal {
    protected String nombre, raza, especie, genero;
    protected int edad;
    
    public Animal(){
        this.especie = "Mamifero";
        this.genero = "Masculino";
    }
    
    public Animal(String nombre, String raza, String especie, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
    }
    
    protected void dormir(String nombre){
        System.out.println(nombre + " esta durmiendo");
    }
    
    protected void comer(String nombre){
        System.out.println(nombre + " esta comiendo");
    }
}
