package week03;

import java.util.Scanner;

public class Basic3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		System.out.println("�̸� �Է�:");
		name = scn.next();
		if(name.equals("ȫ�浿"))
			System.out.printf("�̸��� %s �Դϴ�.",name);
		else
			System.out.printf("%s�� �ƴմϴ�.",name);
		scn.close();
	}

}
