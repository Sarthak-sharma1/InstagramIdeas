package instagramideas;

public class SixthIdea {
    static void test(){
        try {
            String x= null;
            System.out.print(x.toString() +" ");
        }finally {
            System.out.print("Finally");
        }
    }

    public static void main(String[] args) {
        try {
  test();
        }catch (Exception e){
            System.out.print("Exception"+ e);
        }
    }
}
