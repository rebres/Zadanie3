import java.util.Scanner;
public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String DNA = scan.nextLine();
        int[] tablica = new int[4];
        tablica = Zliczanie(DNA);
        for( int i=0; i<4; i++){
            System.out.print(tablica[i] + ", ");
        }

}
    public static int[] Zliczanie(String DNA) {

        int[] tablica2;
        
        tablica2 = new int[4];

        for( int i=0; i<DNA.length(); i++){

            if(DNA.charAt(i) == 'A'){
                tablica2[0] = tablica2[0] + 1;
            }else if(DNA.charAt(i) == 'T'){
                tablica2[1] = tablica2[1] + 1;
            }else if(DNA.charAt(i) == 'G'){
                tablica2[2] = tablica2[2] + 1;
            }else if(DNA.charAt(i) == 'C'){
                tablica2[3] = tablica2[3] + 1;
            }
        }
        return tablica2;
    }
    }

