package Conditionals;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        sc.close();
        if (age>0) {
            if (age <= 4) {
                System.out.println("You are just a baby!");
            } else if (age > 4 && age <= 12) {
                System.out.println("Hey Kid!! Whats up?");
            } else if (age > 12 && age <= 19) {
                System.out.println("you are a teenager!");
            } else if (age > 19 && age <= 32) {
                System.out.println("You are a young man!");
            } else if (age > 32 && age <= 55) {
                System.out.println("you are a middle-aged adult");
            } else if (age > 55 && age <= 100) {
                System.out.println("You are an old man now!");
            } else {
                System.out.println("Are u even alive?");
            }
        }
        else {
            System.out.println("Oops!!" + " " + age + ". " + "How is that even possible???");
        }
    }
}
