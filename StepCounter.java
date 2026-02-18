public class StepCounter {
    static int totalStepsAllUsers = 0;
    private int individualSteps = 0;

    public void walk(int steps){
        totalStepsAllUsers += steps;
        this.individualSteps += steps;
    }

    static void resetGlobalSteps(){
        totalStepsAllUsers = 0;
    }

    public int getIndividualSteps(){return individualSteps;}

}
