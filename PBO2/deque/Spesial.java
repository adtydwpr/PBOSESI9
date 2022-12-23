package PBO2SESI9.deque;

public class Spesial extends Karakter{
    private String nama;
    private float hp=3500;
    private float attack=150;
    private float defense=50;

    Spesial(String nama,float hp,float attack,float defense){
        this.nama=nama;
        this.hp=hp;
        this.attack=attack;
        this.defense=defense;
    }
    Spesial(String nama){
        this.nama=nama;
    }
    
    @Override
    String getName(){
        return this.nama;
    }
    @Override
    float getHp(){
        return this.hp;
    }
    @Override
    float getAttack(){
        return this.attack;
    }
    @Override
    float getDefense(){
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
