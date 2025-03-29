import java.util.Random;

public class Karakter {
    protected int can;
    protected int zirh;
    protected int kritikOran;
    protected int saldiriGucu;
    protected int savunmaGucu;
    public void saldir(Karakter k){
        Random r = new Random();
        int saldiriDegeri=this.saldiriGucu+r.nextInt(-20,21);
        if(saldiriDegeri<=k.savun()){
            System.out.println("Bloklandı!");
            return;
        }
        if (r.nextInt(1,101) <= kritikOran){
               saldiriDegeri *=2;
        }
        System.out.println(this.getClass().getSimpleName()+" "+
                k.getClass().getSimpleName()+"'a "+saldiriDegeri+
                "hasar verdi!");
        k.can=k.can +k.zirh-saldiriDegeri;
        k.zirh=0;
    }
    public int savun(){
        Random r= new Random();
        int savunmaDegeri=r.nextInt(this.savunmaGucu-10,this.savunmaGucu+10);
        return savunmaDegeri;
     }

    @Override
    public String toString() {
        return "Can:"+can+
                "\nZırh:"+zirh+
                "\nKritik Oran:"+kritikOran+
                "\nSaldırı Gücü:"+saldiriGucu+
                "\nSavunma Gücü:"+savunmaGucu;
    }
}
