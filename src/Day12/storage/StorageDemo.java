package Day12.storage;

public class StorageDemo {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.add("Hello");
        storage.add("Java");
        storage.add("Encapsulation");

        storage.show();

        String [] array = storage.getArray();
    }

}
