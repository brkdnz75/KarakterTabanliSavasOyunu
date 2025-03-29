import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oyun {
    private ArrayList<Karakter> dusmanlar;

    public void baslat(){
        dusmanlar = dusmanBelirle();
        AnaKarakter mc = new AnaKarakter("Berke Deniz");
        for (int i = 0; i < 5; i++) {
            savas(mc, dusmanlar.get(i));
        }
        savas(mc,new Ejderha());
        System.out.println("Dünyayı Kurtardın!!!!");
    }

    private void savas(AnaKarakter mc, Karakter dusman) {
        System.out.println(mc.getIsim()+" merhaba!");
        System.out.println(mc);
        System.out.println(dusman.getClass().getSimpleName()+" ile karşılaştın");
        System.out.println(dusman);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(mc.getIsim()+" : "+(mc.can+ mc.zirh) +
                    "   ---   "+dusman.getClass().getSimpleName()+" : "+
                    (dusman.can+dusman.zirh));
            System.out.println("1 - Saldır\n" +
                    "2 - Teslim Ol!\n" +
                    "Bir seçim yap :");
            int secim = sc.nextInt();
            switch (secim){
                case 1:
                    mc.saldir(dusman);
                    dusman.saldir(mc);
                    break;
                case 2:
                    System.out.println("GAME OVER!");
                    System.exit(0);
                default:
                    System.out.println("Yanlis seçim!");
            }
            if(mc.can <= 0){
                System.out.println("GAME OVER");
                System.exit(0);
            }
            if(dusman.can <= 0){
                System.out.println(dusman.getClass().getSimpleName() +
                        " düştü!");
                if(!dusman.getClass().getSimpleName().equals("Ejderha")){
                    mc.levelUp();
                }
                break;
            }
        }

    }

    private ArrayList<Karakter> dusmanBelirle() {
        ArrayList<Karakter> liste = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int secim = r.nextInt(8);
            switch (secim){
                case 0:
                    //Karakter k = new Asasin();
                    //liste.add(k);
                    liste.add(new Asasin());
                    break;
                case 1:
                    liste.add(new Goblin());
                    break;
                case 2:
                    liste.add(new Hayalet());
                    break;
                case 3:
                    liste.add(new Haydut());
                    break;
                case 4:
                    liste.add(new KurtAdam());
                    break;
                case 5:
                    liste.add(new Ork());
                    break;
                case 6:
                    liste.add(new Vampir());
                    break;
                case 7:
                    liste.add(new Zombi());
                    break;
            }
        }
        return liste;
    }
}

// Overloading Overriding





