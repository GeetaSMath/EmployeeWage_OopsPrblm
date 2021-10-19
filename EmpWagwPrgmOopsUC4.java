import java.util.Random;
public class EmpWagwPrgmOopsUC4
{

    
        int Wage_HR = 20;
        int Day_HRs = 8;
        int Part_HRs = 8;

        Random random = new Random();
        int r = random.nextInt(2);

     public void EmpWageChk()
      {
            switch (r)
             {
                case 1:
                System.out.println("Employee Present");
                System.out.println("DayWage = " + Wage_HR * Day_HRs);
                break;

                case 2:
                System.out.println("Employee Present");
                System.out.println("DayWage with Part Time = " + Wage_HR * (Day_HRs + Part_HRs));
                break;

                case 0:
                System.out.println("Employee Absent");
             }
    }
  
 	public static void main(String[] args)
	{
         System.out.println("Welcomt to Employee Wage in Oops");
         EmpWagwPrgmOopsUC4 EW = new EmpWagwPrgmOopsUC4();
         EW.EmpWageChk();
        }
}
