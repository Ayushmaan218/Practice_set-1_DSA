/*Create a class called "Rectangle" with a constructor that takes in the length and
width of the rectangle. The class should have methods for calculating the area and
perimeter of the rectangle. */

import java.util.Scanner;

class rectangle{
    int length;
    int bredth;
    rectangle(int l, int b){
        length = l;
        bredth = b;
    }
    public int calculatArea(){
        return length*bredth;
    }
    public int calculatPerimeter(){
        return 2*(length+bredth);
    }
}

public class p1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the bredth");
        int b = sc.nextInt();
        rectangle r = new rectangle(l, b);
        System.out.println("Area of the reactangle: "+r.calculatArea());
        System.out.println("perimeter of the rectangle: "+r.calculatPerimeter());
    }
}
