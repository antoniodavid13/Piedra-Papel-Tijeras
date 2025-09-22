
package com.mycompany.piedrapapeltijeras;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class PiedraPapelTijeras {
    private static PiedraPapelTijeras instance;
    private final int round=1;
    
    private PiedraPapelTijeras(){
        
    }
    public static PiedraPapelTijeras getInstance(){
       if(instance==null){
          instance=new PiedraPapelTijeras();  
        }
        return instance;
    }
    public  void game() throws InterruptedException{
    try(Scanner sc=new Scanner(System.in)){
        System.out.println("=====================================");
        System.out.println("     🎮 Bienvenido a:");
        System.out.println("        PIEDRA, PAPEL O TIJERAS");
        System.out.println("=====================================");

        Thread.sleep(1000);
        System.out.println("\n  Reglas del juego:");
        Thread.sleep(1000);
        System.out.println("✊ Piedra aplasta ️ Tijeras");
        System.out.println("🖐️ Papel envuelve ✊ Piedra");
        System.out.println("✌️ Tijeras cortan 🖐️ Papel");

        Thread.sleep(2000);
        System.out.println("\n¡Prepárate para jugar contra la computadora!");
        Thread.sleep(1000);
        System.out.println("\n✨ ¡Que gane el mejor! ✨\n");
        int resultado=eleccion(sc);
        int resultadorival=obtenertipo();
        String comprobacion=calcular(resultado,resultadorival);
        System.out.println(comprobacion);
                
        
    }catch(InputMismatchException e){
        System.out.println(e.getMessage());
                
    }catch(InterruptedException e){
        System.out.println(e.getMessage());
    }
    
}
  public static int eleccion(Scanner sc)throws InputMismatchException{
      System.out.println("1 Tijeras");
      System.out.println("2 Papel");
      System.out.println("3 Piedra \n");
      System.out.print("Eliga una opcion: ");

      if(sc.hasNextInt()){
          int resultado=sc.nextInt();
          return resultado;
      }else{
          throw new InputMismatchException("Error de entrada de datos");
      }
  


      
      
      
  }
  public static int obtenertipo(){
      RandomGenerator random = RandomGenerator.getDefault();
      int numero=random.nextInt(1,30);
      if(numero<=10){
          numero=1;
         System.out.println("\n RIVAL:");
        System.out.println("      @@@@@        @@@@@");
        System.out.println("     @     @      @     @");
        System.out.println("      @     @    @     @");
        System.out.println("       @     @  @     @");
        System.out.println("        @     @@     @");
        System.out.println("         @          @");
        System.out.println("          @        @");
        System.out.println("           @      @");
        System.out.println("            @    @");
        System.out.println("             @  @");
        System.out.println("              @@");
        System.out.println("              ||");
        System.out.println("              ||");
        System.out.println("              ||");
        System.out.println("              ||");
          return numero;
          
      }else if(numero>=11 && numero<=20){
          numero=2;
                   System.out.println("RIVAL:");
         System.out.println("┌───────────┐");
        System.out.println("│           │");
        System.out.println("│           │");
        System.out.println("│           │");
        System.out.println("│           │");
        System.out.println("└───────────┘");
        return numero;
        
          
      }else if(numero>=21 && numero<=30){
          numero=3;
                   System.out.println("RIVAL:");

                  System.out.println("       _____");
        System.out.println("    .-''     ''-.");
        System.out.println("  .'             '.");
        System.out.println(" /                 \\");
        System.out.println("|                   |");
        System.out.println("|                   |");
        System.out.println(" \\                 /");
        System.out.println("  '.             .'");
        System.out.println("    '-._____ .-'");
        return numero;
      }
      return numero;
  }
  
  public static String calcular(int numero1, int numero2){
      String mensaje="Empate";
      switch(numero1){
          case 1:
              if(numero2==1){
                  return mensaje;
              }else if(numero2==2){
                  return "El ganador es el jugador con las tijeras ";
              }else if(numero2==3){
                          return "El ganador es el rival con la piedra";
                          }
              break;
          case 2:
               if(numero2==1){
                  return "El ganador es el rival con las tijeras";
              }else if(numero2==2){
                  return mensaje;
              }else if(numero2==3){
                          return "El ganador es el jugador con el papel";
                          }
              break;
          case 3:
               if(numero2==1){
                  return "El ganador es el jugador con la piedra";
              }else if(numero2==2){
                  return "El rival es el ganador con el papel";
              }else if(numero2==3){
                          return mensaje;
                          }
              break;
              
                  
              }
      return mensaje;
      }
      
  }

    
    



