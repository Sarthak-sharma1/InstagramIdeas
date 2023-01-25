package instagramideas;

public class FirstIdea {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=4;
        arr[2]=15;
        arr[3]=21;
        arr[4]=6;
        int sum=0;
        for (int i=0;i< arr.length;i++){
            if (i%2==0){
                sum+=arr[i];
            }
          // System.out.println(sum);
        }
        System.out.println(sum);
    }
}
