package sorting;
public class merge_sort
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
    // merge sort
    static int [] merge(int arr[],int l,int mid,int r)
    {
        int l_len,r_len;
        l_len=(mid+1)-l;
        r_len=r-mid;
        
        int L[]=new int[l_len],R[]=new int[r_len];
        int i,j,k;
        for(i=0;i<l_len;i++)
            L[i]=arr[l+i];
        for(i=0;i<r_len;i++)
            R[i]=arr[(mid+1)+i];
            
        i=j=0;
        k=l;
        
        
        while(i<l_len&&j<r_len)
        {
            if(cond(L[i],R[j]))
            {
                 arr[k]=L[i];
                 i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
            times++;
        }
        while(i<l_len)
        {
            arr[k]=L[i];
            i++;
            k++;
            times++;
        }
        while(j<r_len)
        {
            arr[k]=R[j];
            j++;
            k++;
            times++;
        }
        return arr;
    }
    static int [] forward(int arr[],int l,int r)
    {
        if (l<r)
        {
        int mid=l+ (r-l)/2;
        
        arr=forward(arr,l,mid);
        arr=forward(arr,mid+1,r);
        
        
        arr=merge(arr,l,mid,r);
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
