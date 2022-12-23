package PBO2SESI9.list;
import java.util.ArrayList;;

public class GameList{
    public static void main(String[] args) {
        Game game1=new Game("Persona 10", "RPG", 100);
        Game game2=new Game("Persona 11 Golden", "RPG", 80);
        Game game3=new Game("Persona 12 Royal", "RPG", 25);
        Game game4=new Game("Sword art Online", "MMORPG", 15);

        ArrayList<Game> GameNya=new ArrayList<Game>();
        GameNya.add(game1);
        GameNya.add(game2);
        GameNya.add(game3);
        GameNya.add(game4);

        for(Game game: GameNya){
            game.infoGame();
        }
    }
}
