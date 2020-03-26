package com.bank;

import java.io.IOException;
import java.util.Scanner;

public class Menu extends Login{
    Bank bank = new MandaraBank();
    Scanner inp = new Scanner(System.in);
    private int input;

    public void bankMenu() throws IOException{
        System.out.println("\n\t---- Select Bank ----");
        System.out.printf("1. Mandara Bank\n2. BACA Bank\n3. BRO Bank\n");
        System.out.print(">");
        input = inp.nextInt();
        switch (input){
            case 1 :
                /* user : ali
                *  pin  : 212121
                * */
                menuMandara();
                if(!super.accept){
                    return;
                }
                System.out.println("\n\n---- Mandara Bank ----");
                System.out.printf("1. Save Money\n2. Take Money\n3. Transfer\n4. Activity\n5. Info Nasabah\n");
                System.out.print(">");
                input = inp.nextInt();
                switch (input) {
                    case 1 :
                        System.out.print("amount money to be saved : ");
                        bank.menabung(inp.nextInt());
                        System.out.println("Thank you for Saving");
                        break;
                    case 2 :
                        System.out.print("How much money to take : ");
                        bank.mengambilUang(inp.nextInt());
                        System.out.println("Thank you for Transaksi");
                        break;
                    case 3 :
                        System.out.print("Rekening Number\t: ");
                        System.out.print("Nominal\t: ");
                        bank.transfer(inp.nextInt());
                        break;
                    case 4 :
                        System.out.println("---- Activity ----");
                        break;
                    case 5 :
                        System.out.println("---- Info Nasabah ----");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 2 :
                /* user  : agus
                 *  pin  : 222222
                 * */
                menuBacaBank();
                if(!super.accept){
                    return;
                }
                System.out.println("\n\n---- BACA Bank ----");
                System.out.printf("1. Save Money\n2. Take Money\n3. Transfer\n4. Activity\n5. Info Nasabah\n");
                System.out.print(">");
                input = inp.nextInt();
                switch (input) {
                    case 1 :
                        System.out.print("amount money to be saved : ");
                        bank.menabung(inp.nextInt());
                        System.out.println("Thank you for Saving");
                        break;
                    case 2 :
                        System.out.print("How much money to take : ");
                        bank.mengambilUang(inp.nextInt());
                        System.out.println("Thank you for Transaksi");
                        break;
                    case 3 :
                        System.out.print("Rekening Number\t: ");
                        System.out.print("Nominal\t: ");
                        bank.transfer(inp.nextInt());
                        break;
                    case 4 :
                        System.out.println("---- Activity ----");
                        break;
                    case 5 :
                        System.out.println("---- Info Nasabah ----");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 3 :
                /* user : dodi
                 * pin  : 222223
                 * */
                menuBroBank();
                if(!super.accept){
                    return;
                }
                System.out.println("\n\n---- BRO Bank ----");
                System.out.printf("1. Save Money\n2. Take Money\n3. Transfer\n4. Activity\n5. Info Nasabah\n");
                System.out.print(">");
                input = inp.nextInt();
                switch (input) {
                    case 1 :
                        System.out.print("amount money to be saved : ");
                        bank.menabung(inp.nextInt());
                        System.out.println("Thank you for Saving");
                        break;
                    case 2 :
                        System.out.print("How much money to take : ");
                        bank.mengambilUang(inp.nextInt());
                        System.out.println("Thank you for Transaksi");
                        break;
                    case 3 :
                        System.out.print("Rekening Number\t: ");
                        System.out.print("Nominal\t: ");
                        bank.transfer(inp.nextInt());
                        break;
                    case 4 :
                        System.out.println("---- Activity ----");
                        break;
                    case 5 :
                        System.out.println("---- Info Nasabah ----");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
