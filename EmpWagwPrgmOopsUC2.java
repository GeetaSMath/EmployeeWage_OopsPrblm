import java.util.Random;
public class  EmpWagwPrgmOopsUC2 
{

         int Wage_HR = 20;
	 int Day_HRs = 8;
         Random random = new Random();
         int r = random.nextInt(2);
         
          public void EmpWageCal()
          {
	        if(r == 0)
                 {
                       System.out.println("Employee Present");
	               System.out.println("DayWage = " + Wage_HR * Day_HRs);
	          }
                       else{

                              System.out.println("Employee Absent");
			   }

  	   
          }	
	public static void main(String[] args)
	{
	 EmpWagwPrgmOopsUC2 EW1 = new EmpWagwPrgmOopsUC2();
         EW1.EmpWageCal();
	}           
      
}