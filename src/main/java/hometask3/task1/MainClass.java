package hometask3.task1;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {

        PingPongWriter ping = new PingPongWriter("Ping");
        PingPongWriter pong = new PingPongWriter("Pong");

        ping.start();
        pong.start();
    }
}
