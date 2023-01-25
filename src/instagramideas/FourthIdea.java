package instagramideas;

import java.util.HashMap;
import java.util.Map;

public class FourthIdea {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Hello");
        hashMap.put(2,"World");
        hashMap.put(3,"Java");
        hashMap.put(4,"Java Program");
        for (Map.Entry m:hashMap.entrySet()){
            int i = (int)m.getKey();
            if (i%2==0){
                System.out.println(m.getKey()+" ");
            }
        }

    }
}
