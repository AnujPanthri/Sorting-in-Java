package sorting;
public class insertion_sort
{
    // insertion sort
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
    static int [] forward(int arr[])
    {
        int unsorted_element,i,j;
        for(i=1;i<arr.length;i++)
        {
            unsorted_element=arr[i];
            j=i;
       
                // while(j-1>=0&&arr[j-1]>unsorted_element) // first condition should j-1>=0
                while(j-1>=0&&cond(unsorted_element,arr[j-1])) // first condition should j-1>=0
                {
                    arr[j]=arr[j-1];
                    j=j-1;
                    times++;
                }
            arr[j]=unsorted_element;
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
		int arr[]={12,23,3,213,1,2,4,1};
		display(arr);
		display(sort(arr,false));
		display(sort(arr,true));
		display(arr);
        System.out.print("times:"+times);
	}
}
