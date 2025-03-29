import java.util.Scanner;

public class AnaKarakter extends Karakter{


    private  String isim;
    private int maxCan;
    private int maxZirh;
    public AnaKarakter(String isim){
        this.isim=isim;
        this.can=119;
        maxCan=this.can;
        this.zirh=30;
        maxZirh=zirh;
        this.kritikOran=30;
        this.saldiriGucu=30;
        this.savunmaGucu=25;

    }
    public String getIsim() {
        return isim;
    }
    public void levelUp(){
        this.can=this.maxCan;
        this.zirh=this.maxZirh;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1-Can Yükselt\n"+
                    "2-Zırh Yükselt\n"+
                    "3-Kritik Oran Yükselt\n"+
                    "4-Saldırı Gücü Yükselt\n"+
                    "5-Savunma Gücü Yükselt\n"+
                    "Lütfen Seçim Yap :");
            int secim=sc.nextInt();
            switch (secim){
                case 1:
                    this.can +=50;
                    this.maxCan+=50;
                    System.out.println("Can Arttırıldı!");
                    return;
                case 2:
                    this.zirh +=50;
                    this.maxZirh+=50;
                    System.out.println("Zırh Arttırıldı!");
                    return;
                case 3:
                    this.kritikOran +=10;
                    System.out.println("Kritik Şansı Arttırıldı!");
                    return;
                case 4:
                    this.saldiriGucu +=10;
                    System.out.println("Saldırı Gücü Arttırıldı!");
                    return;
                case 5:
                    this.savunmaGucu +=10;
                    System.out.println("Savunma Gücü Arttırıldı!");
                    return;
                default:
                    System.out.println("Yanlis seçim!");
            }
        }
    }
}
