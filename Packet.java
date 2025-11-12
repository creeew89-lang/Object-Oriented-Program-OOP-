package NetwrokDefender.OOP;

public class Packet {
    private String sourceIP;
    private String protocol;
    private int port;
    private int threatLevel;

    public Packet(String sourceIP, String protocol, int port, int threatLevel) {
        this.sourceIP = sourceIP;
        this.protocol = protocol;
        this.port = port;
        this.threatLevel = threatLevel;
    }

    public String getSourceIP() {
        return sourceIP;
    }

    public void setSourceIP(String sourceIP) {
        this.sourceIP = sourceIP;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(int threatLevel) {
        this.threatLevel = threatLevel;
    }

    public String display() {
        return "Souce IP: " + sourceIP +
                ", Protocol: " + protocol +
                ", Port: " + port +
                ", Threat Level: " + threatLevel;

    }
}