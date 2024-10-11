import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        // Задача 1
        System.out.println(func1(1,2));

        // Задача 2
        System.out.println(func2(10,2));

        // Задача 3
        System.out.println(func3("1"));

        // Задача 4
        func4(150);

        // Задача 5
        System.out.println(func5(49));

        // Задача 6
        System.out.println(func6(5));

        // Задача 7
        int[] array = {1, 2 ,3};
        func7(array);

        // Задача 8
        System.out.println(func8(5, 3));

        // Задача 9
        System.out.println(func9("string", 3));

        // Задача 10
        System.out.println(func10(new int[]{1, 2, 3}, 2));

        // Задача 11
        System.out.println(func11(5));

        // Задача 12
        System.out.println(func12(6, 3));

        // Задача 13
        System.out.println(func13(Arrays.asList(10, 20, 30, 40), 3));

        // Задача 14
        func14("abcdefdh");

        // Задача 15
        func15("12.09.2024");

        // Задача 16
        System.out.println(func16("string1", " string2"));

        // Задача 17
        System.out.println(func17(5, 2));

        // Задача 18
        System.out.println(func18(4));

        // Задача 19
        System.out.println(func19(36.6));

        // Задача 20
        func20("string");

    }

    // Задача 1

    public static int func1(int num1, int num2) {
        if (num1 == num2) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(num1, num2 );
    }

    // Задача 2

    public static double func2(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 / num2;
    }

    // Задача 3

    public static int func3(String str) {
        try {
            return Integer.parseInt(str);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Строка не может быть конвертирована в число");
        }
    }

    // Задача 4

    public static void func4(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    // Задача 5

    public static double func5(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        return Math.sqrt(num);
    }

    // Задача 6

    public static long func6(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Факториал от отрицательного числа не определен");
        }
        long result = 1;

        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Задача 7

    public static void func7(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит ноль");
            }
        }
    }

    // Задача 8

    public static double func8(double num1, int num2) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной");
        }
        return Math.pow(num1, num2);
    }

    // Задача 9

    public static String func9(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }

    // Задача 10

    public static int func10(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == elem) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден");
    }

    // Задача 11

    public static String func11(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        return Integer.toBinaryString(num);
    }

    // Задача 12

    public static boolean func12(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 % num2 == 0;
    }

    // Задача 13

    public static <T> T func13(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    // Задача 14

    public static void func14(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль слишком короткий");
        }
    }

    // Задача 15

    public static void func15(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate.parse(dateStr, formatter);

        } catch (DateTimeParseException e) {

            throw new IllegalArgumentException("Неверный формат даты");
        }
    }

    // Задача 16

    public static String func16(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // Задача 17

    public static int func17(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return num1 % num2;
    }

    // Задача 18

    public static double func18(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число отрицательное");
        }
        return Math.sqrt(num);
    }

    // Задача 19

    public static double func19(double num) {
        if (num < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return num * 9 / 5 + 32;
    }

    // Задача 20

    public static void func20(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или null");
        }
    }

}