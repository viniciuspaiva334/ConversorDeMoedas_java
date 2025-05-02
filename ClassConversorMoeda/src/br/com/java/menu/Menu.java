package br.com.java.menu;

import br.com.java.apiclass.ApiRequisition;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public int escolha;

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }


    private Scanner input = new Scanner(System.in);

    {
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
                
                digite sua escolha :
                """);

    }

    public void EscolhaUser() throws IOException, InterruptedException {
        char opcSN = ' ';
        escolha = input.nextInt();
        System.out.println("escolha: " + escolha);

        while (escolha != 7) {


            switch (escolha) {
                case 1:
                    ApiRequisition dolar_real = new ApiRequisition("USD", "BRL");

                    System.out.println("deseja fazer outra escolha? sim/nao");
                    opcSN = input.next().charAt(0);
                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual? ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        return;
                    }

                    break;
                case 2:
                    ApiRequisition real_dolar = new ApiRequisition("BRL", "USD");

                    System.out.println("deseja fazer outra escolha? sim/nao");
                    opcSN = input.next().charAt(0);
                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual?  ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        return;
                    }
                    break;
                case 3:
                    ApiRequisition euro_real = new ApiRequisition("EUR", "BRL");

                    System.out.println("deseja fazer outra escolha? sim/nao  ");
                    opcSN = input.next().charAt(0);

                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual?  ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        System.out.println("saindo do programa");
                        return;
                    }
                    break;
                case 4:
                    ApiRequisition real_euro = new ApiRequisition("BRL", "EUR");

                    System.out.println("deseja fazer outra escolha? sim/nao");
                    opcSN = input.next().charAt(0);

                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual?  ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        System.out.println("saindo do programa");
                        return;
                    }

                    break;
                case 5:
                    ApiRequisition euro_dolar = new ApiRequisition("EUR", "USD");

                    System.out.println("deseja fazer outra escolha? sim/nao");

                    opcSN = input.next().charAt(0);

                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual?  ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        System.out.println("saindo do programa");
                        return;
                    }

                    break;
                case 6:
                    ApiRequisition dolar_euro = new ApiRequisition("USD", "EUR");

                    System.out.println("deseja fazer outra escolha? sim/nao");

                    opcSN = input.next().charAt(0);

                    if ((opcSN == 'S') || (opcSN == 's')) {
                        escolha = 0;
                        System.out.println("qual?  ");
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
                    if ((opcSN == 'N') || (opcSN == 'n')) {
                        System.out.println("saindo do programa");
                        return;
                    }

                    break;

            }


        }
         System.out.println("saindo do programa");
    }

}
