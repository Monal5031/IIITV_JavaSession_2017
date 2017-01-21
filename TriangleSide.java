import java.io.BufferedReader;
import java.io.InputStreamReader;

class TriangleSide
	{
	public static void main(String[] lol)throws Exception
		{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the co-ords of triangle in format:\nx1 y1\nx2 y2\nx3 y3");
		String s;
		double[][] pts=new double[3][2];
		for(int i=0;i<3;i++)
			{
			s=inp.readLine();
			String[] co_ord=s.split(" ");
			pts[i][0]=Integer.parseInt(co_ord[0]);
			pts[i][1]=Integer.parseInt(co_ord[1]);
			}
		double[] sides=new double[3];
		for(int i=0;i<3;i++)
			{
			sides[i]=Math.sqrt(((pts[i][0]-pts[(i+1)%3][0])*(pts[i][0]-pts[(i+1)%3][0]))+((pts[i][1]-pts[(i+1)%3][1])*(pts[i][1]-pts[(i+1)%3][1])));
			}
		System.out.println("The sides of triangle are:");
		for(int i=0;i<3;i++)
			{
			System.out.println(i+1+"th side is: "+sides[i]);
			}
		}
	}
