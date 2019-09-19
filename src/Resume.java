import java.util.ArrayList;

public class Resume {
    private String name;
    private String email;
    private ArrayList<String> jobs  = new ArrayList<>();

    public Resume() {
    }

    public Resume(String name, String email, ArrayList<String> jobs) {
        this.name = name;
        this.email = email;
        this.jobs = jobs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String> jobs) {
        this.jobs = jobs;
    }
    public String getDisplyResume() {
        String job = "";
        for (String job1 : jobs) {
            job = job + jobs + " ";
        }
        String display = "Name: " + getName() +
                "\nEmail " + getEmail() +
                "\nJobs: " + job;
        return display;
    }
}
