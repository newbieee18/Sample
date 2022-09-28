
package practice;

import java.util.*;

/**
 *
 * @author JEC
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        int[][] array = {{5, 6, 1, 2}, 
//                        {8, 7, 9, 11}};
//        
//        
//        for (int i = 0; i < array.length; i++) {
//            Arrays.sort(array[i]);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++)
//                System.out.print(array[i][j] + " ");
//                System.out.println();
//        }

        myMethod();
        myMethod1(); 
        myMethod2();
        myMethod3();
        myMethod4();
        
        Handler handler = new Handler("Gerald", "Saquiton", "Altuna", 22);
        handler.setAge(21);
        System.out.println(handler.getAge() + handler.getGivenName());
        
    }
    
    public static void myMethod(){
        
        int a=1, b=2, c=3;
        int tmp;
        tmp = a;
        a = b;
        b = c;
        c = tmp;
        System.out.println("A:" + a + " B:" + b + " C:" + c);
        
    }
    
    public static void myMethod1(){
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++)
                System.out.print(" ");
                for (int k = 0; k < (2 * i + 1); k++)
                    System.out.print("*");
                    System.out.println();
        }
        
    }
    
    public static void myMethod2(){
       
        int[] mArray = {100,89,300,51,200,400,41,69,100};
        
        for(int i = 0; i < mArray.length; i++){
            for(int j = i+1; j < mArray.length; j++){
                int tVal;
                if(mArray[i] > mArray[j]){
                    tVal = mArray[i];
                    mArray[i] = mArray[j];
                    mArray[j] = tVal;
                }
            }
            System.out.println(mArray[i]);
        }
        
    }
    
    public static void myMethod3(){
        
        int a=10, b=5;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("A: " + a + "\nB: " + b);
        
    }
    
    public static void myMethod4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your gender?");
        String gender = sc.nextLine();
        
        if(gender.equals("male") || gender.equals("female")){
            System.out.println("You are from the city of truth!");
        }
        
    }
    
}
