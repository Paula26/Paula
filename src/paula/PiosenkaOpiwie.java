
package paula;

public class PiosenkaOpiwie {
    public static void main(String[]args) {
        
        int iloscButelek = 99;
        String slowo = "butelek";
         
        while (iloscButelek > 0) {
            if (iloscButelek == 1){
                slowo = "butelka"; //liczba pojedyńcza
            }
            System.out.println(iloscButelek + " " + slowo + " piw na ścianie" );
            System.out.println(iloscButelek + " " + slowo + " piw");
            System.out.println("Weź sobie jedno.");
            System.out.println ("Podaj je w koło");
            System.out.println();
            
            iloscButelek = iloscButelek - 1;
            
            if (iloscButelek > 0) {
                System.out.println(iloscButelek + " " + slowo + " piw na ścianie");
            } else {
                System.out.println("No i nie ma już piwa na ścianie");
            }// koniec else
    } // koniec while 
} // koniec main
} // koniec class
