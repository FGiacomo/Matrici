/*
 * Esempi di gestione delle matrici di interi.
 */

package matrici;

/**
 *
 * @author Fantato Giacomo
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matrice m = new Matrice(10, 20); //righe per colonne
        
        m.fillRandom();
        System.out.println(m);
      
        m.toFile("matrice.csv"); //cambio estensione in .csv, migliore per dati che non hanno virgole dentrogmail
        
      
    }
    
}
