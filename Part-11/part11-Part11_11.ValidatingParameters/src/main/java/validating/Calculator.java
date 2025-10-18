package validating;

public class Calculator {

    public int factorial(int num) {

        if (num < 0) 
            throw new IllegalArgumentException("number should not be less or equal to 0!");

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (subsetSize <= 0 || setSize <= 0) 
            throw new IllegalArgumentException("argument values should be larger than 0!");

        if (subsetSize > setSize) 
            throw new IllegalArgumentException("subsetSize should be less than setSize!");

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
