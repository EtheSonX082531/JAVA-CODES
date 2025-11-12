package OBSERVER_DESIGN_PATTERN;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void getNotified(String title) {
        System.out.println("Notification to ["+name+"] New Vedio Uploaded Which's Title Is: "+title);
    }
}
