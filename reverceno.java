package aa;

import java.util.Scanner;

public class reverceno {
	public static void main(String[] args){
		int num;
		int rem;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0){
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

}
