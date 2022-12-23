package PBO2SESI9.list;

public class Game {
    private String judul;
    private String genre;
    private int pcs;

    Game(String judul, String genre, int pcs){
        this.judul=judul;
        this.genre=genre;
        this.pcs=pcs;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getPcs(){
        return this.pcs;
    }

    public void infoGame(){
        System.out.println("Judul\t\t: "+getJudul());
        System.out.println("Genre\t\t: "+getGenre());
        System.out.println("PCS\t: "+getPcs());
        System.out.println("");
    }
}
