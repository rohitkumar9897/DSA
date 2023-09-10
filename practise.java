import java.io.*;
import java.util.*;

public class practise {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T= sc.nextInt();
        int initialAge[]= new int[T];
        for(int i=0; i<T; i++){
            initialAge[i]= sc.nextInt();
        }
        Person age= new Person(initialAge, T);
        
    }
    
}
class Person{
    int Age;
    Person(int age[], int T){
        for(int i=0; i<T; i++){
        if(age[i]>=0){
            this.Age=age[i];
        }else{
            Age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        
        if(Age<13){
            System.out.println("You are young.");
        }else if(Age>=13 && Age<18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
        int passAge= Age+3;
        if(passAge<13){
            System.out.println("You are young.");
        }else if(passAge>=13 && passAge<18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }
    }
}
