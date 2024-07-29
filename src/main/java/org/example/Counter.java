package org.example;

public class Counter {
        private int value;

        // Constructor to set start value
        public Counter(int startValue) {
            this.value = startValue;
        }

        // Constructor to set start value to 0
        public Counter() {
            this.value = 0;
        }

        // Method to return the current value
        public int value() {
            return value;
        }

        // Method to increase the value by 1
        public void increase() {
            value++;
        }

        // Method to decrease the value by 1
        public void decrease() {
            value--;
        }

        // Overloaded method to increase the value by a given amount
        public void increase(int increaseBy) {
            if (increaseBy > 0) {
                value += increaseBy;
            }
        }

        // Overloaded method to decrease the value by a given amount
        public void decrease(int decreaseBy) {
            if (decreaseBy > 0) {
                value -= decreaseBy;
            }
        }
    }

