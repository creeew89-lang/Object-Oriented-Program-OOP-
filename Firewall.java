package NetwrokDefender.OOP;

import NetwrokDefender.OOP.Packet;

public class Firewall {
    public String evaluate(Packet packet) {
        int threat = packet.getThreatLevel();
        String protocol = packet.getProtocol();

        if (threat == 0) {
            return "allow";
        } else if (threat == 1) {
            if (protocol.equalsIgnoreCase("FTP") || protocol.equalsIgnoreCase("SMTP")) {
                return "quarantine";
            } else {
                return "allow";
            }
        } else if (threat == 2) {
            return "block";
        }

        return "unknown";
    }
}