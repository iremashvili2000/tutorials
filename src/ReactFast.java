import java.util.Scanner;

public class ReactFast {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		System.out.println("Go!!!!!!!!!");
		long startTime=System.currentTimeMillis();
		
		Scanner s=new Scanner(System.in);
		String a=s.next();
		System.out.println(a);
		long stopTime=System.currentTimeMillis();
		
		long rectionTime=stopTime-startTime;
		System.out.println(rectionTime+"ms");
		
		
		
	}

}
