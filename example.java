import sorting.*;
public class example
{
    public static void display(int arr[])
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
		{
            System.out.print(arr[i]+",");
		}
    }
    public static void main(String[] args) 
    {
        System.out.println("Sorting:");
        int arr[]={12,23,3,212,4,1},sorted_arr[];
        
		display(arr);
        // sorted_arr=insertion_sort.sort(arr,false);
        sorted_arr=insertion_sort.sort(arr,true);
		display(sorted_arr);
		// display(arr);
        System.out.print("\ntimes:"+insertion_sort.times);
    }
}