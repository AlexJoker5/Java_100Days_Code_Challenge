package Day12.api;

class MessengerImpl implements Messenger{
    /*MessengerImpl class uses default-package access modifier.
    * So, other classes such as MessengerDemo can't access MessengerImpl class.*/
    @Override
    public void sent(String message) {
        System.out.println("Hello " + message);
    }

    public void greet(){
        System.out.println("Hello");
    }

}
