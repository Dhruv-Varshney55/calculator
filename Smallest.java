package Smallest;

public class Smallest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        int smallest;
        if(a<=b && a<=c){
            smallest = a;
        }
        else if(b<=a && b<=c){
            smallest = b;
        }
        else{
            smallest = c;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
