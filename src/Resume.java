import java.util.ArrayList;

public class Resume {
    private String fullName;
    private String emailAddress;
    private String employerName;
    private String jobTitle;
    private String jobDescription;
    private String jobStartDate;
    private String jobEndDate;

    public Resume() {
    }

    public Resume(String fullName, String emailAddress, String employerName, String jobTitle, String jobDescription, String jobStartDate, String jobEndDate) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.employerName = employerName;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobStartDate = jobStartDate;
        this.jobEndDate = jobEndDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(String jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public String getJobEndDate() {
        return jobEndDate;
    }

    public void setJobEndDate(String jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public String getDisplyResume() {

        String display = "Full Name: " + getFullName() +
                "\nEmail Address: " + getEmailAddress() + "\n"+
                "\nEmployer Name: " + getEmployerName() +
                "\nJob Title: " + getJobTitle() +
                "\nJob Descriptions: " + getJobDescription() +
                "\nJob Start Date: " + getJobStartDate() +
                "\nJob End Date: " + getJobEndDate();
                System.out.println();
        return display;
    }
}
