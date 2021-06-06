public class sumavg
{
	public static void main(String[] Args)
	{
		int[] num={5,3,6,3,8};
		int sum=0;
		for(int i:num)
		{
			sum=sum+i;
		}
		System.out.println("sum is : "+sum);
		int avg=sum/5;
		System.out.println("Average is : "+avg);
	}
}