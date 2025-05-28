import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode circle;     // a PersonNode pointer that tracks first node
   private int size;              // the number of people in the circle
   private int eliminationCount;  // the number to count to for elimination       
   private PersonNode track;      // a PersonNode pointer to help with elimination

   public JosephusSim(String fileName) {
      try {
         // load names from the file in order, generating a singly linked list of PersonNodes
         size = 1;
         
         Scanner file = new Scanner(new File(fileName));
         circle = new PersonNode(file.nextLine());
         PersonNode cur = circle;
         while(file.hasNext()) {
            String temp = file.nextLine();
            cur.next = new PersonNode(temp);
            cur = cur.next;
            size++;
         }
         
         // make the ring circular by attaching last node's next to front
         cur.next = circle;
         
         // remember the last node as the one in front of the next to get eliminated
         track = cur;
         
         // generate, print, and save the random elimination count
         Random r = new Random();
         eliminationCount = r.nextInt(1, size/2);
         System.out.println("Elimination Count = " + eliminationCount);

      } catch(FileNotFoundException e) {
         System.out.println("Something went wrong with " + fileName);
      }
   }
   
   // optional helper method for constructing the circle
   private void add(String val) {
   }
   
   public void eliminate() {
      // count to the elimination count
      for(int i = 0; i < eliminationCount - 1; i++){
         track = track.next;
      }
      
      // print who will be eliminated
      System.out.println(track.next.name + " eliminated!");
      
      // eliminate the person and update "front" of the circle and size
      track.next = track.next.next;
      circle = track.next;
      size--;
   }
   
   public boolean isOver() {
      // check if there's only one person left in the circle
      return !(size > 1);
   }
   
   public String toString() {
      String output = "";
      // if there's only one person left, print them as the last survivor
      if(size == 1) {
         output = circle.name + " is the survivor!";
      } else {
      // print the remaining survivors (watch out for infinite loop since list is circular)
         PersonNode cur = circle;
         output = "Remaining Survivors: ";
         for(int i = 1; i <= size; i++) {
            output += i + "-" + cur.name + ", ";
            cur = cur.next;
         }
      }
      return output;
   }

}