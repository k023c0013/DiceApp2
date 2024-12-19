public class Game {
  Player p1;
  Player p2;
  Dice d1;
  Dice d2;

  Game() {
    p1 = new Player();
    p2 = new Player();
    d1 = new Dice();
    d2 = new Dice();
  }

  void start() {
    p1.turn(d1);
    p2.turn(d2);

    System.out.println("Player1は: " + d1.getValue());
    System.out.println("Player2は: " + d2.getValue());

    judge();
  }
  void judge(){
    if(d1.getValue() > d2.getValue()) {
      System.out.println("Player1の勝ち！");
    }else if (d1.getValue() < d2.getValue()) {
      System.out.println("Player2の勝ち！");
    }else {
      System.out.println("あいこ！");
    }
  }
}