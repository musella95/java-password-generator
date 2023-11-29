package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        //creo delle variabili e le assegno i valori di
        //: nome, cognome, colore preferito e data di nascita di un utente
        String nameUser;
        String surnameUser;
        String favoriteColour;
        int dayOFbirth;
        int monthOfBirth;
        int yearOfBirth;
        String passwordGenerate="";



        // creo una variabile di tipo Scanner per leggere da tastiera
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        nameUser  = scan.nextLine();
        System.out.print("Inserisci il tuo cognome: ");
        surnameUser = scan.nextLine();
        System.out.print("Inserisci il tuo colore preferito: ");
        favoriteColour = scan.nextLine();
        System.out.print("Inserisci il tuo giorno di nascita ");
        dayOFbirth  = scan.nextInt();
        System.out.print("Inserisci il tuo mese(a numero) di nascita ");
        monthOfBirth  = scan.nextInt();
        System.out.print("Inserisci il tuo anno di nascita ");
        yearOfBirth  = scan.nextInt();
        int somm = dayOFbirth+monthOfBirth+yearOfBirth;
        // Stampo la password relativa ai dati forniti dall'utente
        System.out.print("la tua password sicurissima è : "+ nameUser +"-"+surnameUser+"-"+favoriteColour+"-"+somm);























                // prima della fine del programma chiudo lo scanner
                scan.close();
    }
}
