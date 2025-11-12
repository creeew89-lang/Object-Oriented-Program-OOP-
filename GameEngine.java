package NetwrokDefender.OOP;

import javax.sound.sampled.Port;
import java.util.Random;
import java.util.Scanner;

public class GameEngine {
    private int score;
    private Scanner scanner = new Scanner(System.in);
    private Firewall firewall = new Firewall();

    public void startGame() {
        System.out.println("Welcome to Network Defender!");
        System.out.println("You will evaluate 5 packets. \n");

        for (int i = 1; i <= 5; i++) {
            Packet packet = generatePacket();
            System.out.println("Packet " + i + ": " + packet.display());

            System.out.println("Your action (allow/block/quarantine): ");
            String userAction = scanner.nextLine().trim().toLowerCase();

            String correctAction = firewall.evaluate(packet);
            if (userAction.equals(correctAction)) {
                score += 2;
                System.out.println("Correct! +2 points");
            } else {
                score -= 1;
                System.out.println("Incorrect. Correct action was: " + correctAction + " (-1 point");
            }
            System.out.println("Current Score: " + score + "\n");
        }
        System.out.println("Game over! Final Score: " + score);
    }

    private Packet generatePacket() {
        String[] protocols = {"HTTPS", "FTP", "SMTP", "SSH", "DNS"};
        String protocol = protocols[new Random().nextInt(protocols.length)];
        String ip = "192.168." + new Random().nextInt(255) + "." + new Random().nextInt(255);
        int port = new Random().nextInt(65535);
        int threat = new Random().nextInt(3);

        return new Packet(ip, protocol, port, threat);
    }
}
