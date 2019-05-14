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
public class Pez extends Animal implements AccionesAnimales {

    public Pez(String nombre, String raza, int edad){
        super();
        this.especie = "Pez";
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
        System.out.println("GLU GLU GLU");
    }

    @Override
    public void desplazarse() {
        System.out.println("Nada sin rumbo fijo...");
    }
    
    public void truco(){
        System.out.println(nombre + " hace pequeños saltos en el agua");
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + nombre + " \nRaza: " + raza +" \nEspecie: " + especie +" \nEdad: " + edad + "\nGenero: " + genero);
    }
}
