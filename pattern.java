import java.util.*;
public class pattern {
   public static void hollow(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=b; j++){
            if(i == 1 || i == a || j == 1 || j == b){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }

   public static void invertedpyramid(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=a-i; j++){
            System.out.print(" ");
         }
         for(int k = 1; k<=i; k++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void invertedpyramidnum(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=a-i+1; j++){
            System.out.print(j);
         }
         System.out.println();
      }
   }

   public static void floyds(int a, int b){
      int num = 1;
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=i; j++){
            System.out.print(num);
            num++;
         }
         System.out.println();
      }
   }

   public static void binaryTriangle(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=i; j++){
            if((i+j) % 2 == 0){
               System.out.print("1");
            }else{
               System.out.print("0");
            }
         }
         System.out.println();
      }
   }

   public static void butterfly(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         for(int j = 1; j<=2*(a-i); j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }

       for(int i = a; i>=1; i--){
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         for(int j = 1; j<=2*(a-i); j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void rhombus(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=a-i; j++){
            System.out.print(" ");
         }
         for(int k = 1; k<=a; k++){
            System.out.print("*");
         }
         System.out.println();
      }
   }

   public static void hollowRhombus(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=a-i; j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=a; j++){
            if(i == 1 || i == a || j == 1 || j == a){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }

   public static void diamond(int a, int b){
      for(int i = 1; i<=a; i++){
         for(int j = 1; j<=a-i; j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         for(int j = 1; j<=i-1; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      for(int i = a-1; i>=1; i--){
         for(int j = 1; j<=a-i; j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         for(int j = 1; j<=i-1; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   }
    public static void main(String args[]){
      int a = 6;
      int b = 5;
      diamond(a,b);
    }
}



