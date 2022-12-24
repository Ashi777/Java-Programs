//Operations on 2D Array
//Coder: Ashi777

import java.util.*;
public class Array_2D 
{
	public static void main(String[] args) 
  {
		
		//To input the number of rows and columns
		System.out.println("Enter the no. of rows and columns: ");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns =sc.nextInt();

		//To input the elements of the array
		int arr[][]=new int[rows][columns];
		System.out.println("\n\nEnter the elements of the array: ");
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				arr[i][j]=sc.nextInt();
			}
		}
				
		//To display the array
		System.out.println("\n\nThe array is: ");
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");
		}
				
		//To display all rows
		System.out.println("\n\nThe rows are: ");
		for(int i=0;i<rows;i++)
    {
			System.out.print("Row "+ (i+1) + " = ");
			for(int j=0;j<columns;j++)
      {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println("");
		}
				
		//To display all columns
		System.out.println("\n\nThe columns are: ");
		for(int i=0;i<columns;i++)
    {
			System.out.print("Column "+ (i+1) + " = ");
			for(int j=0;j<rows;j++)
      {
				System.out.print(arr[j][i]+"  ");
			}
			System.out.println("");
		}
				
		//To display row wise sum
		System.out.println("\n\nThe row wise sum: ");
		for(int i=0;i<rows;i++)
    {
			int rSum = 0;
			System.out.print("R"+ (i+1) + " = ");
			for(int j=0;j<columns;j++)
      {
				rSum = arr[i][j] + rSum;
			}
			System.out.println(rSum);
		}
				
		//To display column wise sum
		System.out.println("\n\nThe column wise sum: ");
		for(int i=0;i<columns;i++)
    {
			int cSum = 0;
			System.out.print("C"+ (i+1) + " = ");
			for(int j=0;j<rows;j++)
      {
				cSum = arr[j][i] + cSum;
			}
			System.out.println(cSum);
		}
				
		//Row and column sum(sum of all the elements)
		System.out.println("\n\nThe sum of all the elements of the array is: ");
		int sum = 0;
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				sum = arr[i][j] + sum;
			}
		}
		System.out.println(sum);
				
		//To add two 2D arrays
		System.out.println("\n\nEnter the elements of the second array of " + rows + " rows and " + columns + " columns: ");
		int arr2[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n\nThe second array is: ");
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\nThe sum of the two arrays is: ");
		int arrsum[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				arrsum[i][j]=arr[i][j]+arr2[i][j];
			}
		}	
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				System.out.print(arrsum[i][j]+"  ");
			}
			System.out.println("");
		}
			
		//To subtract two 2D arrays
		System.out.println("\n\nThe difference of the two arrays is: ");
		int arrdiff[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				arrdiff[i][j]=arr[i][j]-arr2[i][j];
			}
		}	
		for(int i=0;i<rows;i++)
    {
			for(int j=0;j<columns;j++)
      {
				System.out.print(arrdiff[i][j]+"  ");
			}
			System.out.println("");
		}
				
		//To multiply two 2D arrays
		System.out.println("\n\nEnter the number of rows and columns in the 2D array to be multiplied to the first array: ");
		int rows1 =sc.nextInt();
		int columns1  =sc.nextInt();
		System.out.println("\n\nEnter the elements of the array: ");
		int arr3[][]=new int[rows1][columns1];
		for(int i=0;i<rows1;i++)
    {
			for(int j=0;j<columns1;j++)
      {
				arr3[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n\nThe array to be multiplied to the first array is: ");
		for(int i=0;i<rows1;i++)
    {
			for(int j=0;j<columns1;j++)
      {
				System.out.print(arr3[i][j]+"  ");
			}
			System.out.println("");
		}		
		if(rows!=columns1)
    {
			System.out.println("\n\nMultipllication not possible");
		}
		else
    {
			int arrmul[][] = new int[rows][columns1];
			for(int i=0;i<rows;i++)
      {
				for(int j=0;j<columns1;j++)
        {
					for(int k=0;k<rows1;k++) 
          {
						arrmul[i][j]+=arr[i][k]*arr3[k][j];
					}
				}
			}
			System.out.println("\n\nThe resultant array after multiplication is: ");
			for(int i=0;i<rows;i++)
      {
				for(int j=0;j<columns1;j++)
        {
					System.out.print(arrmul[i][j]+"  ");
				}
				System.out.println("");
			}
		}
					
		// To print the Principal Diagonal elements
		System.out.println("\n\nPrincipal Diagonal elements are: ");
		for (int i = 0; i < rows; i++) 
    {
			for (int j = 0; j < columns; j++) 
      {
				if (i == j) 
        {
					System.out.print(arr[i][j] + ", ");
	            }
	        }
	    }
	    System.out.println("");
	 
	    //To print the Secondary Diagonal
        System.out.println("\n\nSecondary Diagonal elements are: ");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                if ((i + j) == (rows - 1)) 
                {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.println("");
	}
}
