import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("BMIを計算して、肥満度を表示します。");

        System.out.println("身長を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください。");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);

        if(bmi < 18.5){
            System.out.println(bmi);
            System.out.println("適正より低いです。");
        } else if(bmi >= 18.5 && bmi < 25){
            System.out.println(bmi);
            System.out.println("適正体型です。");
        } else if(bmi >= 25 && bmi < 30){
            System.out.println(bmi);
            System.out.println("適正より高いです。");
        }
    }
}