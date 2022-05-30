import java.util.Scanner;

public class Main {

    public static void main(String[]args){
      /*  /*. Напишите программу на Java, которая принимает два целых числа от пользователя,
        а затем печатает сумму, разницу, произведение,
        среднее значение, расстояние (разница между целыми числами), максимум (большее из двух целых чисел), минимум (меньшее из двух целых чисел).

            Тестовые данные
            Введите 1-е целое число: 25
            Введите второе целое число: 5
            Ожидаемый результат :
            Сумма двух целых чисел: 30
            Разница двух целых чисел: 20
            Произведение из двух целых чисел: 125
            Среднее из двух целых чисел: 15,00
            Расстояние двух целых чисел: 20
            Макс целое число: 25
            Мин целое число: 5*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е целое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе целое число: ");
        int num2 = sc.nextInt();
        System.out.println("Сумма двух целых чисел " + (num1 + num2));
        System.out.println("Разница двух целых чисел " + (num1 - num2));
        System.out.println("Произведение из двух целых чисел: " + (num1 * num2));
        System.out.println("Среднее из двух целых чисел: " + (num1 + num2)/2);
        System.out.println("Расстояние двух целых чисел: " + (num1 - num2));
        System.out.println("Макс целое число: " + (num1 > num2 ? num1 : num2));
        System.out.println("Мин целое число: " +  (num1 < num2 ? num1 : num2));
        /*Напишите программу на Java, которая считывает число в дюймах и преобразует его в метры. Перейти к редактору
          Примечание. Один дюйм равен 0,0254 метра.
          Тестовые данные
          Введите значение для дюйма: 1000
          Ожидаемый результат :
          1000,0 дюйма - это 25,4 метра*/
       System.out.println("Введите значение для дюйма: ");
        int srcNum = sc.nextInt();
        System.out.printf("%d дюйма - это %.1f метра",srcNum, (double)srcNum * 0.0254 );

        /*Напишите программу на Java, которая читает целое число от 0 до 1000 и добавляет все цифры в целое число. Перейти к редактору

        Тестовые данные
        Введите целое число от 0 до 1000: 565
        Ожидаемый результат :
        Сумма всех цифр в 565 равна 16*/
      System.out.print("\nВведите целое число от 0 до 1000: ");
        int srcNum3 = sc.nextInt();
        int num3 = srcNum3;
        int sum = 0;
        while (num3 != 0) {
            int digit = num3 % 10;
            sum += digit;
            num3 /= 10;
        }
        System.out.printf("Сумма всех цифр в %d равна %d", srcNum3, sum);
        /*6. Напишите программу на Java для вычисления индекса массы тела (BMI). Перейти к редактору

        Тестовые данные
        Вес ввода в фунтах: 452
        Высота ввода в дюймах: 72
        Ожидаемый результат :
        Индекс массы тела 61,30159143458721*/
        System.out.print("\nВес ввода в фунтах: ");
        double weight = sc.nextDouble();
        System.out.println("Высота ввода в дюймах:");
        double inches = sc.nextDouble();
        double bmi = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println(bmi);

       /* 8. Напишите программу на Java, которая читает число и отображает квадрат, куб и четвертую степень. Перейти к редактору

        Ожидаемый результат :
        квадрат: .2f
        Куб: .2f
        Четвертая степень: 50625,00*/
        System.out.println("\nВведите число");
        int readNum = sc.nextInt();
        System.out.println("квадрат: " + readNum * readNum);
        System.out.println("Куб: " + readNum * readNum * readNum);
        System.out.println("Четвертая степень: " + Math.pow(readNum, 4));

       /* 10. Напишите программу на Java, чтобы разбить целое число на последовательность отдельных цифр. Перейти к редактору

        Тестовые данные
        Введите шесть неотрицательных цифр: 123456
        Ожидаемый результат :
        1 2 3 4 5 6*/
        System.out.println("\nВведите шесть неотрицательных цифр: ");
        int srcNum1 = sc.nextInt();
        String sum1 = "";
       // while (srcNum != 0) {
        for (int i = 100000; i > 0; i /= 10){
            int digit = srcNum1 / i;
            sum1 += digit + " ";
            srcNum1 %= i;
            }

        //}
        System.out.println(sum1);

    }
}


