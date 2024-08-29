package round_2_programming;

public class Equilibrium_pos {
	
	static int pos(int[] arr, int N) {
		int total = 0;
		
		for(int i=0; i<N; i++) {
			total += arr[i];
		}
		
		int left = 0;
		
		for(int i=0; i<N; i++) {
			left += arr[i];
			
			if(total == left) {
				return i;
			}
			total -= arr[i];
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 2, 1, 2, 2};
		
		int ans = pos(arr, arr.length);
		
		System.out.println(ans);
		
		

	}

}
