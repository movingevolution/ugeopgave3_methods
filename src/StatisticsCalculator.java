public class StatisticsCalculator {

    public static void main() {

    int[] myNum = {45, 67, 23, 89, 34, 56, 78};

    double avg = calcAverage(myNum);
    System.out.print("Average: " + avg + " ");

    double max = findMax(myNum);
    System.out.print("Max: " + max + " ");

    double min = findMin(myNum);
    System.out.print("Min: " + min + " ");

    int countAboveAvg = countAboveAverage(myNum);
    System.out.print("Above Average: " + countAboveAvg);

    }

    public static double calcAverage(int[] numbers) {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;

    }

    public static double findMax(int[] numbers) {
        double max = numbers[0];
        for(int n : numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double findMin(int[] numbers) {
        double min = numbers[0];
        for(int n : numbers) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int countAboveAverage (int[] numbers) {
        int counter = 0;
        double average = calcAverage(numbers);
        for(int n: numbers) {
            if (n > average) {
                counter++;
            }
        }
        return counter;
    }

}

