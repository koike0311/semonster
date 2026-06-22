public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER GAME");
    System.out.println("Show a new monster!");

    Player player = new Player();  // ← 追加
    player.drawMonsters();         // ← 追加
    player.showDeck();             // ← 追加
  }
}