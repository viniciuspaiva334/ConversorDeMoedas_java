package br.com.java.menu;

import java.util.Scanner;

public class Menu {
    private int escolha ;
    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }


   private Scanner input = new Scanner(System.in);

  public Menu() {
        System.out.println("************ Conversor De Moedas ************");
        System.out.println("Escolha a opcao:");
        System.out.println("""
                1 - Dolar para Real brasileiro
                
                2 - Real brasileiro  para Dolar
        
                3 -Euro para Real brasileiro
                 
                4 - Real brasileiro para Euro
                 
                5 - Euro para Dolar
                
                6 - Dolar para Euro
                
                7 - Sair
                """);
escolha = input.nextInt();



    }

    public void EscolhaUser(int escolha){
      while (escolha != 7){


          switch (escolha){
              case 1 :
                  break;
              case 2 :
                  break;
              case 3 :
                  break;
              case 4 :
                  break;
              case 5 :
                  break;
              case 6 :
                  break;

          }
      }
    }

}
