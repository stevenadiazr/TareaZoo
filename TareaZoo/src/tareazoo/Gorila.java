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
public class Gorila extends Animal implements AccionesAnimales {

    public Gorila(String nombre, String raza, int edad){
        super();
        this.nombre = nombre; 
        this.raza = raza;
        this.edad = edad;
    }
    
    @Override
    protected void dormir(String nombre){
        System.out.println(nombre + " está durmiendo");
    }

    @Override
    protected void comer(String nombre){
        System.out.println(nombre + " está comiendo");
    }
    
    @Override
    public void hacerSonidos() {
        System.out.println("UH UH UH UH");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camina en 2 patas hacia un  arbol cercano...");
    }
    
    public void columpiarse(){
        System.out.println(nombre + " se columpia por las ramas");
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " \nRaza: " + raza +" \nEspecie: " + especie +" \nEdad: " + edad + "\nGenero: " + genero);
    }
}
