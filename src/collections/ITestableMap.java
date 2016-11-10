package collections;

import java.util.Map;

interface ITestableMap extends ITestable, Map<Integer, Integer> {
    default double addTest() {
        double startTime;
        double endTime;

        startTime = System.nanoTime();

        for (int j = 0; j < 50; j++) {
            this.put(j, rand.nextInt(50));
        }

        endTime = System.nanoTime();

        return endTime - startTime;
    }

    default double removeTest() {
        double startTime;
        double endTime;
        // Add
        for (int j = 0; j < 50; j++) {
            this.put(j, rand.nextInt(50));
        }
        // Remove
        startTime = System.nanoTime();
        for (int j = 0; j < this.size(); j++) {
            this.remove(j);
        }
        endTime = System.nanoTime();

        return endTime - startTime;
    }

    default double searchTest() {
        double startTime;
        double endTime;
        // Add
        for (int j = 0; j < (50); j++) {
            this.put(j, rand.nextInt(50));
        }
        // Remove
        int n = rand.nextInt(50);
        startTime = System.nanoTime();
        for (int j = 0; j < this.size(); j++) {
            this.values().contains(n);
        }
        endTime = System.nanoTime();

        return endTime - startTime;
    }
}