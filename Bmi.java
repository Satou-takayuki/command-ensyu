import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("BMIを計算して、肥満度を表示します。");

        System.out.println("身長を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください。");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.printf("%.2f", bmi);
            System.out.println("、適正より低いです。");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.printf("%.2f", bmi);
            System.out.println("、適正体型です。");
        } else if(bmi >= 25 && bmi < 30){
            System.out.printf("%.2f", bmi);
            System.out.println("、適正より高いです。");
        }

        System.out.println("もう一人の身長を入力してください。");
        double height2 = sc.nextDouble();
        System.out.println("もう一人の体重を入力してください。");
        double weight2 = sc.nextDouble();

        double bmi2 = weight2 / (height2 * height2);

        if(bmi < 18.5){
            System.out.printf("%.2f", bmi2);
            System.out.println("、適正より低いです。");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.printf("%.2f", bmi2);
            System.out.println("、適正体型です。");
        } else if(bmi >= 25 && bmi < 30){
            System.out.printf("%.2f", bmi2);
            System.out.println("、適正より高いです。");
        }
    }
}