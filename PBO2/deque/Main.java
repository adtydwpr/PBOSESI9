package PBO2SESI9.deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Spesialis brawler=new Spesialis("Brawler");
        Spesialis armose=new Spesialis("Armored Horse",3000,150,25);
        Spesialis priest=new Spesialis("Priestes",3000,130,20);

        Kunglaw ksword=new Kunglaw("Kunglaw Swords");
        Kunglaw paladin=new Kunglaw("Paladin",2500,150,15);
        Kunglaw kaxe=new Kunglaw("Kunglaw Axe",2500,150,20);

        ArrayDeque<Kunglaw> karaKunglaw=new ArrayDeque<Kunglaw>();
        ArrayDeque<Spesialis> karaSpesialis=new ArrayDeque<Spesialis>();

        karaSpesialis.add(brawler);
        karaSpesialis.addFirst(armose);
        karaSpesialis.add(priest);

        karaKunglaw.add(ksword);
        karaKunglaw.add(paladin);
        karaKunglaw.addFirst(kaxe);

        System.out.println("Karakter Spesialis : ");
        for(Spesialis spesialis: karaSpesialis){
            spesialis.infoKarakter();
        }
        System.out.println("");
        System.out.println("Karakter Kunglaw :");
        for(Kunglaw kishi: karaKunglaw){
            kishi.infoKarakter();
        }
    }
}
