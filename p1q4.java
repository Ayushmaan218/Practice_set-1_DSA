/*- Create a " Song " class with a constructor that includes the song's title, artist, and
duration. The class should have methods for setting and getting these attributes and a
method for playing the song. */

import java.util.Scanner;

class song{
    String title;
    String artist;
    double duration;
    song(String t,String a,double d){
        title = t;
        artist = a;
        duration = d;
    }
    public String gettitle(){
        return title;
    }
    public String getartist(){
        return artist;
    }
    public double getduration(){
        return duration;
    }
    public void settitle(String t){
        title = t;
    }
    public void setartist(String a){
        artist = a;
    }
    public void setduration(double d){
        duration = d;
    }
}
public class p1q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title");
        String t = sc.nextLine();
        System.out.println("Enter the artist name");
        String a = sc.nextLine();
        System.out.println("Enter the duration");
        double d = sc.nextDouble();
        song s = new song(t, a, d);
        System.out.println("Title of the Song: "+t);
        System.out.println("Name of the Artist: "+a);
        System.out.println("Duration of the song: "+d);
    }
}
