package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
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

        //for løkke som tar for seg hvis arrayet ikke er sortert
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
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
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
