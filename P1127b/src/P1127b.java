//course: CSC190
//project: P1127b
//date: 11/27/18
//author: Thomas Morris
//purpose: arrays

import java.util.Random;
import java.util.Scanner;
class MyArray {
    final int MAXSIZE = 10; //upcase letters are used to define a constant 
    int a[]; //name of array
    int n; //number of elements in use <= MAXSIZE
    boolean isSorted;
    
    MyArray(){
        a = new int[MAXSIZE]; //actual array created
        //a[0]:1st element, a[1]:2nd element, ... a[MAXSIZE-1]:last element
        n = 0;
        isSorted = false;
    }
    
    void readA(){
        Scanner in = new Scanner(System.in);
        isSorted = false;
        n = 0; //reset array
        System.out.print("Enter a positive integer(-1 to stop): ");
        int key = in.nextInt();
        while (key > 0){
            a[n++] = key; //cf a[++n]
            
            if (n == MAXSIZE){
                System.out.println("Array full.");
                return;
            }
            System.out.print("Enter a positive integer(-1 to stop): ");
            key = in.nextInt();
        }
    }
    
    void generateA() {
        Random rnd = new Random();
        isSorted = false;
        n = rnd.nextInt(MAXSIZE)+1;
        for (int i = 0; i < n; i++)
            a [i] = rnd.nextInt(99)+1; //1-99
    }
    
    void printA(){
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    
    int getMax(){
        int max = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }
    
    //reverse array
    //if a = 1, 2, 3, 4, 5, reverse it to a = 5, 4, 3, 2, 1
    void reverseA(){
        isSorted = false;
        for (int i = 0; i < n/2; i++){
            int t = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = t;
        }
    }
    
    //rotate - to left, to right
    //if a = 1, 2, 3, 4, 5 after rotate to left a = 2,3,4,5,1
    void rotateL(){
        int t = a[0];
        for (int i = 1; i < n; i++)
            a[i-1] = a[i];
        a[n-1] = t;
    }
    //if a = 1, 2, 3, 4, 5 after rotate to right a = 5,1,2,3,4
    void rotateR(){
        int t = a[n-1];
        for (int i = n-2; i >= 0; i--)
            a[i+1] = a[i];
        a[0] = t;
    }
    
    //sorting - bubble, insertion, selection - sorting and searching are an important issue in programming
    void bubble(){
        for (int stage = n-2; stage >= 0; stage--)
            for (int i = 0; i <= stage; i++)
                if (a[i] > a[i+1]){
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                }
        isSorted = true;
    }
    
    //insertion sort
    //4 2 5 3 6 1 insert 2 to the left
    //2 4 5 3 6 1 insert 5 to the left
    //2 4 5 3 6 1 insert 3 to the left
    //2 3 4 5 6 1 insert 6 to the left
    //1 2 3 4 5 6 insert 1 to the left
    void insertion(){ //this is good if you have an existing data set
        for (int i = 1; i < n; i++){
            int t = a[i];
            int j;
            for (j = i-1; j >= 0; j--)
                if (a[j] > t)
                    a[j+1] = a[j];
                else 
                    break;
            a[j+1] = t;
            isSorted = true;
        }
    }
    
    
    
    void sortA(){
        Scanner in = new Scanner(System.in);
        String res;
        
        do {
            System.out.println("b. bubble sort");
            System.out.println("i. insertion sort");
            System.out.println("s. selection sort");

            System.out.println("m. to main");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case 'b':
                    bubble(); 
                    break;
                case 'i':
                    insertion();
                    break;
                case 's':
                    //selection();
                    //isSorted = true;
                    break;                    
                case 'm':
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'm');
    }
    
    int sequential(int key){
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;    
    }
    
    //global array for pascals triangle
    
    //1 3 3 5 8 10 13 15 with key = 8
    //      1 3  2            key found at position 4
    //1 3 3 5 8 10 13 15 with key = 14
    //      1    2  3  4      key not found
    int binary(int key){
        int left = 0, right = n-1;
        
        while(left <= right){
            int mid = (left+right)/2;
            if (a[mid] == key)
                return mid;
            if (a[mid] < key)
                left = mid+1;
            else
                right = mid-1; 
        }
        return -1;
    }
    //binary, bubble, insertion, gcd
    
    void searchA(){
        Scanner in = new Scanner(System.in);
        String res;
        
        do {
            System.out.println("s. sequential search");
            System.out.println("b. binary search");

            System.out.println("m. to main");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case 's':
                    System.out.print("Enter a key: ");
                    int key = in.nextInt();
                    int pos = sequential(key);
                    if (pos == -1)
                        System.out.println("Key not found.");
                    else
                        System.out.println("Key found at position "+pos+".");
                    break;
                case 'b':
                    if(!isSorted){
                        System.out.println("Arry not sorted");
                        break;
                    }
                    System.out.print("Enter a key: ");
                    key = in.nextInt();
                    pos = binary(key);
                    if (pos == -1)
                        System.out.println("Key not found.");
                    else
                        System.out.println("Key found at position "+pos+".");
                    break;                   
                case 'm':
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'm');
    }
    
    void rotateA(){
        Scanner in = new Scanner(System.in);
        String res;
        isSorted = false;
        do {
            System.out.println("L. rotate left");
            System.out.println("R. rotate right");

            System.out.println("m. to main");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case 'l':
                    rotateL();
                    break;
                case 'r':
                    rotateR();
                    break;
                case 'm':
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'm');
    }
}

public class P1127b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyArray myA = new MyArray();
        String res;
        
        do {
            System.out.println("1. read array");
            System.out.println("2. generate array");
            System.out.println("3. print array");
            System.out.println("4. find max");            
            System.out.println("5. reverse array");
            System.out.println("6. rotate array");
            System.out.println("7. sort");
            System.out.println("8. search");            
            System.out.println("q. quit");
            
            System.out.print("select: ");
            res = in.next();
            
            switch (res.toLowerCase().charAt(0)){
                case '1':
                    myA.readA();
                    break;
                case '2':
                    myA.generateA();
                    break;
                case '3':
                    myA.printA();
                    break;
                case '4':
                    System.out.println("Max = "+myA.getMax());
                    break;
                case '5':
                    myA.reverseA();
                    break;
                case '6':
                    myA.rotateA();
                    break;
                case '7':
                    myA.sortA();
                    break;
                case '8':
                    myA.searchA();
                    break;                    
                case 'q':
                    System.out.println("Thanks for using my program!");
                    break;
                default:
                    System.out.println("Invalid!");                                
            }
        } while (res.toLowerCase().charAt(0) != 'q'); //posttest condition     
    } 
}
