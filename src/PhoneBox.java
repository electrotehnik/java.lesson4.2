import java.util.HashMap;
import java.util.HashSet;

public class PhoneBox {
    HashMap<String, HashSet<String>> phoneMap;

    public PhoneBox() {
        this.phoneMap = new HashMap<String, HashSet<String>>();
    }

    public void add(String name, String phone) {
        HashSet<String> phoneSet = phoneMap.getOrDefault(name,  new HashSet<>());
        phoneSet.add(phone);
        phoneMap.put(name, phoneSet);
    }

    public void findString(String name) {
        if(phoneMap.containsKey(name)) {
            System.out.println(phoneMap.get(name));
        } else {
            System.out.println("Такой фамилии нет");
        }
    }

    public static void main(String[] args) {
        PhoneBox phoneBox = new PhoneBox();

        phoneBox.add("Алексей", "+7(917)1234567");
        phoneBox.add("Николай", "+7(917)2456785");
        phoneBox.add("Анна", "+7(917)5477789");
        phoneBox.add("Анна", "+7(965)2768850");
        phoneBox.add("Петр", "+7(965)3678350");
        phoneBox.add("Агафья", "+7(347)2354670");

        phoneBox.findString("Анна");
        phoneBox.findString("Алексей");
    }
}
