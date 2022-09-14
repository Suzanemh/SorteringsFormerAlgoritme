# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Suzane Hamze
s364759
s364759@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
Suzane har løst oppgaver knyttet til 1 person 

# Oppgavebeskrivelse

I oppgave 1 så gikk jeg frem følgende:

Linje 14: Lager en string som skriver ut hvis det ikke er noe elementer i arrayet. 
Linje 15: lager en integer med navn storstVerdi, setter verdien til 0
Linje 17-21: Her setter jeg arrayet sin lengde til å være mindre enn 1 med en if setning, hvis det er tilfelle vil feilmelding skrives ut. 
Deretter en ny else if setning som setter arrayet sin lengde til å være == 1. Hvis det er tilfelle setter vi storstTall til første element i indeks 1. 
Lager en for løkke med gitte intervaller, deretter en ny if setning med integer temp som bytter på verdi elementene i arrayet. 
Når elementene har gått seg gjennom for løkken og funnet største tall, setter vi det som lik a[i]
Til slutt returnerer vi verdien. 
Linje 35: metode ombyttinger
Linje 36: Hjelvariabel antall
Linje 38: for løkke
Linje 39-46: en if setning som øker med 1 hvis verdiene er gyldige. Deretter bytter vi på verdiene hvor det er nødvendig med hjelp av temp

Spørsmål for oppgave 1:
Når blir det færrest ombytninger? Blir færrest ombytninger når tabellen er sortert

Når blir det flest? Blir flest ombytninger når tabellen er usortert.

Hvor mange blir det i gjennomsnitt?

KODE for å lage gjennomsnittsmetoden:
       

    public class MainTest {

    package no.oslomet.cs.algdat.Oblig1;
    import java.util.Arrays;
    import java.util.Random;

    public static int snitt (int n) {

        int antallTester = n;
        int [] a;
        int sum = 0;
        int snitt;
        for (int i = 0; i < antallTester; i++) {
            a = randPerm(10);
            sum += Oblig1.ombyttinger(a);
        }
        snitt = sum / antallTester;
        return snitt;
    }

    public static void bytt(int[] a, int i, int j) { // Programkode 1.1.8 d hentet fra kompendium
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm (int n) {       //en effektiv versjon Programkode 1.1.8 e
        Random r = new Random();                 // en randomgenerator
        int[] a = new int [n];                   // en tabell med plass til n tall

        Arrays.setAll(a, i -> i +1);             // Legger inn tallene 1-n i arrayet

        for (int k = n - 1; k > 0; k--) {        // Løkke som går n-1 ganger
            int i = r.nextInt(k+1);       // et tilfeldig tall fra 0-k
            bytt(a, k, i);                      // Bytter om
        }

        return a;                               // Permutasjonen returneres
    }

    public static void main(String[] args) {
        System.out.println(snitt(5));
    }
    }

    //System.out.println(Arrays.toString(a));
    //System.out.println(Oblig1.ombyttinger(a));
    //System.out.println(Arrays.toString(a)); //for at arrayet blir skrevet ut

Jeg mener at denne maks metoden er mindre efektiv enn de andre maks metodene på grunnlag av at her bytter metoden hvert tall,
istedenfor å bare gå gjennom arrayet og finne det største tallet. 

I oppgave 2 gikk jeg frem følgende:
Linje 53: setter en tellerverdi til integer med veriden 1
Linje 55-57: en if setning som håndterer array som ikke er sortert. I tilfelle vil den skrive ut en melding i terminalen
Linje 65-71: if setningen som skjekker om verdiene til indeksene ikke er like. Hvis det er tilfelle vil den
returnene tellerVerdi integer. Eksempel er hvis jeg har arrayet 1 2 3 3 4 5. Vil arrayet ha 5 verdier, selvom 3 oppstår
to ganger. 

I oppgave 3 gikk jeg frem følgende:
Linje 77-79: If setning som håndterer om tabellen er tom
Linje 80-88: Siden tabellen er usortert, lages det for løkker med boolean som skal si fra om tallet "likTall"
er true eller false. Slik finner vi ut hvor mange forskjellege verdier tabellen har. 
Linje 89-91: If setning som tar for seg hvis boolean likTall ikke er sann. Da vil tellerVerdi fortsette å øke. 
Linje 95: returnerer tellerVerdi som forteller oss hvor mange forskjellige verider
arrayet har. 

I oppgave 5 gikk jeg frem slik:

I oppgave 7 gikk jeg frem slik:
Oppgaven her tar inn String parametere, derfor kan vi bruke StringBuilder for å operere med det.
int resten er en variabel som fletter sammen det som er til overs helt mot slutten av flettingen.
StringBuiler er en metode som ligner på det vi har lært i Java, det med String ut = " ;"
Lager en for løkke, i for løkke starter vi å flette inn strengene frem til de har lik lengde.
Deretter fletter vi resten ved bruk av variabelen resten. 

