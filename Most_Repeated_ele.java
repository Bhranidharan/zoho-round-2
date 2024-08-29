package round_2_programming;

import java.util.*;

public class Most_Repeated_ele {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner an = new Scanner(System.in);
		int N = an.nextInt();
		int[] arr = new int[N];
		
		HashSet<Integer> set = new HashSet<>();
		
		
		for(int i=0; i<N; i++) {
			arr[i] = an.nextInt();
		}
		int max = Arrays.stream(arr).max().orElse(0);
		int[] countArr = new int[max+1];

		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]+ " "+ countArr.length);

			if(!set.contains(arr[i])) {
				set.add(arr[i]);
			}
			countArr[arr[i]]++;
		}
		
		int maxCount = 0;
		int ans = countArr[0];
		
		for(int i=0; i<countArr.length; i++) {
			if(maxCount < countArr[i]) {
				maxCount = countArr[i];
				ans = i;
			}
		}
		
		System.out.print(ans);
	}

}
