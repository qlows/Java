import java.util.Random;
import java.util.Scanner;

     class Lab1{
            
        public static void main(String[] args) {
            
       Random rand = new Random(); 
       int arraySize =1000; 
       
       UnOrderedArray ua = new UnOrderedArray(arraySize);
       UnOrderedArray ua1 = new UnOrderedArray(arraySize);
       OrderedArray oa = new OrderedArray(arraySize);
       
       for (int x=0;x<arraySize;x++){
           int val =rand.nextInt(300);
           //ua.addLast(val);  // gives a random number between 0 and 299
           //ua1.addLast(val);
           oa.addInOrder(val);
       }
      oa.listItems(20);
      System.out.print("Enter a value to search for:");
      Scanner sc = new Scanner(System.in);
      int userChoice = sc.nextInt();
      System.out.println("Item found at location: "+oa.binarySearchAsc(userChoice));
      
       ua1.listItems(10);
       
       long startTime = System.nanoTime();
       ua1.insertionSortAsc();      
       long endTime =System.nanoTime();
       long timeTaken= endTime-startTime;
       System.out.println("The insertion sort took "+timeTaken+" nanoseconds.");
       ua1.listItems(10);
       
       System.out.println("--------------------------------------");
       
       ua.listItems(10); 
       startTime = System.nanoTime();
       ua.selectionSort();      
       endTime =System.nanoTime();
        timeTaken= endTime-startTime;
       System.out.println("The selection sort took "+timeTaken+" nanoseconds.");   
       ua.listItems(10); 
    }
    
}
        