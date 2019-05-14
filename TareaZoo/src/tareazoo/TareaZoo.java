/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareazoo;

import java.util.Scanner;

public class TareaZoo {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        Zoo();
    }
    
    public static void Zoo(){
        Tigre tigre = new Tigre("Toña", "Tigre Blanco", 5);
        Gorila gorila = new Gorila("Donkey Kong", "Gorila", 7);
        Conejo conejo = new Conejo("Lola", "Conejo", 2);
        Pez pez = new Pez("Nemo", "Pez", 1);
        
        boolean continuar = true;
        while(continuar){
            int opcion=0;
            System.out.println("Bienevenido al Zoologico de El Salvador");
            System.out.println("Seleccione 1 para visitar al tigre");
            System.out.println("Seleccione 2 para visitar al gorila");
            System.out.println("Seleccione 3 para visitar al conejo");
            System.out.println("Seleccione 4 para visitar al pez");
            System.out.println("Seleccione cualquier otro numero para salir");
            opcion =in.nextInt(); in.nextLine();
            switch(opcion){
                                case 1:{
                                    System.out.println("Visitando tigre");
                                    visitaTigre(tigre, in);
                                    break;
                                }
                                case 2:{
                                    System.out.println("Visitando gorila");
                                    visitaGorila(gorila, in);
                                    break;
                                }
                                case 3:{
                                    System.out.println("Visitando conejo");
                                    visitaConejo(conejo, in);
                                    break;
                                }
                                case 4:{
                                    System.out.println("Visitando pez");
                                    visitaPez(pez, in);
                                    break;
                                }
                                default:
                                    continuar = false;
                            }
            }

}
    
    public static void visitaTigre(Tigre tigre, Scanner in){
        tigre.mostrar();
        boolean continuar = true;
        while(continuar){
            int opcion = 0;
            acciones();
            opcion = in.nextInt(); in.nextLine();
            switch(opcion){
                case 1:
                        tigre.comer(tigre.nombre);
                        break;
                    case 2:
                        tigre.dormir(tigre.nombre);
                        break;
                    case 3:
                        tigre.hacerSonidos();
                        break;
                    case 4:
                        tigre.desplazarse();
                        break;
                    case 5:
                        tigre.escalar();
                        break;
                    default:
                        continuar=false;
            }
        }
        
    }
    
    public static void visitaGorila(Gorila gorila, Scanner in){
        gorila.mostrar();
        boolean continuar = true;
        while(continuar){
            int opcion = 0;
            acciones();
            opcion = in.nextInt(); in.nextLine();
            switch(opcion){
                case 1:
                        gorila.comer(gorila.nombre);
                        break;
                    case 2:
                        gorila.dormir(gorila.nombre);
                        break;
                    case 3:
                        gorila.hacerSonidos();
                        break;
                    case 4:
                        gorila.desplazarse();
                        break;
                        case 5:
                        gorila.columpiarse();
                        break;
                    default:
                        continuar=false;
            }
        }
        
    }
    
    public static void visitaConejo(Conejo conejo, Scanner in){
        conejo.mostrar();
        boolean continuar = true;
        while(continuar){
            int opcion = 0;
            acciones();
            opcion = in.nextInt(); in.nextLine();
            switch(opcion){
                case 1:
                        conejo.comer(conejo.nombre);
                        break;
                    case 2:
                        conejo.dormir(conejo.nombre);
                        break;
                    case 3:
                        conejo.hacerSonidos();
                        break;
                    case 4:
                        conejo.desplazarse();
                        break;
                    case 5:
                        conejo.excavar();
                        break;
                    default:
                        continuar=false;
            }
        }
        
    }
    
    public static void visitaPez(Pez pez, Scanner in){
        pez.mostrar();
        boolean continuar = true;
        while(continuar){
            int opcion = 0;
            acciones();
            opcion = in.nextInt(); in.nextLine();
            switch(opcion){
                case 1:
                        pez.comer(pez.nombre);
                        break;
                    case 2:
                        pez.dormir(pez.nombre);
                        break;
                    case 3:
                        pez.hacerSonidos();
                        break;
                    case 4:
                        pez.desplazarse();
                        break;
                    case 5:
                        pez.truco();
                        break;
                    default:
                        continuar=false;
            }
        }
        
    }
    
    public static void acciones(){
        System.out.println("1. Comer");
        System.out.println("2. Dormir");
        System.out.println("3. Hacer Sonido");
        System.out.println("4. Desplazarse");
        System.out.println("5. Accion Caracteristica ");
        System.out.println("Otro numero para salir ");
    }
    
}
