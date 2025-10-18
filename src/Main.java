import java.util.*;

public class Main {
    HashMap<String, String> phoneBook = new HashMap<String, String>();
    String[] searchWords =  {"Алексей", "Анна"};

    void initPhoneBook() {
        phoneBook.put("+7(917)1234567", "Алексей");
        phoneBook.put("+7(917)2456785", "Николай");
        phoneBook.put("+7(917)5477789", "Анна");
        phoneBook.put("+7(965)2768850", "Анна");
        phoneBook.put("+7(965)3678350", "Петр");
        phoneBook.put("+7(347)2354670", "Агафья");
    }

    public void main(@SuppressWarnings("unused") String[] args) {
        initPhoneBook();

        for(int i=0;i<searchWords.length;i++) {
            System.out.println("Телефон(ы) контакта: " + searchWords[i]);
            for(String key : phoneBook.keySet()) {
                if(phoneBook.get(key).equals(searchWords[i])) {
                    System.out.print(key + ", ");
                }
            }
            System.out.println();
        }
    }
}