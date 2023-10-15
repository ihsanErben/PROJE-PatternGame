
import java.util.Scanner;

public class Kral {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sistem sistem = new Sistem();
        
        sistem.sistem1();

        if (sistem.correct >= 4) {
            System.out.println();
            System.out.println("1-ilk kademeyi tekrar oynamak istiyorum.");
            System.out.println("2-ikinci kademeye gecmek istiyorum.");
            System.out.println("Beni bi salin da kurtulayim amk ya.(CIKIS)");
            System.out.print("ilk kademeyi gectiniz. Lutfen secim yapiniz: ");
            int secim = input.nextInt();
            
            if(secim == 1){
                sistem.sistem1();
            }
            else if(secim == 2){
                sistem.sistem2();
            }else if(secim == 3){
                return;
            }else{
            System.out.println("gecersiz islem.");
            }
        }
    }

}
