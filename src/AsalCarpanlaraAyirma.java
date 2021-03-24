import java.util.Scanner;

public class AsalCarpanlaraAyirma {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int sayi= scan.nextInt();

        if(sayi > 0) {

        
        while(sayi % 2== 0 ){
            System.out.print(2 + " ");
            sayi /=2 ;
        }

        for(int i = 3 ; i <= sayi ; i+= 2){
            while (sayi % i ==0) {
                System.out.print(i + " ");
                sayi /= i;
            }
        }
        if(sayi > 2){
            System.out.print(sayi);
        }


    }

   }
}
