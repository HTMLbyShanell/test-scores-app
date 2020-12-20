/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscores;

import java.util.Scanner;

/**
 *
 * @author Shanell Spann
 */
public class grade {
    
    int total;
    int Score1;
    int Score2;
    int Score3;
    int sum;
    
    Scanner keyboard = new Scanner(System.in);
    
    public void userInput()
    {     
        System.out.println("Enter Test Score #1: \t");
        Score1 = keyboard.nextInt();
 
        System.out.println("\n");
        System.out.println("Enter Test Score #2: \t");
        Score2 = keyboard.nextInt();
        
        System.out.println("\n");
        System.out.println("Enter Test Score #3: \t");
        Score3 = keyboard.nextInt();  
    }
    
    
    public void sumOfInput() 
    { 
        sum = Score1 + Score2 + Score3;
   
    }
        
    public int averageScore()
    {
        int average;
        
        average = (sum / 3);
        return average;
    }
    
    public void displayAverage()
    {
        System.out.println("Your Average Score = " + averageScore());
    }
    
     public void LetterGrade()
    {
        if (averageScore() <= 60)
        {
            System.out.println("Your Letter Grade =  F");
        }
        else if (averageScore() <= 69)
        {
            System.out.println(" Your Letter Grade =  D");
        }
        else if(averageScore() <= 79)
        {
            System.out.println(" Your Letter Grade =  C");
        }
        else if (averageScore() <= 89)
        {
            System.out.println("Your Letter Grade =  B");
        }
        else if (averageScore() >= 90)
        {
            System.out.println("Your Letter Grade =  A");
        }
    }
    
}
