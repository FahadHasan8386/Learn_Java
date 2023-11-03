class AddOperation {
    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    double add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    double add(double a, double b) {
        return a + b;
    }
}

public class SumOperation {
    public static void main(String[] args) {
        AddOperation math = new AddOperation();

        int result1 = math.add(3, 7);
        double result2 = math.add(5, 7, 10);
        double result3 = math.add(3.5, 2.7);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}
