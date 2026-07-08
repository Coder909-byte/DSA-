
class GFG 
{ 
    static int remDups(int arr[], int n)
    {
    	int temp[] = new int[n];

    	temp[0] = arr[0];

    	int res = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(temp[res - 1] != arr[i])
    		{
    			temp[res] = arr[i];
    			res++;
    		}
    	}

    	for(int i = 0; i < res; i++)
    	{
    		arr[i] = temp[i];
    	}

    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = remDups(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}

 

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Compare current element with the NEXT element
            // (i + 1) % n cleanly wraps the last element back to index 0
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        // A sorted and rotated array can have at most ONE point 
        // where a number is bigger than the next number.
        return count <= 1;
    }
} 