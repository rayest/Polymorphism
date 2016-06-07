package thinkingInJava.compositeUse;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/7 0007.
 */
class Game {
    public Game(int i){
        print("Game constructor");
    }
}

class BoardGame extends Game{
    public BoardGame(int i){
        super(i);
        print("BoardGame constructor");
    }
}

class ChessGame extends BoardGame {
    public ChessGame() {
        super(1);
        print("ChessGame constructor");
    }
}

public class AppSuper{
    public static void main(String[] args) {
        ChessGame chess = new ChessGame();
    }
}
