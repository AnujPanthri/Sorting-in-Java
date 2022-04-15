package sorting;
public class selection_sort
{
    public static int times=0;
    static boolean rev;
    public static int [] sort(int arr[],boolean reversed)
    {
        rev=reversed;
        times=0;
        arr=forward(arr.clone());
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
// selection sort
    static int [] forward(int arr[])
    {
        
        for(int i=0;i<arr.length-1;i++)   
        {
            for(int j=i+1;j<arr.length;j++)
            {
                // if(arr[j]>arr[i])
                if(cond(arr[j],arr[i]))
                {
                    arr[i]=arr[i]+arr[j]; // sum
                    arr[j]=arr[i]-arr[j]; // sum - j = i
                    arr[i]=arr[i]-arr[j]; // sum - i = j
                }
                times++;
            }
        }
        
        return arr;
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
		// int arr[]={12,23,3,213,1,2,4,3,67,21,7,1,6,12,1};
		int arr[]={12,23,3,213,1,2,4,1};
		display(arr);
		display(sort(arr,false));
		display(sort(arr,true));
		display(arr);
        System.out.print("times:"+times);
	}
}