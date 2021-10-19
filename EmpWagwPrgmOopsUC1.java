    import java.util.Random;
public class  EmpWagwPrgmOopsUC1
{     
         Random random = new Random();
          int r = random.nextInt(2);
         public void EmployeeAttendance()
        {
             
            
             if(r == 1)
             System.out.println("Employee Present");
             else
             System.out.println("Employee Absent");
        }

  public static void main(String[] args)
  { 
    EmpWagwPrgmOopsUC1 EW=new EmpWagwPrgmOopsUC1();
    EW.EmployeeAttendance();
  }
    
}