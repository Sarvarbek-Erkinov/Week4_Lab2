public class MathTool {
    static void main(String[] args) {
        MathTool factorial = new MathTool();
        StopWatch sw1 = new StopWatch();
        sw1.start();
        for(int i = 0; i < 1_000_000; i++){
            factorial.factorialRecursive(20);
        }
        sw1.stop();
        System.out.println("The time for factorial: " + sw1.getElapsedTime());

        sw1.start();
        for(int i = 0; i < 1_000_000; i++){
            factorial.factorialIterative(20);
        }
        sw1.stop();
        System.out.println("The time for iterator: " + sw1.getElapsedTime());

    }

    long factorialRecursive(int n){
        if(n == 0) return 1;
        return n * factorialRecursive(n -1);
    }

    long factorialIterative(int n){
        long collector = 1;
        for(int i = 1; i <= n; i++){
            collector *= n;
        }
        return collector;
    }
}
