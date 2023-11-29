import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("BMIを計算して、肥満度を表示します。");

        System.out.println("1人目の身長を入力してください。");
        double height1 = Double.parseDouble(sc.nextLine());
        System.out.println("1人目の体重を入力してください。");
        double weight1 = Double.parseDouble(sc.nextLine());

        double bmi1 = weight1 / (height1 * height1);

        System.out.println("1人目の");
        System.out.printf("BMIは %.2f です。\n", bmi1);

        System.out.println("2人目の身長を入力してください。");
        double height2 = Double.parseDouble(sc.nextLine());
        System.out.println("2人目の体重を入力してください。");
        double weight2 = Double.parseDouble(sc.nextLine());

        double bmi2 = weight2 / (height2 * height2);

        System.out.println("2人目の");
        System.out.printf("BMIは %.2f です。\n", bmi2);
    }
}