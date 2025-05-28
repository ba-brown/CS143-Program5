import java.util.*;

public class JosephusDriver {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      JosephusSim simulation = new JosephusSim("people.txt");
      
      while(!simulation.isOver()) {
         System.out.println(simulation);
         System.out.println("\nContinue elimination? <press enter>");
         console.nextLine(); // make the user hit enter to continue
         simulation.eliminate();
      }
      
      System.out.println(simulation);
   }

}
/* Sample output
 
  ----jGRASP exec: java -ea JosephusDriver
 Elimination Count = 8
 Remaining Survivors: 1-Brian, 2-Delon, 3-Aryton, 4-Eli, 5-Nate, 6-Cameron, 7-Mohamed, 8-Adrian, 9-Abner, 10-Tom, 11-Egor, 12-Wissal, 13-Shunyun, 14-Percy, 15-Antonio, 16-Aziz, 17-Biruk, 18-Max, 19-Jason, 20-Riane, 21-Matthew, 
 
 Continue elimination? <press enter>
 
 Adrian eliminated!
 Remaining Survivors: 1-Abner, 2-Tom, 3-Egor, 4-Wissal, 5-Shunyun, 6-Percy, 7-Antonio, 8-Aziz, 9-Biruk, 10-Max, 11-Jason, 12-Riane, 13-Matthew, 14-Brian, 15-Delon, 16-Aryton, 17-Eli, 18-Nate, 19-Cameron, 20-Mohamed, 
 
 Continue elimination? <press enter>
 
 Aziz eliminated!
 Remaining Survivors: 1-Biruk, 2-Max, 3-Jason, 4-Riane, 5-Matthew, 6-Brian, 7-Delon, 8-Aryton, 9-Eli, 10-Nate, 11-Cameron, 12-Mohamed, 13-Abner, 14-Tom, 15-Egor, 16-Wissal, 17-Shunyun, 18-Percy, 19-Antonio, 
 
 Continue elimination? <press enter>
 
 Aryton eliminated!
 Remaining Survivors: 1-Eli, 2-Nate, 3-Cameron, 4-Mohamed, 5-Abner, 6-Tom, 7-Egor, 8-Wissal, 9-Shunyun, 10-Percy, 11-Antonio, 12-Biruk, 13-Max, 14-Jason, 15-Riane, 16-Matthew, 17-Brian, 18-Delon, 
 
 Continue elimination? <press enter>
 
 Wissal eliminated!
 Remaining Survivors: 1-Shunyun, 2-Percy, 3-Antonio, 4-Biruk, 5-Max, 6-Jason, 7-Riane, 8-Matthew, 9-Brian, 10-Delon, 11-Eli, 12-Nate, 13-Cameron, 14-Mohamed, 15-Abner, 16-Tom, 17-Egor, 
 
 Continue elimination? <press enter>
 
 Matthew eliminated!
 Remaining Survivors: 1-Brian, 2-Delon, 3-Eli, 4-Nate, 5-Cameron, 6-Mohamed, 7-Abner, 8-Tom, 9-Egor, 10-Shunyun, 11-Percy, 12-Antonio, 13-Biruk, 14-Max, 15-Jason, 16-Riane, 
 
 Continue elimination? <press enter>
 
 Tom eliminated!
 Remaining Survivors: 1-Egor, 2-Shunyun, 3-Percy, 4-Antonio, 5-Biruk, 6-Max, 7-Jason, 8-Riane, 9-Brian, 10-Delon, 11-Eli, 12-Nate, 13-Cameron, 14-Mohamed, 15-Abner, 
 
 Continue elimination? <press enter>
 
 Riane eliminated!
 Remaining Survivors: 1-Brian, 2-Delon, 3-Eli, 4-Nate, 5-Cameron, 6-Mohamed, 7-Abner, 8-Egor, 9-Shunyun, 10-Percy, 11-Antonio, 12-Biruk, 13-Max, 14-Jason, 
 
 Continue elimination? <press enter>
 
 Egor eliminated!
 Remaining Survivors: 1-Shunyun, 2-Percy, 3-Antonio, 4-Biruk, 5-Max, 6-Jason, 7-Brian, 8-Delon, 9-Eli, 10-Nate, 11-Cameron, 12-Mohamed, 13-Abner, 
 
 Continue elimination? <press enter>
 
 Delon eliminated!
 Remaining Survivors: 1-Eli, 2-Nate, 3-Cameron, 4-Mohamed, 5-Abner, 6-Shunyun, 7-Percy, 8-Antonio, 9-Biruk, 10-Max, 11-Jason, 12-Brian, 
 
 Continue elimination? <press enter>
 
 Antonio eliminated!
 Remaining Survivors: 1-Biruk, 2-Max, 3-Jason, 4-Brian, 5-Eli, 6-Nate, 7-Cameron, 8-Mohamed, 9-Abner, 10-Shunyun, 11-Percy, 
 
 Continue elimination? <press enter>
 
 Mohamed eliminated!
 Remaining Survivors: 1-Abner, 2-Shunyun, 3-Percy, 4-Biruk, 5-Max, 6-Jason, 7-Brian, 8-Eli, 9-Nate, 10-Cameron, 
 
 Continue elimination? <press enter>
 
 Eli eliminated!
 Remaining Survivors: 1-Nate, 2-Cameron, 3-Abner, 4-Shunyun, 5-Percy, 6-Biruk, 7-Max, 8-Jason, 9-Brian, 
 
 Continue elimination? <press enter>
 
 Jason eliminated!
 Remaining Survivors: 1-Brian, 2-Nate, 3-Cameron, 4-Abner, 5-Shunyun, 6-Percy, 7-Biruk, 8-Max, 
 
 Continue elimination? <press enter>
 
 Max eliminated!
 Remaining Survivors: 1-Brian, 2-Nate, 3-Cameron, 4-Abner, 5-Shunyun, 6-Percy, 7-Biruk, 
 
 Continue elimination? <press enter>
 
 Brian eliminated!
 Remaining Survivors: 1-Nate, 2-Cameron, 3-Abner, 4-Shunyun, 5-Percy, 6-Biruk, 
 
 Continue elimination? <press enter>
 
 Cameron eliminated!
 Remaining Survivors: 1-Abner, 2-Shunyun, 3-Percy, 4-Biruk, 5-Nate, 
 
 Continue elimination? <press enter>
 
 Percy eliminated!
 Remaining Survivors: 1-Biruk, 2-Nate, 3-Abner, 4-Shunyun, 
 
 Continue elimination? <press enter>
 
 Shunyun eliminated!
 Remaining Survivors: 1-Biruk, 2-Nate, 3-Abner, 
 
 Continue elimination? <press enter>
 
 Nate eliminated!
 Remaining Survivors: 1-Abner, 2-Biruk, 
 
 Continue elimination? <press enter>
 
 Biruk eliminated!
 Abner is the survivor!
 
  ----jGRASP: Operation complete.
 */