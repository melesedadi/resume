import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner key = new Scanner(System.in);
        ArrayList<Resume> resumeList = new ArrayList<>();
        String answer = " ";
        int counterNumber = 1;
        int jobNumber = 1;
        int jobDescriptionNumber = 1;

        System.out.println("You are entering your resume");

        while (true){

            Resume addResume = new Resume();
            System.out.println("Resume " + counterNumber);
            System.out.println("Please enter your name: ");
            answer = key.nextLine();
            addResume.setFullName(answer);
            System.out.println("Enter your email: ");
            answer = key.nextLine();
            addResume.setEmailAddress(answer);
            while (true){
                System.out.println("Job lists:");
                System.out.println("Job " + jobNumber);
                System.out.println("Please enter employer name: ");
                answer = key.nextLine();
                addResume.setEmployerName(answer);

                System.out.println("Please enter job title: ");
                answer = key.nextLine();
                addResume.setJobTitle(answer);

                System.out.println("Please enter job Start date: ");
                answer = key.nextLine();
                addResume.setJobStartDate(answer);
                System.out.println("Please enter job end date: ");
                answer = key.nextLine();
                addResume.setJobEndDate(answer);


                while (true) {
                    System.out.println("job Description " + jobDescriptionNumber);
                    System.out.println("Please enter job description: ");
                    answer = key.nextLine();
                    addResume.setJobDescription(answer);

                    System.out.println("Do you have addtional job description to add? Answer yes or no: ");
                    answer = key.nextLine();
                    if (answer.equalsIgnoreCase("no")) {
                        break;
                    }
                    jobDescriptionNumber = jobDescriptionNumber + 1;
                }
                jobDescriptionNumber = 1;
                System.out.println("Do you have addtional job to add? Answer yes or no : ");
                answer = key.nextLine();
                if (answer.equalsIgnoreCase("no")){
                    break;
                }
               jobNumber = jobNumber + 1;


            }
            jobNumber = 1;


            System.out.println("Do you have another person resume to add? Answer yes or no: ");
            answer = key.nextLine();
            if (answer.equalsIgnoreCase("no")){
                break;
                }
            counterNumber = counterNumber + 1;
            resumeList.add(addResume);

        }
        counterNumber = 1;
       for(Resume resume: resumeList){
           System.out.println("Resume" + counterNumber +":");
           System.out.println(resume.getDisplyResume());
           counterNumber = counterNumber + 1;


       }
       counterNumber = 1;

    }
}
