package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        int storstTall = 0;

        if (a.length < 1) {
            throw new NoSuchElementException("Ingen elemeter finnes i arrayet");
        } else if (a.length == 1) {
            storstTall = a[0];
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) { //blir i-1 fordi vi skal se på indeksen til venstre
                int temp = a[i]; //for å ikke miste verdien
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
            storstTall = a[i];
        }
        return storstTall;
    }


    public static int ombyttinger(int[] a) {
        int antall = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                antall++;

                int temp = a[i]; //for å ikke miste verdien
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }
        return antall;
    }



    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        int tellerVerdi = 1;//teller som starter på 1

        if(a.length == 0){ //hvis tabellen er tom, har lengde 0
            tellerVerdi = 0;
        }

        //for løkke som tar for seg hvis tabellen ikke er sortert
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1]){
                throw new IllegalStateException("Arrayet er ikke sortert!");
            }

            //skjekker om elementene er like eller ikke fra den forrige indeksen
            if(a[i-1] != a[i]){
                tellerVerdi++;
            }
        }
        return tellerVerdi;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
       int tellerVerdi = 0;

       if(a.length == 0){ //hvis tabellen er tom
           tellerVerdi = 0;
    }
       //for løkke som løper gjennom tabellen
        for(int i = 0; i < a.length; i++){
            boolean likTall = false;
        //for løkke som igjen løper gjennom tabellen, skjekker om indeksene er like
            for(int j = 0; j < i; j++){
                if(a[j] == a[i]){
                    likTall = true;
                }
            }
            //if statament som tar for seg hvis likTall ikke er lik
            if(!likTall){
                tellerVerdi++;
            }
        }
        //returnerer antall forskjellige verdier
        return tellerVerdi;
       }


    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        //ta med partering
       // 1.3.9.h

        // 1.3.9.f
       // 1.3.9.a
        //1.1.8.d


    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        int enhet = 1;      //intialiserer en verdi, med verdi 1
        int n = a.length;  // int har arrayet sin lengde
        if (n < 2) return;         // skjekker at arrayet ikke er tomt, eller inneholder kun en verdi, derfor er den større enn 2


        char[] b = Arrays.copyOfRange(a, n - enhet, n);           // hjelpetabell som kopierer det som skal skyves ut av tabellen
        for (int i = n - 1; i >= enhet; i--) a[i] = a[i - enhet];     // forskyver en og en verdi i indeksen en enhet om gangen.
        System.arraycopy(b, 0, a, 0, enhet);             // kopierer tilbake det som ble skjevet ut, til starten av arrayet


    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
      int resten = Math.min(s.length(), t.length()); //når stringen er flettet, vil den ta resten, som e k her.
      StringBuilder ut = new StringBuilder(); //denne ligner på String ut = "";

      for(int i = 0; i < resten ; i++){
          ut.append(s.charAt(i)).append(t.charAt(i)); //her legges String inn i fra s og t til det er ferdig med lik lengde
      }

      //koden under fletter sammen det som er til overs.
      ut.append(s.substring(resten)).append(t.substring(resten));

      //retur
        return ut.toString();
    }

    /// 7b)
    public static String flett(String... s) {
        int sLengde = s.length; //antall ord i arrayet
        String ut = ""; //oppretter String ut
        int lengst = 0; //lengste ordet i arrayet

        //for løkke som finner den lengste orden
        for(int i = 0; i < sLengde ; i++){
            int ordLengde =s[i].length();
            if(ordLengde > lengst){
                lengst = ordLengde;
            }
        }

        //denne if setningen sjekker hvis lengden av s har en tom streng
        if(sLengde == 0){
            ut += "";
        }
        //Oppretter for løkker
        for(int i = 0; i < lengst ; i++){
            for(int j = 0; j < sLengde; j++){
                if(s[j].length() > i){
                    //bygger ut strengen inni for løkke nummer 2, altså de som skal bli skrevet ut
                    ut += s[j].charAt(i); //i teller bokstaver, j teller ord
                }
            }
        }
        return ut;
       // throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1
