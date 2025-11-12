package OBSERVER_DESIGN_PATTERN;
import java.util.ArrayList;

public class YoutubeChannel implements Subject{

    ArrayList<Observer> subscribersList=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        this.subscribersList.add(observer);
    }

    @Override
    public void uploadVedio(String title) {
        String vedioName=title;
        for(int i=0;i<subscribersList.size();i++){
            subscribersList.get(i).getNotified(vedioName);
        }
    }
}
