import java.util.Scanner;
public class StudentGrade {
    public static void main(String [] args){
        System.out.println("Students Grade Calculator ");
        System.out.println("enter no of subjects : ");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []marks=new int[n];
        for(int i=0;i<n;++i){
            marks[i]=sc.nextInt();
        }
        int total_marks=0;
        
        
        for(int i=0;i<n;++i){
            total_marks+=marks[i];
        }
        double avg_percentage=total_marks/n;
        
        System.out.println("      RESULT      ");
        System.out.println("MARKS OBTIANED OUT OF HUNDRED : ");
        for(int j=0;j<n;++j){
            System.out.println(marks[j]);
        }
        System.out.println("AVERAGE PERCENTAGE : "+avg_percentage);
        if(avg_percentage>90){
            System.out.println(" GRADE : O");
        }
        else if(avg_percentage>80){
            System.out.println(" GRADE : A+");
        }
        else if(avg_percentage>70){
            System.out.println(" GRADE : A");
        }
        else if(avg_percentage>60){
            System.out.println(" GRADE : B+");
        }
        else if(avg_percentage>50){
            System.out.println(" GRADE : B");
        }
        else if(avg_percentage>40){
            System.out.println(" GRADE : C");
        }
        else{
            System.out.println("FAIL...");
        }
       

    }
}
