//import java.util.Scanner;
//public class Multiplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a name :");
//        int num = sc.nextInt();
//
//        for(int i=1; i<11;i++){
//            System.out.println(num +"*" + i + "=" +(num*i));
//        }
//
//    }
//}

//import java.util.Scanner;
//
//public class Multiplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a word :");
//        String word = sc.nextLine();
//
//        for(int i =0; i<word.length();i++){
//            System.out.println(word.charAt(i));
//        }
//
//        }
//    }

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}












