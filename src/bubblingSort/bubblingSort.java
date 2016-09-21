package bubblingSort;
import java.util.Scanner;
public class bubblingSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字，并以空格隔开：");
		String str=sc.nextLine();
		String[] string=str.split("\\s+");
		int[] array=new int[string.length];
		for(int i=0;i<string.length;i++)
		{
			array[i]=Integer.parseInt(string[i]);
		}
		//int[] array={3,6,9,5,1,13,88,55,33,11};
		int temp=0;
		for(int j=0;j<array.length;j++)
		{
			
			for(int k=0;k<array.length-j-1;k++)
			{
				if(array[k]>array[k+1])
				{
					temp=array[k];
					array[k]=array[k+1];
					array[k+1]=temp;
				}
			}
			
		}
		for(int m=0;m<array.length;m++)
		{
		
		System.out.print(array[m]);
		System.out.print(' ');
		}
		sc.close();
	}

}
