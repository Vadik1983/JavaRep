import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n)
//      triangleNumber();
//        factorial();
//        simpleNumber();
        calculator();
    }
    //Посчитал до n не включительно.
//    public static void triangleNumber()  {
//            System.out.println("Введите число n");
//            try (Scanner scanner = new Scanner(System.in)) {
//                int n = Integer.parseInt(scanner.nextLine());
//
//                int sum = 0;
//                for (int i = 1; i < n; i++) {
//                    sum = sum + i;
//                }
//                System.out.println("Треугольное число = " + sum);
//            } catch (NumberFormatException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//        }
//    }

    //Вычислить n! (произведение чисел от 1 до n)
//    public static void factorial(){
//        System.out.println("Введите число n");
//            try (Scanner scanner = new Scanner(System.in)) {
//                int n = Integer.parseInt(scanner.nextLine());
//
//                int fact = 1;
//                for (int i = 1; i <= n; i++) {
//                    fact = fact * i;
//                }
//                System.out.println("Факторифл числа "+ n + '=' + fact);
//            } catch (NumberFormatException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//        }
//    }

 // Вывести все простые числа от 1 до 1000
 // (числа, которые делятся только на 1 и на себя без остатка)
    
    //Реализовал для любого числа
    
// public static void simpleNumber(){
//        System.out.println("Введите число n");
//            try (Scanner scanner = new Scanner(System.in)) {
//                int n = Integer.parseInt(scanner.nextLine());
//
//                boolean b = true;
//                for (int j = 2; j <= n; j++) {
//                    for (int i = 2; i < j; i++) {
//                        if (j % i == 0) {
//                            b = false;
//                            break;
//                        }
//                    }
//                    if (b) System.out.println(j);
//                    else b = true;
//                }
//            } catch (NumberFormatException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//        }
//    }
    //Реализовать простой калькулятор 
    // (введите первое число, введите второе число, введите требуемую операцию, ответ)

    public static void calculator(){
        System.out.println("Введите число a");
        System.out.println("Введите число b");
        System.out.println("Выберите действие(q = (*), w = (/), e = (+), r = (-))");
            try (Scanner scanner = new Scanner(System.in)) {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                char action = scanner.next().charAt(0);
                double res = switch (action) {
                    case '+' -> a + b;
                    case '-' -> a - b;
                    case '*' -> a * b;
                    case '/' -> a / b;
                    default -> 0;
                };
                System.out.println(res);
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
}