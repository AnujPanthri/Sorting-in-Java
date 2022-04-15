package sorting;
public class bubble_sort
{
    public static int times=0;
    static boolean rev;
// bubble sort with recursion
    public static int [] sort(int arr[],boolean reversed)
    {
        rev=reversed;
        times=0;
        arr=forward(arr.clone(),1,arr.length-1);
        return arr;
    }
    static boolean cond(int a,int b)
    {
        if(rev)
        {
            if(a>b)
                return true;
            else
                return false;
        }
        else
        {
            if(a<b)
                return true;
            else
                return false;
        }
    }
    static int [] forward(int arr[],int curr_pass,int second_last)
    {
        if (curr_pass==second_last)
            return arr;
        
        for(int i=0;i<arr.length-1-(curr_pass-1);i++)   
        {
            // if(arr[i]>arr[i+1])
            if(cond(arr[i+1],arr[i]))
            {
                arr[i]=arr[i]+arr[i+1]; // sum
                arr[i+1]=arr[i]-arr[i+1]; // sum - i+1 = i
                arr[i]=arr[i]-arr[i+1]; // sum - i = i+1
            }
            times++;
        }
        
        return forward(arr,curr_pass+1,second_last);
    }
    
    public static void display(int arr[])
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
		{
            System.out.print(arr[i]+",");
		}
    }
    
	public static void main(String[] args) {
		
		int arr[]={12,23,3,213,1,2,4,1};
		display(arr);
		// arr=;
		display(sort(arr,false));
		display(sort(arr,true));
		display(arr);
        System.out.print("times:"+times);
	}
}
