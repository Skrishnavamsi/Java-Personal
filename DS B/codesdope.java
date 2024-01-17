
public class codesdope {
    public static void pushZerosToEnd(int[] arr, int n) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        for(int j=count;j<n;j++)
        {
            arr[count++]=0;
        }}
    public static void main(String[] args) {
        int arr[]= {3,0,5,4,0,2,2};
        pushZerosToEnd(arr,7);
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]);
        }}
}