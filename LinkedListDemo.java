import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 * CSC 6301 – Software Design & Documentation
 * 
 * Project 04:
 * This class reads a list of Integer numbers from the scanned
 * input and saves them into a Linked List sorted from the smallest to the
 * largest, using the Collections Framework.
 * 
 * @author Billy Dempsey
 *         dempseyw@merrimack.edu
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */
 public class LinkedListDemo {
    
    /** 
     * Main Method of the class.
     * @param args default parameter for a main - not used
     * @since Week 4 of CSC6301
     */
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(); // Creating the list
        Scanner sc = new Scanner(System.in); //Creating the Scanner

        // Prompt user for input
        System.out.println("Enter Integers to add to a Linked List. Enter 'x' or any character when finished. ");
        while (sc.hasNextInt()) {
            System.out.println("Enter: ");
            int number = sc.nextInt();
            list.add(number); // Add to list
        }
        sc.close();

        System.out.println("Unsorted Linked List");
        System.out.println(list);

        Collections.sort(list); // Sorting
 
        System.out.println("Sorted Linked List:");
        System.out.println(list);
    

    }
    
 }