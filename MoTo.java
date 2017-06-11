/*
 * Mo To
 * Andresito de Guzman
 * 2017
 */

// Import Necessary Libs
import java.util.Scanner;

// Declare Class
class MoTo{
  
  // Instantiate Property/ies
  private String word;
  
  // moToGenerator Method
  private String moToGenerator(String param){
    // Assign value to MoTo.word
    this.word = param;
    // Create Resulting String
    String generateWord = this.word + " mo to!";
    // Return Generated Word
    return generateWord;
  }

  // Main Program Method
  private void mainProgram(){
    // Output a Text
    System.out.println("Enter a word to append with 'mo to': ");
    // Prepare Input
    Scanner input = new Scanner(System.in);
    // Recieve Input
    String value = input.next(); 
    // Close Input
    input.close();
    // Process Input and Hold to String
    String result = moToGenerator(value);
    // Show Result
    System.out.println(result);
  }
  
  // Init Method
  public static final void main(String args[]){
    // Instantiate the Object
    MoTo moto = new MoTo();
    // Call the Method
    moto.mainProgram();
  }

}