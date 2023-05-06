/*Write a Java program to print the area of a rectangle by creating a class named 'Area'
having two methods. The first method, named 'setDim' takes the length and breadth of
the rectangle as parameters, and the second method, named 'getArea', returns the area
of the rectangle. The length and breadth of the rectangle are entered through the
keyboard. */

import java.util.Scanner;

class area{
    int length;
    int breadth;
    public void setDim(int l,int b){
        length = l;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
}

public class p1q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the bredth");
        int b = sc.nextInt();
        area a1 = new area();
        a1.setDim(l,b);
        System.out.println("Area of rectangle: "+a1.getArea());
    }
}