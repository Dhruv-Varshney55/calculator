package Largest;

public class Largest {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 9;
        int largest;
        if(a>=b && a>=c){
            largest = a;
        }
        else if(b>=a && b>=c){
            largest = b;
        }
        else{
            largest = c;
        }
        System.out.println("The largest number is: " + largest);
    }
}
