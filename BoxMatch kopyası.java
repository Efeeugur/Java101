import java.util.Random;

public class BoxMatch {
    private Boxer player1;
    private Boxer player2;
    private boolean isFirstPlayerTurn;

    public BoxMatch(Boxer player1, Boxer player2) {
        this.player1 = player1;
        this.player2 = player2;
        Random random = new Random();
        isFirstPlayerTurn = random.nextBoolean();
        System.out.println("Maça " + (isFirstPlayerTurn ? player1.getName() : player2.getName()) + " başlıyor.");
    }

    public void start() {
        int round = 1;
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            System.out.println("Raund " + round);
            Boxer attacker = isFirstPlayerTurn ? player1 : player2;
            Boxer defender = isFirstPlayerTurn ? player2 : player1;
            System.out.println(attacker.getName() + " saldırıyor.");
            attacker.attack(defender);
            isFirstPlayerTurn = !isFirstPlayerTurn;
            round++;
        }
        System.out.println("Maç bitti.");
        Boxer winner = player1.getHealth() > 0 ? player1 : player2;
        System.out.println(winner.getName() + " kazandı!");
    }

    public static void main(String[] args) {
        Boxer player1 = new Boxer("Ali", 100, 20);
        Boxer player2 = new Boxer("Veli", 100, 18);
        BoxMatch match = new BoxMatch(player1, player2);
        match.start();
    }
}