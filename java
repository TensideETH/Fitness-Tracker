// Example code for a fitness tracker app in Java
public class FitnessTracker {
    private int steps;

    public FitnessTracker() {
        this.steps = 0;
    }

    public void addSteps(int steps) {
        this.steps += steps;
    }

    public int getSteps() {
        return steps;
    }
}

public class Main {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        tracker.addSteps(1000);
        System.out.println("Steps today: " + tracker.getSteps());
    }
}
