package Day12;

import Day12.api.Messenger;
import Day12.api.MessengerFactory;

public class MessengerDemo {

    public static void main(String[] args) {
        Messenger m = MessengerFactory.generate();

        m.sent("Christopher");
        /*We can only use MessengerImpl's sent method
        since MessengerImpl implements Messenger interface
        and Messenger interface only has sent method.*/

        System.out.println(m.getClass());
    }

}
