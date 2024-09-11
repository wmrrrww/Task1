import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        checkEvenOrOdd(scanner);
        findMinimumOfThree(scanner);
        multiplicationTable();
        sumOfNumbers(scanner);
        fibonacciNumbers(scanner);
        checkPrimeNumber(scanner);
        printNumbersInReverse(scanner);
        sumOfEvenNumbers(scanner);
        reverseString(scanner);
        countDigits(scanner);
        calculateFactorial(scanner);
        sumOfDigits(scanner);
        checkPalindrome(scanner);
        findMaxInArray(scanner);
        sumOfArrayElements(scanner);
        countPositiveAndNegativeNumbers(scanner);
        findPrimesInRange(scanner);
        countVowelsAndConsonants(scanner);
        reverseWordsInString(scanner);
        checkArmstrongNumber(scanner);

        scanner.close();
    }

    // Задача 1
    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Четное" : "Нечётное");
    }

    // Задача 2
    private static void findMinimumOfThree(Scanner scanner) {
        System.out.print("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное: " + min);
    }

    // Задача 3
    private static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    // Задача 4
    private static void sumOfNumbers(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите эти числа:");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Сумма чисел: " + sum);
    }

    // Задача 5
    private static void fibonacciNumbers(Scanner scanner) {
        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Числа Фибоначчи: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Задача 6
    private static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Простое" : "Составное");
    }

    // Задача 7
    private static void printNumbersInReverse(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Числа в обратном порядке:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Задача 8
    private static void sumOfEvenNumbers(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Сумма четных чисел: " + sum);
    }

    // Задача 9
    private static void reverseString(Scanner scanner) {
        System.out.print("Введите строку: ");
        String input = scanner.next();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Обратная строка: " + reversed);
    }

    // Задача 10
    private static void countDigits(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Количество цифр: " + count);
    }

    // Задача 11
    private static void calculateFactorial(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факториал: " + factorial);
    }

    // Задача 12
    private static void sumOfDigits(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
    }

    // Задача 13
    private static void checkPalindrome(Scanner scanner) {
        System.out.print("Введите строку: ");
        String input = scanner.next();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(reversed) ? "Палиндром" : "Не палиндром");
    }

    // Задача 14
    private static void findMaxInArray(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное число: " + max);
    }

    // Задача 15
    private static void sumOfArrayElements(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    // Задача 16
    private static void countPositiveAndNegativeNumbers(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Положительных чисел: " + positiveCount);
        System.out.println("Отрицательных чисел: " + negativeCount);
    }

    // Задача 17
    private static void findPrimesInRange(Scanner scanner) {
        System.out.print("Введите два числа (начало и конец диапазона): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Задача 18
    private static void countVowelsAndConsonants(Scanner scanner) {
        System.out.print("Введите строку: ");
        String input = scanner.next().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }

    // Задача 19
    private static void reverseWordsInString(Scanner scanner) {
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            reversedString.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        System.out.println("Строка с перевернутыми словами: " + reversedString.toString().trim());
    }

    // Задача 20
    private static void checkArmstrongNumber(Scanner scanner) {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        int digits = 0;

        while (number != 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }
        System.out.println(result == originalNumber ? "Число Армстронга" : "Не число Армстронга");
    }
}






























