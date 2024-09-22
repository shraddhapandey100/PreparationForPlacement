import java.util.*;
public class Main{
	public static void main(String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
	    int N = scanner.nextInt();
	    int arr[] = new int[N];
	    for(int i=0; i<N; i++){
	        arr[i] = scanner.nextInt();
	    }
	    int result = solve(arr, N);
		System.out.println(result);
	}
	public static int solve(int arr[], int N){
	    if(arr == null ||N ==0){
	        return 0;
	    }
	    int max = arr[0];
	    int count =1;
	    for(int i=1; i<N; i++){
	       if(arr[i] > max){
	           count++;
	           max = arr[i];
	       } 
	    }
	    return count;
	}
	
}
