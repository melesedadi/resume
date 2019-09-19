import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner key = new Scanner(System.in);
        String answer = " ";

        ArrayList<String> jobList = new ArrayList<>();
        System.out.println("You are entering your resume");

        while (true){
            Resume addResume = new Resume();
            ArrayList<String> jobs1  = new ArrayList<>();
            System.out.println("Enter your name: ");
            answer = key.nextLine();
            addResume.setName(answer);
            System.out.println("Enter your email: ");
            answer = key.nextLine();
            addResume.setEmail(answer);
            while (true){
                System.out.println("Enter your employer name: ");
                answer = key.nextLine();
                jobs1.add(answer);

                System.out.println("Enter your job title: ");
                answer = key.nextLine();
                jobs1.add(answer);

                System.out.println("Enter your Start date: ");
                answer = key.nextLine();
                jobs1.add(answer);
                System.out.println("Enter your Start end date: ");
                answer = key.nextLine();
                jobs1.add(answer);

                System.out.println("Enter job description: ");
                answer = key.nextLine();
                jobs1.add(answer);

                System.out.println("Do you have another job to enter? Answer yes or no : ");
                answer = key.nextLine();
                if (answer.equalsIgnoreCase("no")){
                    System.out.println("This end of adding new job.");
                    break;
                }
                addResume.setJobs(jobs1);

            }
            System.out.println("Do you have another person resume to add? Answer yes or no: ");
            answer = key.nextLine();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("This is end of adding new resume.");
                break;
            }
            jobList.add(addResume.getDisplyResume());



        }
       for(String job: jobList){
           System.out.println(job);
       }

    }
}
