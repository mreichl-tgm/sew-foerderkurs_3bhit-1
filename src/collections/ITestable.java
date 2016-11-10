package collections;

import java.util.Random;

interface ITestable {
    Random rand = new Random();

    double addTest();
    double removeTest();
    double searchTest();
    void clear();
}
