/*
 * Class: CMSC203
 * Instructor: Professor Kuijt
 * Description: This program is a simulation to test the user's alledged ESP abilities, if such a thing exists
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 *Print your Name here: Abel Mintesnot
*/

import java.util.*;

class ESPGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Describe yourself: ");
        String description = sc.nextLine();
        
        System.out.print("Due date: ");
        String date = sc.next();
        
        System.out.println("CMSC203 Assignment 1: Test your ESP skills!");
        
        int score = 0;
        
        for(int i = 0; i < 10; i++) { //For simulating 10 rounds
            boolean isGuessing = false;
            System.out.println("Round " + (i + 1) + "\n");
            System.out.println("I am thinking of a color.");
            do {
                System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
                String color = sc.next();
                
                Random random = new Random();
                int colorNum = random.nextInt(5); //To get the randomly generated color
                
                switch(colorNum) { //To check and see if the user guessed the right color
                    case 0: if(color.equalsIgnoreCase("red")) {
                                isGuessing = true;
                                score++;
                            }
                        System.out.println("I was thinking of Red.\n");
                        break;
                    case 1: if(color.equalsIgnoreCase("green")) {
                                isGuessing = true;
                                score++;
                            }
                        System.out.println("I was thinking of Green.\n");
                        break;
                    case 2: if(color.equalsIgnoreCase("blue")) {
                                isGuessing = true;
                                score++;
                            }
                        System.out.println("I was thinking of Blue.\n");
                        break;
                    case 3: if(color.equalsIgnoreCase("orange")) {
                                isGuessing = true;
                                score++;
                            }
                        System.out.println("I was thinking of Orange.\n");
                        break;
                    case 4: if(color.equalsIgnoreCase("yellow")) {
                                isGuessing = true;
                                score++;
                            }
                        System.out.println("I was thinking of Yellow.\n");
                        break;
                    default: System.out.print("You entered incorrect color. ");
                }
            } while(isGuessing = false);
        }
        System.out.println("Game Over\n");
        
        System.out.println("You guessed " + score + " out of 10 colors correctly.");
        System.out.println("User Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + date);
        System.out.println("Programmer's Name: Abel Mintesnot");
        
        sc.close();
    }
}