package org.example;

public class CounterMain {
    public static void main(String[] args) {
        // Create counter objects using different constructors
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        // Display initial values
        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        // Use increase and decrease methods
        counter1.increase();
        counter2.decrease();

        // Display updated values
        System.out.println("After increase, value of counter1: " + counter1.value());
        System.out.println("After decrease, value of counter2: " + counter2.value());

        // Use overloaded increase and decrease methods
        counter1.increase(5);
        counter2.decrease(3);

        // Display final values
        System.out.println("After increase by 5, value of counter1: " + counter1.value());
        System.out.println("After decrease by 3, value of counter2: " + counter2.value());

        // Test with negative values
        counter1.increase(-2);
        counter2.decrease(-2);

        // Display values to show negative values did not change the counters
        System.out.println("After increase by -2, value of counter1: " + counter1.value());
        System.out.println("After decrease by -2, value of counter2: " + counter2.value());
    }
}