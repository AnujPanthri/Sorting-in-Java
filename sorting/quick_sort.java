package sorting;
public class quick_sort
{
    public static int times=0;
    static boolean rev;
    public static int [] sort(int arr[],boolean reversed)
    {
        rev=reversed;
        times=0;
        arr=forward(arr.clone(),0,arr.length-1);
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
    // quick sort
    static int [] swap(int arr[],int i,int j)
    {
        if(i!=j)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }
        return arr;
    }
    static Object[] partition(int arr[],int l,int r)
    {
        int pivot,pivot_idx;
        pivot_idx=r;
        pivot=arr[pivot_idx];

    
        int i,j;
        
            
        i=l-1;
        j=l;
        
        
        while(j<r)
        {
            // if(arr[j]<pivot)
            if(cond(arr[j],pivot))
            {
                i++;
                arr=swap(arr,i,j);
            }
            j++;
            times++;
        }
        i++;
        arr=swap(arr,(i),pivot_idx);
        Object [] data=new Object[2];
        data[0]=arr;
        data[1]=i;

        return data;
    }
    static int [] forward(int arr[],int l,int r)
    {
        if (l<r)
        {
        
        Object [] data=partition(arr,l,r);
        arr=(int[])data[0];
        int pivot_idx=(int)data[1];
        
        arr=forward(arr,l,pivot_idx-1);
        arr=forward(arr,pivot_idx+1,r);
        
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