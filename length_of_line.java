import java.util.Scanner;

	public class length_of_line {
		
			public static void main(String args[]) {
	 			int x1,y1,x2,y2;
	   		int p1,p1,q2,q2;
				Scanner sc =new Scanner(System.in);
	   			System.out.println("Enter x1 value :");
	  				 x1=sc.nextInt();
	   			System.out.println("Enter x2 value :");
	   				x2=sc.nextInt();
	   			System.out.println("Enter y1 value :");
	   				y1=sc.nextInt();
	   			System.out.println("Enter y2 value :");
	   				y2=sc.nextInt();
	       		System.out.println("Enter p1 value :");
	         		p1=sc.nextInt();
	      		System.out.println("Enter p2 value :");
	         		p2=sc.nextInt();
	      		System.out.println("Enter q1 value :");
	         		q1=sc.nextInt();
	      		System.out.println("Enter q2 value :");
	         		q2=sc.nextInt();

		Double line1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
		Double line2=Math.sqrt((p2-p1)^2+(q2-q1)^2);
		System.out.println(line1);
		System.out.println(line2);
}
}
