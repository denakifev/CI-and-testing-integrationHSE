package operations;
import java.io.File;
import java.lang.Math;
import java.io.IOException;
import java.util.Scanner;


class operations{


  public static int _min(String file){
    try {
      int ans = Integer.MAX_VALUE;
      Scanner in = new Scanner(new File(file));
      while(in.hasNextInt()){
        ans = Math.min(ans, in.nextInt());
      }
      in.close();
      return ans;
    }
    catch (IOException e){
      System.out.println("File has not been found");
      return Integer.MAX_VALUE;
    }

  }

  public static int _max(String file){
    try {
      int ans = Integer.MIN_VALUE;
      Scanner in = new Scanner(new File(file));
      while(in.hasNextInt()){
        ans = Math.max(ans, in.nextInt());
      }
      in.close();
      return ans;
    }
    catch (IOException e){
      System.out.println("File has not been found");
      return Integer.MIN_VALUE;
    }
  }

  public static long _sum(String file){
    try {
      long ans = 0;
      Scanner in = new Scanner(new File(file));
      while(in.hasNextInt()){
        ans += in.nextInt();
      }
      in.close();
      return ans;
    }
    catch (IOException e){
      System.out.println("File has not been found");
      return 0;
    }
  }

  public static long _mult(String file){
    try {
      long ans = 1;
      Scanner in = new Scanner(new File(file));
      while(in.hasNextInt()){
        ans *= in.nextInt();
      }
      in.close();
      return ans;
    }
    catch (IOException e){
      System.out.println("File has not been found");
      return 1;
    }
  }

}



public class Main {

}
