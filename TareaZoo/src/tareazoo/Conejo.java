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
public class Conejo extends Animal implements AccionesAnimales {

    public Conejo(String nombre, String raza, int edad){
        super();
        this.genero = "Femenino";
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
        System.out.println("QUE HAY DE NUEVO VIEJO");
    }

    @Override
    public void desplazarse() {
        System.out.println("Se aleja dando saltitos...");
    }
    
    public void excavar(){
        System.out.println(nombre + " esta excavando en la tierra.");
    }
    
        public void mostrar() {
        System.out.println("Nombre: " + nombre + " \nRaza: " + raza +" \nEspecie: " + especie +" \nEdad: " + edad + "\nGenero: " + genero);
    }
}
