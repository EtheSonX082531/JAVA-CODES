package OBSERVER_DESIGN_PATTERN;

public class Main {
    public static void main(String[] args) {
        Subject channel=new YoutubeChannel();
        Observer s1=new Subscriber("Anik Roy");
        Observer s2=new Subscriber("Marian Chowdhury");
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.uploadVedio("Thalapathy 69");
    }
}
