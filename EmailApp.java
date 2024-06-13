package emailapp;

import java.util.Scanner;
public class EmailApp {

	public static void main(String[] args) {
		System.out.println("Enter First name");
		Scanner in=new Scanner(System.in);
		String a = in.nextLine();
		System.out.println("Enter Last name");
		Scanner in1 =new Scanner(System.in);
		String b = in1.nextLine();
		Email em1=new Email(a,b);
        em1.setAlternateEmail(b.toLowerCase().substring(0,4) + "&gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println("IF YOU WANT TO CHANGE YOUR PASSWORD\n 1.YES\n 2.NO\n");
        Scanner in3=new Scanner(System.in);
		int op= in3.nextInt();
		if(op==1) {
			em1.changePassword();
		}
		}
        }

