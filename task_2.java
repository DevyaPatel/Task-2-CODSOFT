import java.util.Scanner;
public class task_2
{
    public static void main(String[]args){
        String grade="";
        int phy,chem,math,bio,ss;
        double avgPer,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of Maths out of 100");
        math = sc.nextInt();
        System.out.println("Enter marks of Physics out of 100");
        phy = sc.nextInt();
        System.out.println("Enter marks of Chemistry out of 100");
        chem = sc.nextInt();
        System.out.println("Enter marks of Biology out of 100");
        bio = sc.nextInt();
        System.out.println("Enter marks of Social Studies out of 100");
        ss = sc.nextInt();
        sum = math+bio+phy+chem+ss;
        avgPer = sum/5;
        if(avgPer>=97 || avgPer<=100)
        {
            grade = "A+";
        } else if (avgPer>=93 || avgPer<97) {
            grade = "A";
        }
        else if (avgPer>=90 || avgPer<93) {
            grade = "A-";
        }
        else if (avgPer>=87 || avgPer<90) {
            grade = "B+";
        }
        else if (avgPer>=83 || avgPer<87) {
            grade = "B";
        }
        else if (avgPer>=80 || avgPer<83) {
            grade = "B-";
        }
        else if (avgPer>=77 || avgPer<80) {
            grade = "C+";
        }
        else if (avgPer>=73 || avgPer<77) {
            grade = "C";
        }
        else if (avgPer>=70 || avgPer<73) {
            grade = "C-";
        }
        else if (avgPer>=67 || avgPer<70) {
            grade = "D+";
        }
        else if (avgPer>=63 || avgPer<67) {
            grade = "D";
        }
        else if (avgPer>=60 || avgPer<63) {
            grade = "D-";
        }
        else if (avgPer<60) {
            grade = "F";
        }
        System.out.println();
        System.out.println("Maths:"+math);
        System.out.println("Physics:"+phy);
        System.out.println("Chemistry:"+chem);
        System.out.println("Biology:"+bio);
        System.out.println("Social Studies:"+ss);
        System.out.println();
        System.out.println("Total marks :"+sum);
        System.out.println("Average Percentage :"+avgPer);
        System.out.println("Grade:"+grade);
    }
}
