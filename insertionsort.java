
class insertionsort{
 
 void sort(int arr[])
 {
     int i=0,key=0,j=0;
    int n=arr.length;
    for(i=1;i<n;i++)
    {
      key=arr[i];
      j=i-1;
      while(j>=0&&arr[j]>key)
      {
        arr[j+1]=arr[j];
        j=j-1;
        
        
        }
        arr[j+1]=key;
    
    
    }
}
    public static void printArr(int arr[])
    {
        int i=0;
      int n=arr.length;
      for(i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
       }
        System.out.println();
    }
    public static void main(String args[])
    {
     int arr[]={12,11,13,5,6};
     printArr(arr);
     insertionsort obj=new insertionsort();
     obj.sort(arr);
     printArr(arr);
    }
    
    
    
    }
    
    
    
 