import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner stdin=new Scanner(System.in);
		double bmi;
		double weight,height;
		
		System.out.println("体重を入力してください");
		weight=stdin.nextDouble();
		
		System.out.println("身長を入力してください");
		height=stdin.nextDouble();

		height=height/100;
		bmi=weight/(height*height);

		System.out.println("あなたのBMIは"+(int)bmi);
	}
}

