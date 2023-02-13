import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Сканер для ввода с клавиатуры
        System.out.print("Введите x: ");
        int x = scan.nextInt(); // ввод с клавиатуры в переменную x
        System.out.print("Введите n: ");
        int max_n = scan.nextInt(); // ввод с клавиатуры максимальное значение n
        double result = 0;
        for(int i = 0; i < max_n; i++){
            int upline = (int) (Math.pow(x,2*i) * Math.pow(-1,i));//по формуле
            double underline = 2 * i + 1;
            result = upline/factorial(underline) + result;
        }
        System.out.println("Result: "+ (result));
    }
    public static double factorial(double arg){
        if(arg == 1){//факториал 1 = 1
            return 1;
        }
        else{
            return arg * factorial(arg-1);
        }
}

