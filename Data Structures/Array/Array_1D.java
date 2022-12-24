//Operations on 1D Array
//Coder: Ashi777

public class Array_1D
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		
		//To display all the elements
		System.out.println("The elements of the array are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		//To display odd elements
		System.out.println("\n\nThe odd elements are :");
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2!=0)
			{
				System.out.print(arr[j]+"  ");
			}
		}
		
		//To display even elements
		System.out.println("\n\nThe even elements are :");
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]%2==0)
			{
				System.out.print(arr[k]+"  ");
			}
		}
		
		//To display sum of all elements
		System.out.println("\n\nThe sum of all elements is :");
		int sum=0;
		for(int a=0;a<arr.length;a++)
		{
			sum=sum+arr[a];
		}
		System.out.print(sum);
		
		//To display sum of odd index elements
		System.out.println("\n\nThe sum of odd index elements is :");
		int sum1=0;
		for(int b=0;b<arr.length;b++)
		{
			if(b%2!=0)
			{
				sum1=sum1+arr[b];
			}
		}
		System.out.print(sum1);
		
		//To display the sum of all even index elements
		System.out.println("\n\nThe sum of even index elements is :");
		int sum2=0;
		for(int c=0;c<arr.length;c++)
		{
			if(c%2==0)
			{
				sum2=sum2+arr[c];
			}
		}
		System.out.print(sum2);
		
		//To find the largest number in the array
		System.out.println("\n\nThe largest number in the arrray is :");
		int largest=0;
		for(int d=0;d<arr.length;d++)
		{
			if(arr[d]>largest)
			{
				largest=arr[d];
			}
		}
		System.out.print(largest);
		
		//To find the second largest number in the array
		System.out.println("\n\nThe second largest number in the arrray is :");
		int secondlargest=0;
		for(int e=0;e<arr.length;e++)
		{
			if(secondlargest<arr[e] && arr[e]<largest)
			{
				secondlargest=arr[e];
			}
		}
		System.out.print(secondlargest);
		
		//To find the third largest number in the array
		System.out.println("\n\nThe third largest number in the arrray is :");
		int thirdlargest=0;
		for(int p=0;p<arr.length;p++)
		{
			if(thirdlargest<arr[p] && arr[p]<secondlargest)
			{
				thirdlargest=arr[p];
			}
		}
		System.out.print(thirdlargest);
		
		//To sort the array in ascending order
		int temp;
		for(int q=0;q<arr.length;q++)
		{
			for(int r=q+1;r<arr.length;r++)
			{
				if(arr[q]>arr[r])
				{
					temp=arr[q];
					arr[q]=arr[r];
					arr[r]=temp;
				}
			}
		}
		System.out.println("\n\nThe elements in ascending order are :");
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+"  ");
		}
		
		//To sort the array in descending order
		int temp1;
		for(int h=0;h<arr.length;h++)
		{
			for(int g=h+1;g<arr.length;g++)
			{
				if(arr[h]<arr[g])
				{
					temp1=arr[h];
					arr[h]=arr[g];
					arr[g]=temp1;
				}
			}
		}
		System.out.println("\n\nThe elements in descending order are :");
		for(int y=0;y<arr.length;y++)
		{
			System.out.print(arr[y]+"  ");
		}
	}
}
