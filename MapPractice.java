import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {

    public static void main(String[] args){
        HashMap<String, String> phoneBook = new HashMap<String, String>();

        addPhoneNo(phoneBook, "sam", "0001000000");
        addPhoneNo(phoneBook,"tom", "01020003000");
        findPhoneNo(phoneBook, "tom");
        findPhoneNo(phoneBook, "alice");

        System.out.println();
        printList(phoneBook);
    }
    static void addPhoneNo(HashMap phoneBook, String name, String phoneNumber){
        phoneBook.put(name, phoneNumber);
    }
    static void printList(HashMap phoneBook){
        Set<Map.Entry<String, String>> entries = phoneBook.entrySet();

        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey()+ "=" + entry.getValue());
        }
    }
    static void findPhoneNo(HashMap phoneBook, String name){

        if(phoneBook.containsKey(name)){
            System.out.println(name + "=" + phoneBook.get(name));
        }else{
            System.out.println("Not found");
        }
    }
}
