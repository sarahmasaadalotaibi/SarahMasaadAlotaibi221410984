import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int noOfTrainingWorkshops=0,noOfServiceYears=0,noOfResearchPublication=0,noOfcourses=0,job=0;
        double GPA=0;
        Scanner UserMsg = new Scanner(System.in);
        System.out.println("Enter your job number in the range 0-2 :");
        job = UserMsg .nextInt();  // Read user input
        //System.out.println("your job number is: " + job);  // Output user input
        if (job == 0) {
            Scanner AdminMsg = new Scanner(System.in);
            System.out.println("Enter your noOfTrainingWorkshops ,noOfServiceYears: ");
             noOfTrainingWorkshops = AdminMsg .nextInt();  // Read user input
             noOfServiceYears = AdminMsg .nextInt();  // Read user input
        }else if (job == 1) {
            Scanner AcademicMsg = new Scanner(System.in);
            System.out.println("Enter your noOfResearchPublication ,noOfServiceYears: ");
            noOfResearchPublication = AcademicMsg .nextInt();  // Read user input
            noOfServiceYears = AcademicMsg .nextInt();  // Read user input
        }else if (job == 2) {
            Scanner StudentMsg = new Scanner(System.in);
            System.out.println("Enter your noOfcourses,GPA :");
            noOfcourses = StudentMsg .nextInt();  // Read user input
            GPA = StudentMsg .nextDouble();  // Read user input
        }else {
            System.out.println("invalid range please enter your job number in the range 0-2");
        }

        switch(job) {
            case 0:
                if (noOfTrainingWorkshops <= 5) {
                    System.out.println("salary= "+noOfTrainingWorkshops*100.0*noOfServiceYears);
                }else if (noOfTrainingWorkshops <= 10) {
                    System.out.println("salary= "+noOfTrainingWorkshops*150.0*noOfServiceYears);
                }else if (noOfTrainingWorkshops <= 15) {
                    System.out.println("salary= "+noOfTrainingWorkshops*200.0*noOfServiceYears);
                }else {
                    System.out.println("salary= "+noOfTrainingWorkshops*300.0*noOfServiceYears);
                }
                break;
            case 1:
                if (noOfResearchPublication <= 5) {
                    System.out.println("salary= "+noOfResearchPublication*200.0*noOfServiceYears);
                }else if (noOfResearchPublication <= 10) {
                    System.out.println("salary= "+noOfResearchPublication*250.0*noOfServiceYears);
                }else if (noOfResearchPublication <= 15) {
                    System.out.println("salary= "+noOfResearchPublication*300.0*noOfServiceYears);
                }else {
                    System.out.println("salary= "+noOfResearchPublication*400.0*noOfServiceYears);
                }
                break;
            case 2:
                if (noOfcourses <= 3) {
                    System.out.println("reward= "+noOfcourses*200.0*GPA);
                }else if (noOfcourses == 4) {
                    System.out.println("reward= "+noOfcourses*250.0*GPA);
                }else if (noOfcourses == 5) {
                    System.out.println("reward= "+noOfcourses*300.0*GPA);
                }else {
                    System.out.println("reward= "+noOfcourses*350.0*GPA);
                }
                break;
            default:
        }
    }
}