package com.generation;
/*
 * En este codigo se implementa el juego de piedra, papel o tijeras
 * Son dos jugadores los cuales eligen entre piedra papel o tijeras
 * Una vez seleccionado se hace una comparacion de cadena entre los jugadores
 * para determinar quien es el ganador.
 * 
 */
import java.util.Scanner;//Se importo el Scanner

public class CodigoOtros4 {
	
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);//Se asigna entrada del scanner
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");//Se cambia el num. del jugador
    //Scanner s2 = new Scanner(); se elimina para la entrad de texto
    String j2 = s.nextLine();
    
    if (j1.equals(j2)) {//Se agrega comparacion equals, metodo para comparar cadenas
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals("tijeras")) {//Se agrega comparacion equals
            g = 1;
          }
          break;//Se agrega el break
        case "papel":
          if (j2.equals("piedra")) {//Se agrega comparacion equals
            g = 1;
          }//Se cierra if
            break;//Se agrega el break
        case "tijeras":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
   }     

}
