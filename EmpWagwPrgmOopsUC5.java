
import java.util.Random;

public class EmpWagwPrgmOopsUC5 {

        int Wage_HR = 20;
        int Day_HRs = 8;
        int Part_HRs = 8;

        Random random = new Random();
        int r = random.nextInt(3);


        public void EmplWageChk()
        {
                   if(r == 1)
		    {
                     System.out.println("Employee Present");
            	     System.out.println("DayWage = " + Wage_HR * Day_HRs);
                      }
                       else if(r == 2)
		      {
          	         System.out.println("Employee Present");
                          System.out.println("DayWage with Part Time = " + Wage_HR * (Day_HRs + Part_HRs));
       		       }

       	                 else
          	         System.out.println("Employee Absent");
     	  }
    
    	       public static void main(String[] args) 
   	     {
    		    System.out.println("Welcome to Employee Wage Computation Program");
                    EmpWagwPrgmOopsUC5 Em=new EmpWagwPrgmOopsUC5();
    		    Em.EmplWageChk();
     	     }
    
}	
