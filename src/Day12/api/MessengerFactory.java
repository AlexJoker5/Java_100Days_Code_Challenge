package Day12.api;

public class MessengerFactory {

    public static Messenger generate(){
        return new MessengerImpl();
    }

}
