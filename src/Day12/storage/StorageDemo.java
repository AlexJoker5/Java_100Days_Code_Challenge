package Day12.storage;

import java.util.Arrays;

public class StorageDemo {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.add("Hello");
        storage.add("Java");
        storage.add("Encapsulation");

        storage.show();

        String [] array = storage.getArray();
        Arrays.fill(array, null); // change array's values which we added into null;
        storage.show();
    }

}
