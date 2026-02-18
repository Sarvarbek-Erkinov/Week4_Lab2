public class StepCounterTester {
    static void main(String[] args) {
        StepCounter userA = new StepCounter();
        StepCounter userB = new StepCounter();

        userA.walk(10);
        userB.walk(15);
        userA.walk(10);
        userB.walk(5);

        System.out.println("UserA walks " + userA.getIndividualSteps() + " steps");
        System.out.println("UserB walks " + userB.getIndividualSteps() + " steps");
        System.out.println("UserA and B walk " + StepCounter.totalStepsAllUsers + " steps");
    }
}
