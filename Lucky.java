import java.util.*;
public class Lucky {
 
  public static boolean checkif(String b){
    int s = Integer.parseInt(b);
    int [] arr = {4,7,47,74,447,474,477};
    for(int i =0;i<arr.length;i++){
      if(s%arr[i]==0){
          System.out.println("YES");
          return true;
      }
    }
    b = b.replace("4","");
    b = b.replace("7","");
    if(b.length() ==0 ){// we remove all iterations of 4 and 7 if there are still number left than that means it is not
      //a lucky number
      System.out.println("YES");
      return true;
    }
    else{
       System.out.println("NO");
    }
    return false;
  }
    public static void main(String [] args){
      Scanner sc = new Scanner (System.in);
      String num = sc.next();
      boolean lucky4 = false;
      boolean lucky7 = false;
      int n=0;
      checkif(num);
    }
   
}