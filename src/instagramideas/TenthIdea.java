package instagramideas;

public class TenthIdea {

    public String print(int i){
       String msg = "hello";

       if (i == 1){
           msg = "World";
       }else
           msg = "Java";

       return  msg;
    }

    public static void main(String[] args) {
       TenthIdea idea = new TenthIdea();
       String n =idea.print(2);
        System.out.println(n);
    }
}
