import java.util.Random;
public class EmpWagwPrgmOopsUC6
{

   
        int Wage_HR = 20;
        int Day_HRs = 8;
        int Part_HRs = 8;
        int NumDays = 20;
        int MaxHRsMonth = 100;

        int totalEmpHrs = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;
        double monthwage = 0;
        Random random = new Random();
    
  public void EmpWageChk()
  {
        while (totalEmpHrs != MaxHRsMonth && totalWorkingDays != NumDays)
         {
            totalWorkingDays++;
            int r = random.nextInt(3);
            switch (r)
             {
                case 1:
                    empHrs = Day_HRs;
                    break;
                case 2:
                    empHrs = Part_HRs;
                    break;
                case 0:
                    empHrs = 0;
                    break;
               }
            totalEmpHrs = totalWorkingDays + empHrs;
         }
        monthwage = totalEmpHrs * Wage_HR;
        System.out.println("Month Wage : " + monthwage);
   }
  
  public static void main(String[] args)
  {
   System.out.println("Welcome Employee Wages Problem in Oops");
   EmpWagwPrgmOopsUC6 EW = new EmpWagwPrgmOopsUC6();
   EW.EmpWageChk();
	
   }
    
 
}
