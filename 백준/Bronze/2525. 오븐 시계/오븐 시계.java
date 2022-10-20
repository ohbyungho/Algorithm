import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
   
   Scanner in = new Scanner(System.in);
      
   
      int hour = in.nextInt();
      int minute = in.nextInt();
      int time = in.nextInt();
      int sum = minute + time;
      
      if(sum > 60) {
    	  int a = sum / 60;
    	  int b = sum % 60;
    	  minute = 0 + b;
    	  hour = hour + a;
      }
      else {
    	  minute += time;
      }
      if(minute == 60) {
    	  minute = 0;
    	  hour++;
      }
      if(hour >= 24){
    	  hour = hour - 24;
      }
      System.out.println(hour + " " + minute);
      
     
     
      }

}