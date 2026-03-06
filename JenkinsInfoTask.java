public class JenkinsInfoTask {
    public static void main(String[] args) {
        // Accessing Jenkins environment variables passed to the JVM
        String buildNumber = System.getenv("BUILD_NUMBER");
        String jobName = System.getenv("JOB_NAME");

        System.out.println("--- Java Output ---");
        System.out.println("Current Build: " + buildNumber);
        System.out.println("Project Name: " + jobName);
    }
}
