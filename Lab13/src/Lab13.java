//course: CSC190
//project: Lab 13
//date: 11/30/18
//author: Thomas Morris
//purpose: Plot a histogram with the frequencies of the occurence of each letter of the alphabet of the string.

import java.util.Scanner;
class Histogram {
    String text;
    
    Histogram(){
        text = "I love problem-solving.";
    }
    
    void setText(String t){
        text = t;
    }
    
    void drawHistogram(){
        int f[] = new int[26];
        for(int i = 0; i < 26; i++)
            f[i] = 0;
        
        for (int i = 0; i  < text.length(); i++)
            if (text.toLowerCase().charAt(i) >= 'a' && text.toLowerCase().charAt(i) <= 'z')
                f[text.toLowerCase().charAt(i)-'a'] += 1;
        
        int max = f[0];
        for (int i = 1; i < 26; i++)
            if (f[i] > max)
                max = f[i];
        
        String r = "";
        while (max > 0){
            for (int i = 0; i < 26; i++)
                if (f[i] == max){
                    f[i]--;
                    r=r+"* "; 
                }
                else
                    r=r+"  ";
            max--;
            System.out.println(r);
            r="";
        }
        
        System.out.println();
        for (int i = 0; i < 26; i++){
            System.out.print("- ");
        }
        System.out.println();
        for (int i = 0; i < 26; i++){
            System.out.print((char)('a'+i)+" ");
        }
        System.out.println();
    }
}
public class Lab13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Histogram myH = new Histogram();
        String res;
        
        do {
            System.out.println("T: Enter a text ");
            System.out.println("P: Plot frequencies");
            System.out.println("Q. quit ");
            
            System.out.print("Select: ");
            res = in.next();
            in.nextLine();
            
            switch (res.toLowerCase().charAt(0)){
                case 't':
                    System.out.print("Enter a text: "); 
                    String t = in.nextLine();
                    myH.setText(t);
                    break;
                case 'p':
                    myH.drawHistogram();
                    break;
                case 'q':
                    System.out.println("Thanks for using my program!");
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'q');
    }
    
}
