// linaer search
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      int[] arr = {1,2,35,5,3,6,5,32,5,7,5,5};
      int ele = 7;
      int flag = 0;
      for(int i=0;i<arr.length;i++){
        if(arr[i] ==ele){
          flag=1;
          break;
        }
        
      }
      if(flag==1){
        System.out.println("found");
      }
      else{
        System.out.println(" not found");
      }
    }
    // worst time complexity O(n)
    // best time complexity O(1)
    
    //space complexity O(1)
}