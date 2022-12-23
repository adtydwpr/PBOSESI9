package PBO2SSESI9.deque;

public class Kunglaw extends Karakter{
    private String nama;
    private float hp=2650;
    private float attack=150;
    private float defense=25;

    Kunglaw(String nama,float hp,float attack,float defense){
        this.nama=nama;
        this.hp=hp;
        this.attack=attack;
        this.defense=defense;
    }
    Kunglaw(String nama){
        this.nama=nama;
    }
    
    @Override
    String getName() {
        return this.nama;
    }
    @Override
    float getHp() {
        return this.hp;
    }
    @Override
    float getAttack() {
        return this.attack;
    }
    @Override
    float getDefense() {
        return this.defense;
    }

    @Override
    public void infoKarakter() {
        System.out.println(
            getName()+" :"+
            "\n\tHP\t: "+getHp()+
            "\n\tAttack\t: "+getAttack()+
            "\n\tDefense\t: "+getDefense()
        );
        System.out.println("");
    }
}
